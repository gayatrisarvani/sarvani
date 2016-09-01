
<!DOCTYPE html>
<html lang="en">
<head>
 <% 
 response.setHeader("pragma", "no-cache");
 response.setHeader("Cache-control", "no-cache, no-store, must-revalidate");
 response.setHeader("Expires", "0");
 %>
  <title>Gayathri Jewellers</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <head>
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
  <script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>
  <script>document.write('<base href="' + document.location + '" />');</script>
    <link href="./resources/css/bootstrap.min.css" rel="stylesheet" media="screen">
    <link href="./resources/css/style.css" rel="stylesheet" media="screen">
    <script data-require="angular.js@1.0.x" src="http://code.angularjs.org/1.0.7/angular.min.js" data-semver="1.0.7"></script>

  <style>
    /* Remove the navbar's default margin-bottom and rounded borders */ 
    .navbar {
      margin-bottom: 0;
      border-radius: 0;
    }    
  </style>
</head>
<body>
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>                        
      </button>
      <a class="navbar-brand" href="#"><span class="glyphicon glyphicon-home"></span></a>
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav">
       
        <li><a href="viewitem">View Products</a></li>
        <li><a href="addProduct">Add Products</a></li>
        </ul>
        <ul class="nav navbar-nav navbar-right">
        <li><a href="logout">Logout</a></li>
		  
		</ul>
		  
      </ul>
    </div>
  </div>
</nav>
<div>

</div>
<div>
<div class="container">

    <table class="table table-striped">
    <tr>
    <th>ItemId</th>
    <th>ItemName</th>
    <th>Description</th>
    <th>Category</th>
    <th>Price</th>
    </tr>
        <form action="updatethisitem" method="post">
             <td><input type="hidden" value="${item.itemId}" name="itemId"/></td>
            <td><input value="${item.itemName}" name="itemName"/></td>
            <td><input value="${item.description}" name="description" /></td>
            <td><input value="${item.category}" name="category" /></td>
            <td><input value="${item.price}" name="price" /></td>
            <td><img src="resources/images/${item.itemId}.jpg" style="width: 100px;height:100px"></td>
            
            <td><input type="submit" value="update"></td>  
            </form>
        </tr>    
    </table>
</div>
<br>
<br>
<br>
<br>

<%@include file="footer.jsp" %>
</html>
