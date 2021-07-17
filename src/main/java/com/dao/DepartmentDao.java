package com.dao;

import com.bean.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.ArrayList;

public interface DepartmentDao extends JpaRepository<Department,Integer> {

    //按照菜单等级查询
    ArrayList findByLevel(Integer integer);

    ArrayList findAll();

    Department findDepartmentByDepartmentName( String string);

    @Query(value = "select department_no from s_department where department_name = ?1",nativeQuery = true)
    String findDepartmentNoByDepartmentName(String string);


    Department findDepartmentByDepartmentNo(String string);



}
