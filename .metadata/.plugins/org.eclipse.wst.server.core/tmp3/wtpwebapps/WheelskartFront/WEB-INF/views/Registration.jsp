<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>Registeration Page</title>
</head>
<body>

<h2>Welcome To Register</h2>

<div class="container-fluid">
    <section class="container">
		<div class="container-page">				
			<div class="col-md-6">
				<h3 class="dark-grey">Registration</h3>
				<form class="form-horizontal" action="Register" method="get">
				
				<div class="form-group col-lg-12">
					<label>Username</label>
					<input type="text" name="uName" class="form-control" id="uName" value="">
				</div>
				
				<div class="form-group col-lg-6">
					<label>Password</label>
					<input type="password" name="uPassword" class="form-control" id="uPassword" value="">
				</div>
				
				
								
				<div class="form-group col-lg-6">
					<label>Email Address</label>
					<input type="text" name="uId" class="form-control" id="uId" value="">
				</div>
						
				<div class="form-group col-lg-6">
					<label>User Contact</label>
					<input type="text" name="uContact" class="form-control" id="uContact" value="">
				</div>	
				
				
			
				<button type="submit" class="btn btn-primary">Register</button>
			</div>
		</div>
	</section></form>
</div>
</body>
</html>