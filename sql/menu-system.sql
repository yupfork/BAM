insert into permission(permission_name)value('生产管理');
insert into permission(permission_name)value('库存管理');
insert into permission(permission_name)value('生产设置');
insert into permission(permission_name)value('基础信息');
insert into permission(permission_name)value('报表管理');
insert into permission(permission_name)value('系统管理');


insert into menu(menu_name)value('生产计划');
insert into menu(menu_name)value('未派工计划');
insert into menu(menu_name)value('生产派工单');
insert into menu(menu_name)value('未包装配工单');
insert into menu(menu_name)value('领料单');
insert into menu(menu_name)value('生产包装单');
insert into menu(menu_name)value('外观检验');
insert into menu(menu_name)value('染判检验');
insert into menu(menu_name)value('产量登记');
insert into menu(menu_name)value('生产检验单');
insert into menu(menu_name)value('外观检验单');
insert into menu(menu_name)value('外观检验明细');
insert into menu(menu_name)value('染判检验明细');
insert into menu(menu_name)value('磅位统计');
insert into menu(menu_name)value('平衡仓入库单');
insert into menu(menu_name)value('未入库包装单');
insert into menu(menu_name)value('退库管理');
insert into menu(menu_name)value('成品仓入库单');
insert into menu(menu_name)value('备料单');
insert into menu(menu_name)value('领料明细');
insert into menu(menu_name)value('领料出库');
insert into menu(menu_name)value('退料单');
insert into menu(menu_name)value('库存关账');
insert into menu(menu_name)value('丝车打印');
insert into menu(menu_name)value('机台管理');
insert into menu(menu_name)value('参数设置');
insert into menu(menu_name)value('客户管理');
insert into menu(menu_name)value('供应商管理');
insert into menu(menu_name)value('物料管理');
insert into menu(menu_name)value('BOM表管理');
insert into menu(menu_name)value('仓库管理');
insert into menu(menu_name)value('库位管理');
insert into menu(menu_name)value('客户分类');
insert into menu(menu_name)value('物料分类');
insert into menu(menu_name)value('计量单位');
insert into menu(menu_name)value('等级管理');
insert into menu(menu_name)value('派工单报表');
insert into menu(menu_name)value('生产报表');
insert into menu(menu_name)value('报表中心');
insert into menu(menu_name)value('FDY外观检验明细表');
insert into menu(menu_name)value('平衡仓库流水账');
insert into menu(menu_name)value('平衡车间库存量');
insert into menu(menu_name)value('加弹单机月汇总表');
insert into menu(menu_name)value('加弹车间单机日报表');
insert into menu(menu_name)value('加弹生产日报表产量');
insert into menu(menu_name)value('用户管理');
insert into menu(menu_name)value('部门管理');
insert into menu(menu_name)value('角色管理');
insert into menu(menu_name)value('销售出库单');



insert into permission_menu(permission_id,menu_id)value(1,1);
insert into permission_menu(permission_id,menu_id)value(1,2);
insert into permission_menu(permission_id,menu_id)value(1,3);
insert into permission_menu(permission_id,menu_id)value(1,4);
insert into permission_menu(permission_id,menu_id)value(1,5);
insert into permission_menu(permission_id,menu_id)value(1,6);
insert into permission_menu(permission_id,menu_id)value(1,7);
insert into permission_menu(permission_id,menu_id)value(1,8);
insert into permission_menu(permission_id,menu_id)value(1,9);
insert into permission_menu(permission_id,menu_id)value(1,10);
insert into permission_menu(permission_id,menu_id)value(1,11);
insert into permission_menu(permission_id,menu_id)value(1,12);
insert into permission_menu(permission_id,menu_id)value(1,13);
insert into permission_menu(permission_id,menu_id)value(1,14);
insert into permission_menu(permission_id,menu_id)value(2,15);
insert into permission_menu(permission_id,menu_id)value(2,16);
insert into permission_menu(permission_id,menu_id)value(2,17);
insert into permission_menu(permission_id,menu_id)value(2,18);
insert into permission_menu(permission_id,menu_id)value(2,19);
insert into permission_menu(permission_id,menu_id)value(2,20);
insert into permission_menu(permission_id,menu_id)value(2,21);
insert into permission_menu(permission_id,menu_id)value(2,22);
insert into permission_menu(permission_id,menu_id)value(2,23);
insert into permission_menu(permission_id,menu_id)value(3,24);
insert into permission_menu(permission_id,menu_id)value(3,25);
insert into permission_menu(permission_id,menu_id)value(3,26);
insert into permission_menu(permission_id,menu_id)value(4,27);
insert into permission_menu(permission_id,menu_id)value(4,28);
insert into permission_menu(permission_id,menu_id)value(4,29);
insert into permission_menu(permission_id,menu_id)value(4,30);
insert into permission_menu(permission_id,menu_id)value(4,31);
insert into permission_menu(permission_id,menu_id)value(4,32);
insert into permission_menu(permission_id,menu_id)value(4,33);
insert into permission_menu(permission_id,menu_id)value(4,34);
insert into permission_menu(permission_id,menu_id)value(4,35);
insert into permission_menu(permission_id,menu_id)value(4,36);
insert into permission_menu(permission_id,menu_id)value(5,37);
insert into permission_menu(permission_id,menu_id)value(5,38);
insert into permission_menu(permission_id,menu_id)value(5,39);
insert into permission_menu(permission_id,menu_id)value(5,40);
insert into permission_menu(permission_id,menu_id)value(5,41);
insert into permission_menu(permission_id,menu_id)value(5,42);
insert into permission_menu(permission_id,menu_id)value(5,43);
insert into permission_menu(permission_id,menu_id)value(5,44);
insert into permission_menu(permission_id,menu_id)value(5,45);
insert into permission_menu(permission_id,menu_id)value(6,46);
insert into permission_menu(permission_id,menu_id)value(6,47);
insert into permission_menu(permission_id,menu_id)value(6,48);
insert into permission_menu(permission_id,menu_id)value(2,49);


insert into operation(operation_name) value('新建');
insert into operation(operation_name) value('编辑');
insert into operation(operation_name) value('删除');
insert into operation(operation_name) value('保存');
insert into operation(operation_name) value('删除用户角色关联');
insert into operation(operation_name) value('添加用户角色关联');
insert into operation(operation_name) value('反审');
insert into operation(operation_name) value('审核');
insert into operation(operation_name) value('导出');
insert into operation(operation_name) value('包装');

insert into operation(operation_name) value('批量添加包装明细');
insert into operation(operation_name) value('备料');
insert into operation(operation_name) value('生成领料单');
insert into operation(operation_name) value('完工');
insert into operation(operation_name) value('返工');
insert into operation(operation_name) value('是否包装');
insert into operation(operation_name) value('落纱');
insert into operation(operation_name) value('结批');
insert into operation(operation_name) value('改量');
insert into operation(operation_name) value('派工');

insert into operation(operation_name) value('配工');
insert into operation(operation_name) value('打印');
insert into operation(operation_name) value('导入包装单');
insert into operation(operation_name) value('入库');
insert into operation(operation_name)value('领料');
insert into operation(operation_name)value('导入');


insert into menu_operation(menu_id,operation_id) value(1,1);
insert into menu_operation(menu_id,operation_id) value(1,2);
insert into menu_operation(menu_id,operation_id) value(1,3);
insert into menu_operation(menu_id,operation_id) value(1,4);
insert into menu_operation(menu_id,operation_id) value(1,7);
insert into menu_operation(menu_id,operation_id) value(1,8);
insert into menu_operation(menu_id,operation_id) value(1,15);
insert into menu_operation(menu_id,operation_id) value(1,18);
insert into menu_operation(menu_id,operation_id) value(1,19);
insert into menu_operation(menu_id,operation_id) value(1,20);
insert into menu_operation(menu_id,operation_id) value(2,21);
insert into menu_operation(menu_id,operation_id) value(3,1);
insert into menu_operation(menu_id,operation_id) value(3,2);
insert into menu_operation(menu_id,operation_id) value(3,3);
insert into menu_operation(menu_id,operation_id) value(3,4);
insert into menu_operation(menu_id,operation_id) value(3,7);
insert into menu_operation(menu_id,operation_id) value(3,8);
insert into menu_operation(menu_id,operation_id) value(3,9);
insert into menu_operation(menu_id,operation_id) value(3,12);
insert into menu_operation(menu_id,operation_id) value(3,13);
insert into menu_operation(menu_id,operation_id) value(3,14);
insert into menu_operation(menu_id,operation_id) value(3,15);
insert into menu_operation(menu_id,operation_id) value(3,16);
insert into menu_operation(menu_id,operation_id) value(3,17);
insert into menu_operation(menu_id,operation_id) value(3,25);
insert into menu_operation(menu_id,operation_id) value(4,1);
insert into menu_operation(menu_id,operation_id) value(4,2);
insert into menu_operation(menu_id,operation_id) value(4,3);
insert into menu_operation(menu_id,operation_id) value(4,4);
insert into menu_operation(menu_id,operation_id) value(4,10);
insert into menu_operation(menu_id,operation_id) value(5,1);
insert into menu_operation(menu_id,operation_id) value(5,2);
insert into menu_operation(menu_id,operation_id) value(5,3);
insert into menu_operation(menu_id,operation_id) value(5,4);
insert into menu_operation(menu_id,operation_id) value(5,7);
insert into menu_operation(menu_id,operation_id) value(5,8);
insert into menu_operation(menu_id,operation_id) value(6,1);
insert into menu_operation(menu_id,operation_id) value(6,2);
insert into menu_operation(menu_id,operation_id) value(6,3);
insert into menu_operation(menu_id,operation_id) value(6,4);
insert into menu_operation(menu_id,operation_id) value(6,7);
insert into menu_operation(menu_id,operation_id) value(6,8);
insert into menu_operation(menu_id,operation_id) value(7,1);
insert into menu_operation(menu_id,operation_id) value(7,2);
insert into menu_operation(menu_id,operation_id) value(7,3);
insert into menu_operation(menu_id,operation_id) value(7,4);
insert into menu_operation(menu_id,operation_id) value(7,7);
insert into menu_operation(menu_id,operation_id) value(7,8);
insert into menu_operation(menu_id,operation_id) value(8,1);
insert into menu_operation(menu_id,operation_id) value(8,2);
insert into menu_operation(menu_id,operation_id) value(8,3);
insert into menu_operation(menu_id,operation_id) value(8,4);
insert into menu_operation(menu_id,operation_id) value(8,7);
insert into menu_operation(menu_id,operation_id) value(8,8);
insert into menu_operation(menu_id,operation_id) value(9,1);
insert into menu_operation(menu_id,operation_id) value(9,2);
insert into menu_operation(menu_id,operation_id) value(9,3);
insert into menu_operation(menu_id,operation_id) value(9,4);
insert into menu_operation(menu_id,operation_id) value(9,7);
insert into menu_operation(menu_id,operation_id) value(9,8);
insert into menu_operation(menu_id,operation_id) value(10,1);
insert into menu_operation(menu_id,operation_id) value(10,2);
insert into menu_operation(menu_id,operation_id) value(10,3);
insert into menu_operation(menu_id,operation_id) value(10,4);
insert into menu_operation(menu_id,operation_id) value(10,7);
insert into menu_operation(menu_id,operation_id) value(10,8);
insert into menu_operation(menu_id,operation_id) value(11,1);
insert into menu_operation(menu_id,operation_id) value(11,2);
insert into menu_operation(menu_id,operation_id) value(11,3);
insert into menu_operation(menu_id,operation_id) value(11,4);
insert into menu_operation(menu_id,operation_id) value(11,7);
insert into menu_operation(menu_id,operation_id) value(11,8);
insert into menu_operation(menu_id,operation_id) value(12,1);
insert into menu_operation(menu_id,operation_id) value(12,2);
insert into menu_operation(menu_id,operation_id) value(12,4);
insert into menu_operation(menu_id,operation_id) value(12,7);
insert into menu_operation(menu_id,operation_id) value(12,8);
insert into menu_operation(menu_id,operation_id) value(13,1);
insert into menu_operation(menu_id,operation_id) value(13,2);
insert into menu_operation(menu_id,operation_id) value(13,4);
insert into menu_operation(menu_id,operation_id) value(13,7);
insert into menu_operation(menu_id,operation_id) value(13,8);
insert into menu_operation(menu_id,operation_id) value(14,2);
insert into menu_operation(menu_id,operation_id) value(14,9);
insert into menu_operation(menu_id,operation_id) value(15,1);
insert into menu_operation(menu_id,operation_id) value(15,2);
insert into menu_operation(menu_id,operation_id) value(15,3);
insert into menu_operation(menu_id,operation_id) value(15,4);
insert into menu_operation(menu_id,operation_id) value(15,7);
insert into menu_operation(menu_id,operation_id) value(15,8);
insert into menu_operation(menu_id,operation_id) value(16,1);
insert into menu_operation(menu_id,operation_id) value(16,2);
insert into menu_operation(menu_id,operation_id) value(16,3);
insert into menu_operation(menu_id,operation_id) value(16,4);
insert into menu_operation(menu_id,operation_id) value(16,24);
insert into menu_operation(menu_id,operation_id) value(17,1);
insert into menu_operation(menu_id,operation_id) value(17,2);
insert into menu_operation(menu_id,operation_id) value(17,3);
insert into menu_operation(menu_id,operation_id) value(17,4);
insert into menu_operation(menu_id,operation_id) value(17,7);
insert into menu_operation(menu_id,operation_id) value(17,8);
insert into menu_operation(menu_id,operation_id) value(18,1);
insert into menu_operation(menu_id,operation_id) value(18,2);
insert into menu_operation(menu_id,operation_id) value(18,3);
insert into menu_operation(menu_id,operation_id) value(18,4);
insert into menu_operation(menu_id,operation_id) value(18,7);
insert into menu_operation(menu_id,operation_id) value(18,8);
insert into menu_operation(menu_id,operation_id) value(18,13);
insert into menu_operation(menu_id,operation_id) value(18,22);
insert into menu_operation(menu_id,operation_id) value(18,23);
insert into menu_operation(menu_id,operation_id) value(19,1);
insert into menu_operation(menu_id,operation_id) value(19,2);
insert into menu_operation(menu_id,operation_id) value(19,3);
insert into menu_operation(menu_id,operation_id) value(19,4);
insert into menu_operation(menu_id,operation_id) value(19,7);
insert into menu_operation(menu_id,operation_id) value(19,8);
insert into menu_operation(menu_id,operation_id) value(19,25);
insert into menu_operation(menu_id,operation_id) value(20,1);
insert into menu_operation(menu_id,operation_id) value(20,2);
insert into menu_operation(menu_id,operation_id) value(20,4);
insert into menu_operation(menu_id,operation_id) value(20,7);
insert into menu_operation(menu_id,operation_id) value(20,8);
insert into menu_operation(menu_id,operation_id) value(21,1);
insert into menu_operation(menu_id,operation_id) value(21,2);
insert into menu_operation(menu_id,operation_id) value(21,3);
insert into menu_operation(menu_id,operation_id) value(21,4);
insert into menu_operation(menu_id,operation_id) value(21,7);
insert into menu_operation(menu_id,operation_id) value(21,8);
insert into menu_operation(menu_id,operation_id) value(22,1);
insert into menu_operation(menu_id,operation_id) value(22,2);
insert into menu_operation(menu_id,operation_id) value(22,3);
insert into menu_operation(menu_id,operation_id) value(22,4);
insert into menu_operation(menu_id,operation_id) value(22,7);
insert into menu_operation(menu_id,operation_id) value(22,8);
insert into menu_operation(menu_id,operation_id) value(23,2);
insert into menu_operation(menu_id,operation_id) value(23,4);
insert into menu_operation(menu_id,operation_id) value(25,1);
insert into menu_operation(menu_id,operation_id) value(25,2);
insert into menu_operation(menu_id,operation_id) value(25,3);
insert into menu_operation(menu_id,operation_id) value(25,4);
insert into menu_operation(menu_id,operation_id) value(26,1);
insert into menu_operation(menu_id,operation_id) value(26,2);
insert into menu_operation(menu_id,operation_id) value(26,3);
insert into menu_operation(menu_id,operation_id) value(26,4);
insert into menu_operation(menu_id,operation_id) value(27,1);
insert into menu_operation(menu_id,operation_id) value(27,2);
insert into menu_operation(menu_id,operation_id) value(27,3);
insert into menu_operation(menu_id,operation_id) value(27,4);
insert into menu_operation(menu_id,operation_id) value(28,1);
insert into menu_operation(menu_id,operation_id) value(28,2);
insert into menu_operation(menu_id,operation_id) value(28,3);
insert into menu_operation(menu_id,operation_id) value(28,4);
insert into menu_operation(menu_id,operation_id) value(29,1);
insert into menu_operation(menu_id,operation_id) value(29,2);
insert into menu_operation(menu_id,operation_id) value(29,3);
insert into menu_operation(menu_id,operation_id) value(29,4);
insert into menu_operation(menu_id,operation_id) value(30,1);
insert into menu_operation(menu_id,operation_id) value(30,2);
insert into menu_operation(menu_id,operation_id) value(30,3);
insert into menu_operation(menu_id,operation_id) value(30,4);
insert into menu_operation(menu_id,operation_id) value(31,1);
insert into menu_operation(menu_id,operation_id) value(31,2);
insert into menu_operation(menu_id,operation_id) value(31,3);
insert into menu_operation(menu_id,operation_id) value(31,4);
insert into menu_operation(menu_id,operation_id) value(32,1);
insert into menu_operation(menu_id,operation_id) value(32,2);
insert into menu_operation(menu_id,operation_id) value(32,3);
insert into menu_operation(menu_id,operation_id) value(32,4);
insert into menu_operation(menu_id,operation_id) value(33,1);
insert into menu_operation(menu_id,operation_id) value(33,2);
insert into menu_operation(menu_id,operation_id) value(33,3);
insert into menu_operation(menu_id,operation_id) value(33,4);
insert into menu_operation(menu_id,operation_id) value(34,1);
insert into menu_operation(menu_id,operation_id) value(34,2);
insert into menu_operation(menu_id,operation_id) value(34,3);
insert into menu_operation(menu_id,operation_id) value(34,4);
insert into menu_operation(menu_id,operation_id) value(35,1);
insert into menu_operation(menu_id,operation_id) value(35,2);
insert into menu_operation(menu_id,operation_id) value(35,3);
insert into menu_operation(menu_id,operation_id) value(35,4);
insert into menu_operation(menu_id,operation_id) value(36,1);
insert into menu_operation(menu_id,operation_id) value(36,2);
insert into menu_operation(menu_id,operation_id) value(36,3);
insert into menu_operation(menu_id,operation_id) value(36,4);
insert into menu_operation(menu_id,operation_id) value(46,1);
insert into menu_operation(menu_id,operation_id) value(46,2);
insert into menu_operation(menu_id,operation_id) value(46,3);
insert into menu_operation(menu_id,operation_id) value(46,4);
insert into menu_operation(menu_id,operation_id) value(47,1);
insert into menu_operation(menu_id,operation_id) value(47,2);
insert into menu_operation(menu_id,operation_id) value(47,3);
insert into menu_operation(menu_id,operation_id) value(47,4);
insert into menu_operation(menu_id,operation_id) value(48,1);
insert into menu_operation(menu_id,operation_id) value(48,2);
insert into menu_operation(menu_id,operation_id) value(48,3);
insert into menu_operation(menu_id,operation_id) value(48,4);
insert into menu_operation(menu_id,operation_id) value(48,5);
insert into menu_operation(menu_id,operation_id) value(48,6);
insert into menu_operation(menu_id,operation_id) value(49,1);
insert into menu_operation(menu_id,operation_id) value(49,2);
insert into menu_operation(menu_id,operation_id) value(49,3);
insert into menu_operation(menu_id,operation_id) value(49,4);
insert into menu_operation(menu_id,operation_id) value(49,7);
insert into menu_operation(menu_id,operation_id) value(49,8);
insert into menu_operation(menu_id,operation_id) value(49,26);