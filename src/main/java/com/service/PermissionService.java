package com.service;

import com.bean.Menu;
import com.bean.Permission;
import com.bean.Permission_menu;
import com.dao.PermissionDao;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PermissionService {
    private PermissionDao permissionDao;

    public PermissionService(PermissionDao permissionDao) {
        this.permissionDao = permissionDao;
    }

    public List<Permission> searchPermission(){
        return permissionDao.searchPermission();
    }

    public List<Menu> searchMenu(Integer integer){
        return permissionDao.searchMenu(integer);
    }
}
