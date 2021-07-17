public class cache {

    /**
     * 用户权限分配map -->{permissionName:{menuName:[operationName]}}
     */
//        HashMap mapMenu = new HashMap();
//        List<Permission> listPer = permissionService.searchPermission();
//        for(int a= 0;a<listPer.size();a++){
//            HashMap mapOperation = new HashMap();
//            Integer permission_id = listPer.get(a).getPermissionId();
//            String permission_name = listPer.get(a).getPermissionName();
//            List<Menu> listMenu =  permissionService.searchMenu(permission_id);
//            for(int b =0;b<listMenu.size();b++){
//                String listMenu_name = listMenu.get(b).getMenuName();
//                Integer listMenu_id = listMenu.get(b).getMenuId();
//                List<Operation> listOperation = menuService.searchOperation(listMenu_id);
//                List listOperation_name = listOperation.stream().map(Operation::getOperationName).collect(Collectors.toList());
//                mapOperation.put(listMenu_name,listOperation_name);
//                mapMenu.put(permission_name,mapOperation);
//            }
//
//        }
}
