package com.service;

import com.bean.User;
import com.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

@Component
public class UserService {

    private UserDao userDao;

    @Autowired
    public UserService(UserDao userDao) {
        this.userDao = userDao;
    }

    //根据工号和密码查询用户
    public User findByEmpNoAndPassword(Integer EmpNo,String passWord){
        return userDao.findUserByEmpNoAndPassword(EmpNo,passWord);
    };

    public List findAll(){
        return userDao.findAll();
    };

    //根据部门No查询员工信息
    public List findByDepartmentNo(String string ){
        return userDao.findByDepartmentNo(string);
    }

    //根据EmpNo查询员工
    public List findUserByEmpNo(Integer integer){ return userDao.findUserByEmpNo(integer); }

    //添加员工
    public void saveUser(String name, Integer empNo, String password, String permission, String departmentNo, String Email, String remark, Date createDate){
         userDao.saveUser(name, empNo, password,  permission, departmentNo, Email, remark, createDate);
    }

    public void deleteAllByEmpNo(Integer integer){  userDao.deleteAllByEmpNo(integer);}
}
