

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
                background: rgba(0,0,0,.5);
            }
            .login-box h2{
                color:#03e9f4
            }
        </style>
    </head>
<body>
    <h2><a href="list">Back</a></h2>
        <div class="login-box">
            <%
                    if (session.getAttribute("mess") != null) {
                %>
                <h2 id="h2" style="color:red">${sessionScope.mess}</h2>
                <%
                        session.removeAttribute("mess");
                    }
                %> 
  <h2>Update iphone</h2>
  <form action="update" method="post">
      <div class="user-box">
      <input type="number" name="id" required>
      <label>Enter id</label>
    </div>
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
      <input type="submit" value="Update">
    </a>
  </form>
</div>
</body>
</html>



<%-- 
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Update Product</title>
        <link rel="stylesheet" type="text/css" href="css/style_1.css">  
    </head>
    <body>
        <div class="con">
            <div class="a_form">  
                <%
                    if (session.getAttribute("messs") != null) {
                %>
                <h2 id="h2" style="color:red">${sessionScope.messs}</h2>
                <%
                        session.removeAttribute("messs");
                    }
                %> 
                <h2 id="h2">Table Update Product</h2>
                <div class="edit">
                    <div class="form_left">
                        <ul>
                            <li>Enter id</li>
                            <li>Enter name</li>
                            <li>Enter price</li>
                            <li>Enter discount</li>
                            <li>Enter image_link</li>
                            <li>Enter created</li>
                            <li>Enter view</li>
                        </ul>
                    </div>
                    <div class="form_right">
                        <form action="update" method="post">
                            <input type="number" name="id" required/></br>
                            <input type="text" name="name" required/></br>
                            <input type="number" name="price" required/></br>
                            <input type="number" name="discount" required/></br>
                            <input type="text" name="image_link" required/></br>
                            <input type="number" name="created" required/></br>
                            <input type="number" name="view" required/></br>
                            <input type="submit" value="Update"/>
                        </form>
                    </div>
                </div>

            </div>
        </div>
    </body>
</html>
--%>
