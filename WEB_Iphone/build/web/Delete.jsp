
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Delete</title>
        <link rel="stylesheet" type="text/css" href="css/login.css">   
        <style type="text/css">
            body{
                background-image: url(images/backlogin.jpg);
                background-size: cover;
                height: 100%;
                margin: 0;
            }
        </style>
    </head>
<body>
    
        <div class="login-box">
            <h2><a href="http://localhost:8080/WEB_Iphone/list">Back</a></h2>
            <%
                    if (session.getAttribute("mess") != null) {
                %>
                <h2 id="h2" style="color:red">${sessionScope.mess}</h2>
                <%
                        session.removeAttribute("mess");
                    }
                %> 
  <h2>Information Product to delete</h2>
  <form action="delete" method="get">
    <div class="user-box">
      <input type="number" name="id" required="">
      <label>Enter ID</label>
    </div>
    <a href="#">
      <span></span>
      <span></span>
      <span></span>
      <span></span>
      <input type="submit" value="Delete">
    </a>
  </form>
</div>
</body>
</html>




