<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>SIGN UP</title>
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
      <h2><a href="Login.jsp">Back</a></h2>
      <%
        if(session.getAttribute("msg")==null){ 
        }else{
      %>
                <h2 style="color:red">${sessionScope.msg}</h2>
            <%
                session.removeAttribute("msg");
                }
            %>
  <h2>SIGN UP</h2>
  <form action="signup" method="get">
    <div class="user-box">
      <input type="text" name="acc" required="">
      <label>Username</label>
    </div>
    <div class="user-box">
      <input type="password" name="pass" required="">
      <label>Password</label>
    </div>
      <div class="user-box">
      <input type="text" name="name" required="">
      <label>Name</label>
    </div>
      <div class="user-box">
      <input type="number" name="amount" required="">
      <label>Amount</label>
    </div>
    <a href="Login.jsp">
      <span></span>
      <span></span>
      <span></span>
      <span></span>
      <input type="submit" value="Sign up"/>
    </a>
  </form>
</div>

</body>
</html>

