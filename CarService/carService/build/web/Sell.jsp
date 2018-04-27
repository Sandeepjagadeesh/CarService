<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" type="text/css" href="resources/css/style.css">
  <title>Car Services</title>
  <style>

table, td, th {    
 border: 1px solid black;
 text-align: left;
}

table {
  border-collapse: collapse;
  width: 100%;
}

th, td {
 padding: 15px;
 color: rgba(255,255,255,0.6);
}

</style>

</head>
<body>

  <div class="body"></div>
      <div class="grad"></div>
      <div class="header">
        <a href="ServiceList.jsp">
          <div>Car<span> Services </span></div>
        </a>
      </div>

      <br>
      <div class="login">
        <form action="Login.jsp" method="GET">
          <input type="submit" value="LOGOUT" style="float: right; margin-top: -200px; margin-right: -350px">
        </form><br>
        <form action="./CarsSellServlet" method="POST" style="margin-top: -100px;">

          <input type="text" name="make" placeholder="Make"><br><br>

          <input type="text" name="model" placeholder="Model"><br><br>

          <input type="text" name="year" placeholder="Year"><br><br>

          <input type="text" name="color" placeholder="Color"><br><br>

          <input type="text" name="type" placeholder="Type"><br><br>

          <input type="text" name="price" placeholder="Price"><br><br>

          <input type="submit" name="" value="SUBMIT" style="width: 270px; height: 30%">

        </form>
        
        <p style = "font-size:18px">${message}</p>
        
        
      </div>

</body>
</html>
