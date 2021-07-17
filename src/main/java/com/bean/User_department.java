package com.bean;

import org.hibernate.annotations.Proxy;

import javax.persistence.*;

@Proxy(lazy = false)
@Entity(name="user_dep")
public class User_department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    private Integer empNo;
    @Column(nullable = false)
    private Integer departmentNo;

    public User_department() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDepartmentNo() {
        return departmentNo;
    }

    public void setDepartmentNo(Integer departmentNo) {
        this.departmentNo = departmentNo;
    }

    public User_department(Integer id, Integer empNo, Integer departmentNo) {
        this.id = id;
        this.empNo = empNo;
        this.departmentNo = departmentNo;
    }

    public Integer getEmpNo() {
        return empNo;
    }

    public void setEmpNo(Integer empNo) {
        this.empNo = empNo;
    }

    public Integer getDepartment() {
        return departmentNo;
    }

    public void setDepartment(Integer department) {
        this.departmentNo = department;
    }
}
