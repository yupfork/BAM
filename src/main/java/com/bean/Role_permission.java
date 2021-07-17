package com.bean;

import javax.persistence.*;

@Entity(name="role_permission")
public class Role_permission {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    private Integer roleId;
    private Integer permissionId;
    private Integer menuId;
    private Integer operationId;

    public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }


    public Integer getOperationId() {
        return operationId;
    }

    public void setOperationId(Integer operationId) {
        this.operationId = operationId;
    }

    public Role_permission(Integer id, Integer roleId, Integer permissionId, Integer menuId, Integer operationId) {
        this.id = id;
        this.roleId = roleId;
        this.permissionId = permissionId;
        this.menuId = menuId;
        this.operationId = operationId;
    }

    public Role_permission() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(Integer permissionId) {
        this.permissionId = permissionId;
    }
}
