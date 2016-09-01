<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<div class="container">
<%@include file="header.jsp"%>
  
  <h2 style="color:green;"><center>Welcome to LoginPage</center></h2>
 <table align="left" border="0" ><h2 style="color:Blue;"></h2>
 <div>
 <center><img src="resources/images/login.png" style="width: 400px"; height="200px"></center>
 <div class="col-md-4 col-md-offset-4" align="center">
  <form role="form" action=<c:url value='j_spring_security_check'/> method="post" name="f">
    <div class="form-group">
	
      <h4 style="color:Blue;"><label for="UserName">UserName:</label></h4>
      <input type="UserName" class="form-control" id="UserName" name="j_username" required="required" placeholder="Enter UserName">

	
    <div class="form-group">
      <h4 style="color:Blue;"><label for="pwd">Password:</label></h4>
      <input type="password" class="form-control" name="j_password" id="pwd" required="required" placeholder="Enter password">
    </div>
    <div class="checkbox">
      <label><input type="checkbox"> Remember me</label>
    </div>
    <div class="col-sm-offset-3 col-sm-6">
                            <button type="submit" class="btn btn-success btn-sm">
                                Sign in</button>
                                 <button type="reset" class="btn btn-default btn-sm">
                                Reset</button>
        </div>
        <br>
        <br>
	<label><p>Not registered?<a href="SignUp">Register Here</a></p></label>
	</div>
  </form>
  </div>
  </div>
  </table>
</div>
        <br>
        <br>
        <br>
        <br>
        <br>
        <br>
<%@include file="footer.jsp"%>
</html>


 