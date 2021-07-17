package com.controller;


import com.bean.Department;
import com.bean.Page;
import com.dao.UserDao;
import com.service.DepartmentService;
import com.service.UserService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;
import java.util.stream.Collectors;

@ResponseBody
@RestController
public class DepartmentController {

    private DepartmentService departmentService;
    private UserService userService;

    public DepartmentController(DepartmentService departmentService, UserService userService) {
        this.departmentService = departmentService;
        this.userService = userService;
    }

    /**
     *  params： current 用于临时赋值
     *           allDepartmentName 数据表s_department中字段为getDepartmentName的所有数据
     *           currentObj 用于临时赋值->根据current查找s_department中的数据
     *           nextMenu 将对象currentObj中的nextMenu属性的值分割后所得到的集合。
     *
     *
     *
     *
     * @return   arrayList
     */

    @CrossOrigin
    @GetMapping("/department")
    public ArrayList departmentList() {
        ArrayList<Department> all = departmentService.findAll();
        String current = "";
        List<String> allDepartmentName = all.stream().map(Department::getDepartmentName).collect(Collectors.toList());
        System.out.println(allDepartmentName);
        Department currentObj;
        String[] nextMenu ;
        HashMap hashMap = new HashMap();


        for (int i = 0; i < allDepartmentName.size(); i++) {
            current = allDepartmentName.get(i).toString();

            currentObj = departmentService.findDepartmentByDepartmentName(current);
            if (currentObj == null) {
            } else {
                nextMenu = currentObj.getNextMenu().split(",");
                hashMap.put(current, nextMenu);
            }
        }
        //一级菜单
        ArrayList<Department> one = departmentService.findByLevel(1);
        List<String> oneMenu = one.stream().map(Department::getDepartmentName).collect(Collectors.toList());

        hashMap.put("one",oneMenu);


        ArrayList arrayList = new ArrayList();
        arrayList.add(hashMap);

        return arrayList;

    }

    @CrossOrigin
    @GetMapping("/searchDepartment")
    public HashMap searchDepartment(String name,Integer total,Integer currentPage,Integer findNo){
        HashMap hashMap = new HashMap();



        ArrayList list = new ArrayList();
        if(findNo != 502){
            String departmentNo = departmentService.findDepartmentNoByDepartmentName(name);
            Department department = departmentService.findDepartmentByDepartmentNo(departmentNo);
            list.add(department);
        }else {
            String next_menu = departmentService.findDepartmentByDepartmentName(name).getNextMenu();
            System.out.println(next_menu);
            String[] all_next_menu = next_menu.split(",");
            for (int i = 0; i < all_next_menu.length; i++) {
                Department department = departmentService.findDepartmentByDepartmentName(all_next_menu[i]);
                if(department.getDepartmentNo().equals("")){

                }
                else{
                    list.add(department);
                };
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
        return hashMap;
    }
}
