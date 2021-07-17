package com.bean;

import javax.persistence.*;



/**
 * 数据添加完毕
 */
@Entity(name="permission_menu")
public class Permission_menu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    private Integer permissionId;
    @Column(nullable = false)
    private Integer menuId;

    public Permission_menu(Integer id, Integer permissionId, Integer menuId) {
        this.id = id;
        this.permissionId = permissionId;
        this.menuId = menuId;
    }

    public Permission_menu() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(Integer permissionId) {
        this.permissionId = permissionId;
    }

    public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }
}
