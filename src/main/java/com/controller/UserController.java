package com.controller;

import com.bean.Menu;
import com.bean.Page;
import com.bean.Permission;
import com.bean.Role;
import com.dao.RoleDao;
import com.service.DepartmentService;
import com.service.MenuService;
import com.service.PermissionService;
import com.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.*;
import java.util.stream.Collectors;

@ResponseBody
@RestController
public class UserController {

    private UserService userService;
    private DepartmentService departmentService;
    private RoleDao roleDao;
    private PermissionService permissionService;
    private MenuService menuService;

    public UserController(UserService userService, DepartmentService departmentService, RoleDao roleDao, PermissionService permissionService, MenuService menuService) {
        this.userService = userService;
        this.departmentService = departmentService;
        this.roleDao = roleDao;
        this.permissionService = permissionService;
        this.menuService = menuService;
    }


    @CrossOrigin
    @GetMapping("/add")
    public List addUser() {
        List list = userService.findAll();
        System.out.println(list);
        return list;
    }

    @CrossOrigin
    @GetMapping("/searchUser")
    public HashMap searchUser(String name, Integer total, Integer currentPage, Integer findNo) {

        HashMap hashMap = new HashMap();
        List list = new ArrayList();
        System.out.println(findNo);
        if (findNo == 502) {
            String departmentNo = departmentService.findDepartmentNoByDepartmentName(name);
            list = userService.findByDepartmentNo(departmentNo);
        } else {
            if (userService.findUserByEmpNo(findNo) == null) {
                list.add("null");
                System.out.println(list);
            } else {
                list = userService.findUserByEmpNo(findNo);
            }
        }
        int star = total * currentPage;
        int end, totalPage;
        if ((star + total) > list.size()) {
            end = list.size();
        } else {
            end = star + total;
        }

        if (list.size() % total == 0) {
            totalPage = list.size() / total;
        } else {
            totalPage = list.size() / total + 1;
        }

        List finalList = list.subList(star, end);
        Page page = new Page();
        page.setTotalPage(totalPage);
        page.setTotal(total);
        page.setCurrentPage(currentPage);

        hashMap.put("list", finalList);
        hashMap.put("page", page);
        System.out.println(hashMap);
        return hashMap;
    }

    @CrossOrigin
    @GetMapping("/delUser")
    public void delUser(int delNo) {
        userService.deleteAllByEmpNo(delNo);
    }


    @CrossOrigin
    @GetMapping("/saveUser")
    public void saveUser(String name, String user, String departName, String email, String remark) {
        //创建时间为默认的现在时间
        Date date = new Date();
        //初始密码6个8
        String password = "888888";
        int No = Integer.parseInt(user);
        String departNo = departmentService.findDepartmentByDepartmentName(departName).getDepartmentNo();
        userService.saveUser(name, No, password, "生产管理,库存管理,生产设置,基础信息,报表管理,系统管理", departNo, email, remark, date);
    }


    //登录判断
    @CrossOrigin
    @GetMapping("/login")
    public Boolean login(Integer userName, String password) {
        System.out.println(userName);
        System.out.println(password);
        if (userService.findByEmpNoAndPassword(userName, password) != null) {
            return true;
        } else {
            return false;
        }
    }

    @CrossOrigin
    @GetMapping("/getStore")
    public HashMap getStore(Integer userName) {
        System.out.println(userName);
        HashMap mapMenu = new HashMap();
        HashMap map = new HashMap();
        Integer role_id = roleDao.searchRole(userName);
        List<Permission> permission = roleDao.searchPermission(role_id);
        List permission_name = permission.stream().map(Permission::getPermissionName).collect(Collectors.toList());
        map.put("person", permission_name);

        /**
         * 列表导航 -->{permissionName:{List<Menu>}}
         */
        List<Permission> listPer = permissionService.searchPermission();
        List list_permission = listPer.stream().map(Permission::getPermissionName).collect(Collectors.toList());
        for (int a = 0; a < listPer.size(); a++) {
            Integer permission_id = listPer.get(a).getPermissionId();
            String permission_names = listPer.get(a).getPermissionName();
            List<Menu> listMenu = permissionService.searchMenu(permission_id);
            mapMenu.put(permission_names, listMenu);
        }
        map.put("role", mapMenu);
        map.put("permission", list_permission);
        return map;

    }
}
