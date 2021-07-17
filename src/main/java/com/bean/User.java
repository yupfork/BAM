package com.bean;

import org.hibernate.annotations.Proxy;

import javax.persistence.*;
import java.sql.Date;

/**
 *该类:记录用户的基本信息
 * id           :用户标识      主键，自增
 * userName     :员工名称
 * EmpNo        : 工号     系统登入用户名  ，不该为空
 * passWord     : 密码     系统登入密码  ，可为空设置默认密码
 * permissionID : 权限编号     控制进入主页所拥有的权限列表
 * departmentNo : 部门编号
 * email        :邮箱
 * remark       :备注
 * createDate   :创建时间
 *
 *
 *-------------------提示------------------
 * 1.创建用户时，应该给默认密码。
 *
 *
 */

@Proxy(lazy = false)
@Entity(name="user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String userName;
    @Column(nullable = false)
    private Integer empNo;
    private String  password;
    private Integer permissionId;
    private String departmentNo;
    private String email;
    private String remark;
    private Date createDate;

    public User() {
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(Integer permissionId) {
        this.permissionId = permissionId;
    }

    public User(Integer id, String userName, Integer empNo, String password, Integer permissionId, String departmentNo, String email, String remark, Date createDate) {
        this.id = id;
        this.userName = userName;
        this.empNo = empNo;
        this.password = password;
        this.permissionId = permissionId;
        this.departmentNo = departmentNo;
        this.email = email;
        this.remark = remark;
        this.createDate = createDate;
    }

    public String getDepartmentNo() {
        return departmentNo;
    }

    public void setDepartmentNo(String departmentNo) {
        this.departmentNo = departmentNo;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }



    public Integer getEmpNo() {
        return empNo;
    }

    public void setEmpNo(Integer empNo) {
        this.empNo = empNo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }




    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}
