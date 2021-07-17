package com.dao;

import com.bean.Menu;
import com.bean.Permission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PermissionDao extends JpaRepository<Permission,Integer> {

    //查询所有
    @Query(value = "select permission_id,permission_name from permission",nativeQuery = true)
    List<Permission> searchPermission();

    @Query(value = "select new com.bean.Menu(m.menuId,m.menuName)" +
            " from menu m where m.menuId in (select  p_m.menuId from permission_menu p_m where p_m.permissionId = ?1)")
    List<Menu> searchMenu(Integer integer);



//    //查询所有数据（包含下级）
//    @Query(value = " select ",nativeQuery = true)
//    List searchAllData();
}
