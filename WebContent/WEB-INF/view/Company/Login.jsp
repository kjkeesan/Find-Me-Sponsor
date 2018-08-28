<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
    
    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
<!--===============================================================================================-->	
	<link rel="icon" type="image/png" href="<spring:url value='resources/css/login/images/icons/favicon.ico'/>"/>
<!--===============================================================================================-->
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css" integrity="sha384-9gVQ4dYFwwWSjIDZnLEWnxCjeSWFphJiwGPXr1jddIhOegiu1FwO5qRGvFXOdJZ4" crossorigin="anonymous">
	
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="<spring:url value='resources/css/login/fonts/font-awesome-4.7.0/css/font-awesome.min.css'/>">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="<spring:url value='resources/css/login/fonts/Linearicons-Free-v1.0.0/icon-font.min.css'/>">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="<spring:url value='resources/css/login/vendor/animate/animate.css'/>">
<!--===============================================================================================-->	
	<link rel="stylesheet" type="text/css" href="<spring:url value='resources/css/login/vendor/css-hamburgers/hamburgers.min.css'/>">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="<spring:url value='resources/css/login/vendor/animsition/css/animsition.min.css'/>">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="<spring:url value='resources/css/login/vendor/select2/select2.min.css'/>">
<!--===============================================================================================-->	
	<link rel="stylesheet" type="text/css" href="<spring:url value='resources/css/login/vendor/daterangepicker/daterangepicker.css'/>">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="<spring:url value='resources/css/login/css/util.css'/>">
	<link rel="stylesheet" type="text/css" href="<spring:url value='resources/css/login/css/main.css'/>">
<!--===============================================================================================-->

<title>Company Page</title>
</head>
<body>

	<div class="limiter">
		<div class="container-login100">
			<div class="wrap-login100">
				<div class="login100-form-title" style="background-image: url(<spring:url value='resources/css/login/images/bg-01.jpg'/>);">
					<span class="login100-form-title-1">
						Login
					</span>
				</div>
				
				<f:form class="login100-form validate-form" method="POST" modelAttribute="login" action="success">
				<f:hidden path="id" />
					
					
					<div class="wrap-input100 validate-input m-b-26" data-validate="Username is required">
						<span class="label-input100">username</span>
						<f:input class="input100" type="text" name="username" placeholder="Enter email id" path="username"/>
						<span class="focus-input100"></span>
					</div>

					<div class="wrap-input100 validate-input m-b-18" data-validate = "Password is required">
						<span class="label-input100">Password</span>
						<f:input class="input100" type="password" name="password" placeholder="Enter password" path="password" />
						<span class="focus-input100"></span>
					</div>
					
					
					
					
						<span class="focus-input100"></span>
					

					

					<div class="container-login100-form-btn">
						<input type="submit" class="login100-form-btn" value="Login">
						
						
					</div>
					
				</f:form>
			</div>
		</div>
	</div>
	
	<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js" integrity="sha384-uefMccjFJAIv6A+rW+L4AHf99KvxDjWSu1z9VI8SKNVmz4sk7buKt/6v9KI65qnm" crossorigin="anonymous"></script>
	
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.0/umd/popper.min.js" integrity="sha384-cs/chFZiN24E4KMATLdqdvsezGxaGsi4hLGOzlXwp5UZB1LY//20VyM2taTB4QvJ" crossorigin="anonymous"></script>
<!--===============================================================================================-->
	<script src="<spring:url value='resources/css/login/vendor/jquery/jquery-3.2.1.min.js'/>"></script>
<!--===============================================================================================-->
	<script src="<spring:url value='resources/css/login/vendor/animsition/js/animsition.min.js'/>"></script>
<!--===============================================================================================-->
	<script src="<spring:url value='resources/css/login/vendor/bootstrap/js/popper.js'/>"></script>
	<script src="<spring:url value='resources/css/login/vendor/bootstrap/js/bootstrap.min.js'/>"></script>
<!--===============================================================================================-->
	<script src="<spring:url value='resources/css/login/vendor/select2/select2.min.js'/>"></script>
<!--===============================================================================================-->
	<script src="<spring:url value='resources/css/login/vendor/daterangepicker/moment.min.js'/>"></script>
	<script src="<spring:url value='resources/css/login/vendor/daterangepicker/daterangepicker.js'/>"></script>
<!--===============================================================================================-->
	<script src="<spring:url value='resources/css/login/vendor/countdowntime/countdowntime.js'/>"></script>
<!--===============================================================================================-->
	<script src="<spring:url value='resources/css/login/js/main.js'/>"></script>
	

</body>
</html>