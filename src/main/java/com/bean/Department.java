package com.bean;


import org.hibernate.annotations.Proxy;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.*;
import java.sql.Date;

/**
 * id               : 标记使用
 * departmentNo     : 部门编号
 * departmentName   : 部门名称
 * level            : 部门等级
 * createDate       : 创建时间
 * nextMenu         :下级菜单
 */

@Proxy(lazy = false)
@Entity(name = "s_department")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String departmentNo;
    private String departmentName;
    private Integer level;
    private Date createDate;
    private String nextMenu;


    public Department() {
    }

    public Department(Integer id, String departmentNo, String departmentName, Integer level, Date createDate, String nextMenu) {
        this.id = id;
        this.departmentNo = departmentNo;
        this.departmentName = departmentName;
        this.level = level;
        this.createDate = createDate;
        this.nextMenu = nextMenu;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDepartmentNo() {
        return departmentNo;
    }

    public void setDepartmentNo(String departmentNo) {
        this.departmentNo = departmentNo;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getNextMenu() {
        return nextMenu;
    }

    public void setNextMenu(String nextMenu) {
        this.nextMenu = nextMenu;
    }
}
