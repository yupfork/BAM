package com.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;
import java.util.HashMap;

/**
 * roleId   ----->角色编号    作为User表的外键
 * roleName ----->角色名称
 * createDate  -->创建时间
 * remark   ----->备注
 * permissionId-->权限编号
 */
@Entity(name ="role")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer roleId;
    private String  roleName;
    private Date    createDate;
    private String  remark;
    private Integer permissionId;

    public Role(Integer roleId, String roleName, Date createDate, String remark, Integer permissionId) {
        this.roleId = roleId;
        this.roleName = roleName;
        this.createDate = createDate;
        this.remark = remark;
        this.permissionId = permissionId;
    }

    public Role() {
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(Integer permissionId) {
        this.permissionId = permissionId;
    }
}
