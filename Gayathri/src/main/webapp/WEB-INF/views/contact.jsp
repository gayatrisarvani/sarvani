
<%@include file="header.jsp"%>
<body style="background-color:#FFE4C4">

<div class="container-fluid bg-grey">
  <h2 style="color:#DC143C;" class="text-center">Contact</h2>
  <div class="row">
    <div class="col-sm-5">
      <p><u>Contact us and we'll get back to you within 24 hours.</u></p>
      <p><span class="glyphicon glyphicon-map-marker"></span> Hyderabad,miyapur,shop n0.119 India</p>
      <p><span class="glyphicon glyphicon-phone"></span> +911401920253</p>
      <p><span class="glyphicon glyphicon-envelope"></span> gayatriinnovations@yahoo.com</p> 
    </div>
    <div class="col-sm-7">
      <div class="row">
        <div class="col-sm-6 form-group">
          <input class="form-control" id="name" name="name" placeholder="Name" type="text" required>
        </div>
        <div class="col-sm-6 form-group">
          <input class="form-control" id="email" name="email" placeholder="Email" type="email" required>
        </div>
      </div>
      <textarea class="form-control" id="comments" name="comments" placeholder="Comment" rows="3"></textarea><br>
      <div class="row">
        <div class="col-sm-12 form-group">
          <button class="btn btn-default pull-right" type="submit">Send</button>
        </div>
      </div> 
    </div>
  </div>
  <br>
  <br>
  <br>
  <br>
  <br>
  <br>
  <br>
  
<%@include file="footer.jsp" %>
</html>