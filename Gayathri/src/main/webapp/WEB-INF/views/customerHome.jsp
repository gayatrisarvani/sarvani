<%@ include file="custheader.jsp" %>
<hr></hr>
 <% 
 response.setHeader("pragma", "no-cache");
 response.setHeader("Cache-control", "no-cache, no-store, must-revalidate");
 response.setHeader("Expires", "0");
 %>
  
<div>
<div class="container">
  <div ng-app="myApp" ng-controller="dataCtrl">
  Data:${ss}
Enter Name <input type="text"  ng-model="search">&nbsp&nbsp<span class="glyphicon glyphicon-search"></span>
    <hr></hr>
    <table class="table table-striped">
    <tr>
    
    <th>itemName</th>
    
    <th>price</th>
    </tr>
        <tr ng-repeat="resource in names | filter:search">
             
            <td>{{ resource.itemName}}</td>
            
            
            <td>{{ resource.price}}</td>
            <td><img src="resources/images/{{resource.itemId}}.jpg" style="width: 100px;height:100px"></td>
            <td>
            <a href="viewSelectedItem?id={{resource.itemId}}">View Product Details</a></td>
            
        </tr>    
    </table>
</div>

<script>
angular.module('myApp',[]).controller('dataCtrl',function($scope)
		{
	
		$scope.names=${listofitems};
		$scope.orderByMe=function(x)
		{
			$scope.myOrderBy=x;
			}
		});
</script>
</body>
</html>
