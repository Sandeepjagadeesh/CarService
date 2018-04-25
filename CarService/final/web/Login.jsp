<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" type="text/css" href="resources/css/style.css">
<title>Car Services</title>
</head>
<body>
<div class="body"></div>
		<div class="grad"></div>
		<div class="header">
			<div>Car<span> Services </span></div> 
		</div>
		<br>
		<div class="login" align="center">
			<form action="CustomerHandler" method="POST"> 
                            <input type="text" placeholder="USERNAME" name="user" ><br>
                            <input type="password" placeholder="PASSWORD" name="password"><br> <br>
                            <input type="submit" value="Login">
			</form>
				
		</div>
</body>
</html>