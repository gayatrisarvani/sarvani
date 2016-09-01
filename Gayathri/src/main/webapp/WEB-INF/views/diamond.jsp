<%@ include file="header.jsp" %>
<body style="background-color:#F0E68C">
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
    <th>ItemId</th>
    <th>ItemName</th>
    <th>Description</th>
    <th>Category</th>
    <th>Price</th>
    <th>Images</th>
    <th>Cart</th>
    </tr>
        <tr ng-repeat="resource in names | filter:search">
             <td>{{resource.itemId}}</td>
            <td>{{ resource.itemName}}</td>
            <td>{{ resource.description}}</td>
            <td>{{ resource.category}}</td>
            <td>{{ resource.price}}</td>
            <td><img src="resources/images/{{resource.itemId}}.jpg" style="width: 100px;height:100px"></td>
            <td><a href="login">Add to Cart</a></td>
        </tr>    
    </table>
</div>

<script>
angular.module('myApp',[]).controller('dataCtrl',function($scope)
		{
	
		$scope.names=${da};
		$scope.orderByMe=function(x)
		{
			$scope.myOrderBy=x;
			}
		});
</script>
</body>
</html>
