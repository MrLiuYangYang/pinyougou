app.controller('brandController',function($scope,$http,brandService,$controller){
    
	$controller('baseController',{$scope:$scope});//继承
	
	//查询品牌列表
    	$scope.findAll=function(){
    		brandService.findll().success(
    		function(response){
    			$scope.list=response;
    		  }		
    		);
    	}
    	
    	
       
         //分页
         $scope.findPage=function(page,size){
        	 brandService.findPage(page,size).success(
        	   function(response){
        		   $scope.list=response.rows;//显示当前页面
        		   $scope.paginationConf.totalItems=response.total;//更新总记录数
        	   }		 
        	 );
         }
         
         //新增
         $scope.save=function(){
        	 var objeck=null;
        	 if($scope.entity.id!=null){//如果有ID
        		 objeck=brandService.update($scope.entity);
        	 }else{
        		 objeck=brandService.add($scope.entity);
        	 }
        	 objeck.success(
        	    function(response){
        	    	if(response.success){//如果成功
        	    		//重新查询
        	    		$scope.reloadList(); //重新加载
        	    	}else{
        	    		alert(response.message);//提示错误
        	    	}
        	    }		 
        	 );
        	 	 
         }
         
         //查询实体类
         $scope.findOne=function(id){
        	 brandService.findOne().success(
        	  function(response){
        		  $scope.entity=response;
        	  }		 
        	 );
         }
         
      
         
       
         
         //批量删除
         $scope.dele=function(){
        	 //获取选中的复选框
        	brandService.dele($scope.selectIds).success(
        			 function(response){
        				 if(response.success){
        				 $scope.reloadList();//刷新列表
        		  }
        	  }		 
        	 );
         }
         
         $scope.searchEntity={};//定义搜索对象
       //条件查询
       $scope.search=function(page,rows){
      brandService.search(page,rows,$scope.searchEntity).success(
         
    	 function(response){
    			   $scope.paginationConf.totalItems=response.total;//总记录数
    			   $scope.list=response.rows;//给列表变量赋值
    		}
    		);
         }
         
    });
          
