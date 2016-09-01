
 <% 
 response.setHeader("pragma", "no-cache");
 response.setHeader("Cache-control", "no-cache, no-store, must-revalidate");
 response.setHeader("Expires", "0");
 %>
  <%@ include file="adminheader.jsp" %>
  <br>
  <br>
<div>
<center><img src="resources/images/viewcust.jpg" style="width:500px;height: 300px"></center>
</div>
<div>
<div class="container">
  <div ng-app="myApp" ng-controller="dataCtrl">
  <br>
  <br>
  Data:${ss}
Enter Name/Email ID: <input type="text"  ng-model="search">&nbsp&nbsp<span class="glyphicon glyphicon-search"></span>
    <hr></hr>
    <table class="table table-striped">
    <tr>
    <th>customerId</th>
    <th>username</th>
    <th>emailId</th>
    </tr>
        <tr ng-repeat="resource in names | filter:search">
             <td>{{resource.customerId}}</td>
            <td>{{ resource.username}}</td>
            <td>{{ resource.emailId}}</td>
            
            
        </tr>    
    </table>
</div>

<script>
angular.module('myApp',[]).controller('dataCtrl',function($scope)
		{
	
		$scope.names=${listofCustomers};
		$scope.orderByMe=function(x)
		{
			$scope.myOrderBy=x;
			}
		});
</script>
<br>
<br>
<br>
<%@include file="footer.jsp"%>
</html>
