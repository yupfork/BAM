package com.controller;

import com.bean.Menu;
import com.bean.Permission;
import com.service.MenuService;
import com.service.PermissionService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

@ResponseBody
@RestController
public class MenuController {
    private MenuService menuService;
    private PermissionService permissionService;

    public MenuController(MenuService menuService, PermissionService permissionService) {
        this.menuService = menuService;
        this.permissionService = permissionService;
    }


    /**permissionService.findAll()-------->查询所有的权限集合------>转换成权限名集合permissionList
     * menuService.searchPermission------>根据权限名-->权限Id-->菜单Id-->菜单名
     * @return hashMap-->(权限名，菜单集合)
     */
    @CrossOrigin
    @GetMapping("/getMenu")
    public HashMap getMenu(){
        HashMap hashMap = new HashMap();
        List<Permission> permissionList = permissionService.searchPermission();
        List permissionName = permissionList.stream().map(Permission::getPermissionName).collect(Collectors.toList());
        for(int i=0;i<permissionList.size();i++){
            List menuName =menuService.searchPermission_menu(permissionName.get(i).toString());
            hashMap.put(permissionName.get(i),menuName);
        }
        return hashMap;
    }
}
