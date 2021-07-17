package com.dao;

import com.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;

public interface UserDao extends JpaRepository<User,Integer> {
    //根据工号和密码查询用户
    User findUserByEmpNoAndPassword(Integer EmpNo,String password);

    //查询所有用户信息
    @Query(value = "select * from s_user",nativeQuery = true)
    List findAll();

    //根据部门No查询员工信息
    List findByDepartmentNo(String string);

    //根据员工No查询员工信息
    List findUserByEmpNo(Integer EmpNo);

    //添加员工
    @Modifying
    @Transactional
    @Query(value = "insert into s_user (name,emp_no,password,permission,department_no,Email,remark,create_date) values (?1,?2,?3,?4,?5,?6,?7,?8)",nativeQuery = true)
    void saveUser(String name, Integer empNo, String password, String permission, String departmentNo, String Email, String remark, Date createDate);

    @Transactional
    void deleteAllByEmpNo(Integer EmpNo);


}
