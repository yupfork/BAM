package com.dao;

import com.bean.Permission;
import com.bean.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface RoleDao extends JpaRepository<Role,Integer> {

    //根据用户编号查询角色编号
    @Query(value = "select role_id from user_role where user_id = ?1",nativeQuery = true)
    Integer searchRole(Integer integer);

    @Query(value = "select new com.bean.Permission(p.permissionId,p.permissionName) from permission p where p.permissionId in (select r.permissionId from role_permission r where r.roleId =?1 )")
    List<Permission> searchPermission(Integer integer);

    @Query(value = " select permission_name from permission where permission_id = ?1",nativeQuery = true)
    String searchPermissionName(Integer integer);

    @Query(value = "select permission_id,menu_id,operation_id from role_permission where role_id = ?1",nativeQuery = true)
    List searchRolePermission();

}
