<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
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
        <a href="ServiceList.jsp">
          <div>Car<span> Services </span></div>
        </a>
      </div>

      <br>
      <div class="login">
          <form action="Login.jsp" method="POST">
              <input type="submit" value="LOGOUT" style="float: right; margin-top: -200px; margin-right: -350px">
          </form>
          <form action="./ServiceListFormAction" method="POST">
            <!--<input type="submit" value="LOGOUT" style="float: right; margin-top: -200px; margin-right: -350px">-->
            <input type="submit" name="action" value="BUY CARS">
            <input type="submit" name="action" value="SELL CARS">
            <input type="submit" name="action" value="MECHANICAL SERVICES">
          </form>
      </div>

</body>
</html>
