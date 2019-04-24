app.controller('baseController',function($scope){
	//分页控件配置
   	$scope.paginationConf ={
			   	 currentPage:1,
			   	 totalItems:10,
			   	 itemsPerPage:10,
			   	 perPageOptions:[10,20,30,40,50],
			   	 onChange:function(){
			   	 $scope.reloadList();
 			   }
    };
   	
    //重新加载列表 数据
    
   	$scope.reloadList=function(){
   		$scope.search( $scope.paginationConf.currentPage,$scope.paginationConf.itemsPerPage);
   		}
   
    $scope.selectIds=[];//选中的ID集合
    //更行复选框
    $scope.updateSelection=function($event,id){
   	 if($event.target.checked){
   		 $scope.selectIds.push(id); //push向集合添加元素
   	 }else{ 
   		 var idx = $scope.selectIds.indexOf(id);
   		 $scope.selectIds.splice(idx, 1);//删除
   	 }
    }
   	
$scope.jsonToString=function(jsonString,key){
		
		var json= JSON.parse(jsonString);
		var value="";
		
		for(var i=0;i<json.length;i++){
			if(i>0){
				value+=",";
			}			
			value +=json[i][key];			
		}
				
		return value;
	}
	
});