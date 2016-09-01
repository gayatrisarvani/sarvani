	<%@include file="header.jsp"%>
	<body style="background-image:url(<c:url value="/resources/images/bg5.jpg"/>)">
	
	
	<center>
	<a class="navbar-center" href="home"><img src=<c:url value="/resources/images/gayatrilogo.png" />
				alt="logo" width="15%" height="15%"></a>
			
   <h3 style="color:purple"><i><marquee>An exclusive store for Women Collections</marquee></i></h3>
   </center>
	</body>
<body>

<div class="container-fluid">
  <br>
  <div id="myCarousel" class="carousel slide" data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
      <li data-target="#myCarousel" data-slide-to="2"></li>
      
    </ol>

    <!-- Wrapper for slides -->
   <div class="carousel-inner" role="listbox">
    <div class="item active">
      <img src=<c:url value="/resources/images/g3.png"/> alt="g3" width="100%" height="100%">
    </div>
    <div class="item">
    <img src=<c:url value="/resources/images/g1.png"/> alt="g1" width="100%" height="100%"> 
    </div>
 <div class="item">
      <img src=<c:url value="/resources/images/g4.png"/> alt="g4" width="100%" height="100%">
    </div>
  </div>


<!-- Left and right controls -->
<a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
<span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
<span class="sr-only">Previous</span>
</a>
<a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
<span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
<span class="sr-only">Next</span>
 </a>
</div> 
</div>
</div>
</br>
<div class="container">
	<div class="row">
		<div class="col-sm-4">
			<img src=<c:url value="/resources/images/1.gif"/> alt="image" width="100%" height="100%">
		</div>
		<div class="col-sm-8">
  			<div class="jumbotron" style="background-color:#1a1a1a; 
    color: #ddad7f"> 
   			<center>
			<p>A collective passion for art and architecture</p><p>inspires the team at our jewellers to bring a fresh</p><p>perspective to the intricate, time-honoured</p><p>craftsmanship of each meticulously handwoven</p><p> creation.</p>
			</center>			
			</div>
		</div>
	</div>
</div>
<%@include file="footer.jsp"%>
</html>