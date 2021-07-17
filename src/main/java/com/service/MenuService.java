package com.service;

import com.bean.Menu;
import com.bean.Operation;
import com.dao.MenuDao;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MenuService {
    private MenuDao menuDao;

    public MenuService(MenuDao menuDao) {
        this.menuDao = menuDao;
    }

    public List<Menu> findAll(){
        return menuDao.findAll();
    }

    public List findAllByMenuId(Integer integer){
        return menuDao.findAllByMenuId(integer);
    }

    public List searchPermission_menu(String s){ return  menuDao.searchPermission_menu(s);}


    //查询Operation

    public List<Operation> searchOperation(Integer integer){ return  menuDao.searchOperation(integer);}

}
