<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
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
    
        
    
        <div class="login-box" >
            <%
                if(request.getAttribute("error")==null){ 
            }else{
                %>
                <h2 style="color: red">${requestScope.error}</h2>
                <%
                    request.removeAttribute("error");
                    }
                %>
                      
  <h2>Login</h2>
  <form action="login" method="get">
    <div class="user-box">
      <input type="text" name="acc" value="${cookie.acc.value}"
             required="">
      <label>Username</label>
    </div>
    <div class="user-box">
      <input type="password" name="pass" value="${cookie.pass.value}"
             required="">
      <label>Password</label>
    </div>
      <input type="checkbox" ${(cookie.rem.value eq 'ON')?"checked":""}
             name="rem" value="ON"/>
      <label>Remember me</label><br/>
    <a href="#">
      <span></span>
      <span></span>
      <span></span>
      <span></span>
      <input type="submit" value="Login">
    </a>
      
    <a href="Registration.jsp">Sign Up</a>
  </form>
</div>
</body>
</html>
