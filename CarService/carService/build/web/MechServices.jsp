<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

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

    padding : 15px;

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
        

<table border="1" style="border: 0px; margin-left: -20px; margin-top: -100px;  ">

            <th>Service ID</th>
            <th>Service Type</th>
            <th>Price</th>
            
            <c:forEach items="${allServices}" var="services">
                <tr>
                    <td>${services.serviceID}</td>
                    <td>${services.serviceType}</td>
                    <td>${services.price}</td>
                    <td style="border-right-style: none; border-bottom-style: none; border-top-style: none; padding-right: 40px; padding-left: 40px; color: #a18d6c;"><button onclick="messageDisplay()">BUY</button></td>
                </tr>
            </c:forEach>
        </table>  
        
        <script type="text/javascript">
            function messageDisplay(){
                alert("Your request has been submitted. Please contact the nearest dealer to avail the requested service");
            }
        </script>
</div>

</body>
</html>
