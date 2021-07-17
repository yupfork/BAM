package com.service;

import com.bean.Department;
import com.dao.DepartmentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class DepartmentService {

    private DepartmentDao departmentDao;

    @Autowired
    public DepartmentService(DepartmentDao departmentDao) {
        this.departmentDao = departmentDao;
    }

    public DepartmentService() {

    }

    public ArrayList findByLevel(Integer integer){
        return departmentDao.findByLevel(integer);
    }

    public ArrayList findAll(){
        return departmentDao.findAll();
    }

    public Department findDepartmentByDepartmentName(String string){
        return departmentDao.findDepartmentByDepartmentName(string);
    }

    public String findDepartmentNoByDepartmentName(String string){
        return departmentDao.findDepartmentNoByDepartmentName(string);
    }

    public Department findDepartmentByDepartmentNo(String string){
        return  departmentDao.findDepartmentByDepartmentNo(string);
    }
}
