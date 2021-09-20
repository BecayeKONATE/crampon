<%@ include file="common/head.jspf" %>	
	
	
	<center>
	<div class="container">
	<div class="float-none">
		<div class="card bg-light" style="max-width: 500px;">
  <div class="card-header"><h5>Enter your login details</h5></div>
  <div class="card-body">
  		
    <form action="/login" method="post">
    <p><font color="red">${errorMessage}</font></p>
    <div class="form-group">
		<input type="text" name="username" placeholder="Name" class="form-control">
    </div>
    <div class="form-group">
		<input type ="password" name="pswrd" placeholder="Password" class="form-control"><br>
		</div>
		<input type="submit" class="btn btn-primary">
	</form>
  </div>
  </div>
	</div>
	
	</div>
	</center>
	
	
	
	
	
	
	
	
	
	
	
</body>
</html>	