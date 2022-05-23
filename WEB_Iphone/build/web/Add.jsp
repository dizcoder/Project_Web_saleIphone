

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add</title>
        <link rel="stylesheet" type="text/css" href="css/login.css">   
        <style type="text/css">
            body{
                background-image: url(images/signup.jpg);
                background-size: cover;
                height: 100%;
                margin: 0;
            }
            .login-box {
                background: rgba(0,0,0,.7);
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
  <h2>Add iphone</h2>
  <form action="add" method="get">
    <div class="user-box">
      <input type="text" name="name" required>
      <label>Enter name</label>
    </div>
    <div class="user-box">
      <input type="number" name="price" required>
      <label>Enter price</label>
    </div>
    <div class="user-box">
      <input type="number" name="discount" required>
      <label>Enter discount</label>
    </div>
    <div class="user-box">
      <input type="text" name="image" required>
      <label>Enter image</label>
    </div>
    <div class="user-box">
      <input type="text" name="color" required>
      <label>Enter color</label>
    </div>
    <div class="user-box">
      <input type="number" name="size" required>
      <label>Enter size</label>
    </div>
    <div class="user-box">
      <input type="number" name="quantity" required>
      <label>Enter quantity</label>
    </div>         
    <a href="#">
      <span></span>
      <span></span>
      <span></span>
      <span></span>
      <input type="submit" value="Add">
    </a>
  </form>
</div>
</body>
</html>


