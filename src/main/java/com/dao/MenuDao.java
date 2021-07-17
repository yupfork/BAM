package com.dao;

import com.bean.Menu;
import com.bean.Operation;
import com.bean.Permission_menu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MenuDao extends JpaRepository<Menu,Integer> {

    @Query(value = "select menu_name,operation_id from menu ",nativeQuery = true)
    List<Menu> findAll();

    @Query(value = "select menu_id from permission_menu where permission_id = ?1 ",nativeQuery = true)
    List findAllByMenuId(Integer integer);

    @Query(value ="select menu_name from menu where menu_id in (select menu_id from permission_menu where  permission_id = (select permission_id from permission where permission_name = ?1))",nativeQuery = true)
    List searchPermission_menu(String  s);


    /**
     * 查询Operation 由 菜单表 & 操作表的中间表 （菜单编号 --<中间表> -->操作编号 --<操作表>--> 操作名称）
     * @param integer
     * @return
     */
    @Query(value="select new com.bean.Operation (o.operationId,o.operationName) from operation o where o.operationId in (select m.operationId from menu_operation m where m.menuId = ?1)")
    List<Operation> searchOperation(Integer integer);





}
