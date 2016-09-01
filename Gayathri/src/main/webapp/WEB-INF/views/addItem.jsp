<%@ include file="adminheader.jsp"%>
<center><img src="resources/images/add.jpg" style="width:500px;height: 300px"></center>
<br>
<br>

<div align="center" class="form">
<form:form action="addProduct" commandName="item" enctype="multipart/form-data"> 
<table>
<tr>
<td>Item Name:</td>
<td><form:input path="itemName"></form:input><form:errors path="itemName" style="color:red"></form:errors></td></tr>
<tr><td><br></td></tr>
<tr>
<td>
Item Description:</td><td>
<form:input path="description"></form:input><form:errors path="description" style="color:red"></form:errors></td>
</tr>
<tr><td><br></td></tr>
<tr>
<td>
Item price:</td><td>
<form:input path="price"></form:input></td>
</tr>
<tr><td><br></td></tr>
<tr>
<td>
Category:</td><td>
<form:select path="category">
<form:option value="Gold">Gold</form:option>
<form:option value="Diamond">Diamond</form:option>
</form:select></td>
</tr>
<tr><td><br></td></tr>
<tr><td>
Item Image:</td><td><input type="file" name="file" required="true"/></td>
</tr>
<tr><td><br></td></tr>
<tr><td>
<input type="submit" value="AddProduct"/></td></tr>
</div>
</table>
</form:form>
</body>
</html>