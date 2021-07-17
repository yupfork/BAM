package com.controller;

import com.bean.Permission;
import com.service.PermissionService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@ResponseBody
@RestController
public class PermissionController {
    private PermissionService permissionService;

    public PermissionController(PermissionService permissionService) {
        this.permissionService = permissionService;
    }

//    @CrossOrigin
//    @GetMapping("/getPermission")
//    public List getPermission(){
//        List<Permission> list = permissionService.searchPermission();
//        for(int a= 0;a<list.size();a++){
////            Integer menu_id = list.get(a).getMenuId();
//
//        }
//
//
//
//     return  list;
//    }
}
