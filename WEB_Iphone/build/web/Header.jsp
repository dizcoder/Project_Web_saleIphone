
<%@page import="model.Account"%>
<%@page import="model.Category"%>
<%@page import="java.util.List"%>
<%@page import="model.Product"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">

<head>
  <!-- Basic -->
  <meta charset="utf-8" />
  <meta http-equiv="X-UA-Compatible" content="IE=edge" />
  <!-- Mobile Metas -->
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
  <!-- Site Metas -->
  <meta name="keywords" content="" />
  <meta name="description" content="" />
  <meta name="author" content="" />
  <link rel="shortcut icon" href="images/favicon.png" type="image/x-icon">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
  <title>ShopDuck</title>


  <!-- bootstrap core css -->
  <link rel="stylesheet" type="text/css" href="css/bootstrap.css" />
  <!--owl slider stylesheet -->
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css" />


  <!-- font awesome style -->
  <link href="css/font-awesome.min.css" rel="stylesheet" />

  <!-- Custom styles for this template -->
  <link href="css/style.css" rel="stylesheet" />
  <!-- responsive style -->
  <link href="css/responsive.css" rel="stylesheet" />
  <link rel="stylesheet" type="text/css" href="css/home.css">
  
</head>
<style>

    label{
        color: #F44336;
    }
    a{
        color: #F44336;
    }
    .feature_section {
        background-color: #86cfda;
    }
* {
    box-sizing: border-box
}

#search {
    outline: none;
    border: none;
    display: inline-block
}

#burgundy {
    color: rgb(153, 40, 59)
}

#orange,
select,
.btn {
    color: orange 
}

.fa-search {
    font-size: 20px;
    padding: 10px;
    margin-bottom: 3px;
    padding-right: 20px
}

.search-nav-item {
    height: 40px
}

nav {
    padding: 0px 100px
}

.fa-user-o,
.fa-shopping-cart {
    font-size: 20px;
    padding: 4px
}

.form-group {
    margin-bottom: 5px
}

label {
    padding-left: 10px
}

.form-group:last-child {
    margin-bottom: 0
}

h6 {
    margin-bottom: 0px
}

#sort {
    outline: none;
    border: none
}

.btn {
    border: 1px solid orange;
    border-radius: 10px;
    background-color: #fff
}

.btn:hover {
    color: #fff;
    background-color: orange
}

.card-body {
    padding: 8px
}

.sign {
    width: 25px;
    height: 25px
}

.discount {
    border: 1px solid orange;
    border-radius: 5px;
    width: 65px;
    position: absolute;
    top: 2%
}

@media(min-width:1200px) {
    #search {
        width: 300px;
        padding: 5px;
        padding-left: 20px
    }

    .search-nav-item {
        margin-left: 400px;
        width: 350px
    }

    .fa-user-o {
        margin-left: 300px
    }

    .text {
        display: none
    }

    .fa-user-o,
    .fa-shopping-cart {
        font-size: 20px;
        padding-left: 20px
    }

    #sidebar {
        width: 30%;
        padding: 20px;
        float: left
    }

    #products {
        width: 70%;
        padding: 10px;
        margin: 0;
        float: right
    }
    
.card{
ransition-duration: .3s;
transition-property: transform;
transition-timing-function: ease-out;
}
.card:hover{
transform: translateY(-20px);
}
    
    .card {
        width: 300px;
        height: 330px;
        border: solid black 1px;
        margin-bottom: 10px;
    }

    .card-img-top {
        width: 210px;
        height: 200px;
        border-radius: 10px;
        display: block; margin-left: auto; margin-right: auto;
        
    }

    del {
        padding-right: 2px
    }

    .filter,
    #mobile-filter {
        display: none
    }
}

@media(min-width:992px) and (max-width:1199px) {
    #search {
        width: 300px;
        padding: 5px;
        padding-left: 20px
    }

    .search-nav-item {
        margin-left: 200px;
        width: 350px
    }

    .fa-user-o {
        margin-left: 160px
    }

    .text {
        display: none
    }

    #sidebar {
        width: 30%;
        padding: 20px;
        float: left
    }

    #products {
        width: 70%;
        padding: 10px;
        margin: 0;
        float: right
    }

    .card {
        width: 200px;
        height: 330px;
        border: none
    }

    .card-img-top {
        width: 210px;
        height: 200px;
        border-radius: 10px
    }

    .fa-plus,
    .fa-minus {
        font-size: 12px
    }

    .sign {
        height: 25px
    }

    .price {
        width: 99px
    }

    .filter,
    #mobile-filter {
        display: none
    }
}

@media(min-width:768px) and (max-width:991px) {
    #search {
        width: 300px;
        padding: 5px;
        padding-left: 20px
    }

    .search-nav-item {
        margin-left: 60px;
        width: 350px
    }

    .fa-user-o {
        margin-left: 80px
    }

    .text {
        display: none
    }

    #sidebar {
        width: 35%;
        padding: 20px;
        float: left
    }

    #products {
        width: 65%;
        padding: 10px;
        margin: 0;
        float: right
    }

    .card {
        border: none
    }

    .filter,
    #mobile-filter {
        display: none
    }
}

@media(min-width:576px) and (max-width:767px) {
    .text {
        display: none
    }

    .search-nav-item {
        margin-left: 35px;
        width: 270px
    }

    #search {
        width: 240px;
        padding: 5px;
        padding-left: 20px
    }

    .fa-search {
        padding: 3px;
        font-size: 18px
    }

    #sidebar {
        width: 40%;
        padding: 20px;
        float: left
    }



    .card {
        border: none
    }

    #off {
        padding-left: 2px
    }

    #sorting span,
    #res {
        font-size: 14px
    }

    .filter,
    #mobile-filter {
        display: none
    }
}

@media(max-width:575px) {
    .search-nav-item {
        margin: 0;
        width: 100%;
        margin-top: 10px
    }

    #search {
        width: 80%;
        padding-left: 10px;
        margin-top: 10px;
        padding-right: 10px
    }

    .fa-search {
        padding: 10px;
        font-size: 18px
    }

    #sidebar {
        display: none
    }

    .filter {
        margin-left: 70%;
        margin-top: 2%
    }

    #sorting,
    #res {
        font-size: 12px;
        margin-top: 2%
    }
    
}
.header_section{
    background-color: #86cfda
}
.pagination {
    float: right;
    margin: 0 0 5px;
}
.pagination li a {
    border: none;
    font-size: 20px;
    min-width: 30px;
    min-height: 30px;
    color: #000000;
    margin: 0 2px;
    line-height: 30px;
    border-radius: 2px !important;
    text-align: center;
    padding: 0 6px;
}
.pagination li a:hover {
    color: #666;
}	
.pagination li.active a, .pagination li.active a.page-link {
    background: #03A9F4;
}
.pagination li.active a:hover {        
    background: #0397d6;
}
.pagination li.disabled i {
    color: #ccc;
}
.pagination li i {
    font-size: 16px;
    padding-top: 6px
}
.flex-row{
    margin-bottom: 20px
}
</style>
    <body>
        <!-- header section strats -->
    <header class="header_section">
      <div class="container-fluid">
        <nav class="navbar navbar-expand-lg custom_nav-container ">
          <a class="navbar-brand" href="index.html">
            <span>
              ShopDuck
            </span>
          </a>

          <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class=""> </span>
          </button>

          <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav">
              <li class="nav-item ">
                <a class="nav-link" href="home?page=${1}">Home <span class="sr-only">(current)</span></a>
              </li>
              <li class="nav-item">
                <a class="nav-link" href="AboutUs.jsp"> About </a>
              </li>
              <li class="nav-item">
                <a class="nav-link" href="Contact.jsp">Contact Us</a>
              </li>
              <li class="nav-item">
              <%
                if (session.getAttribute("admin") != null) {
              %>
                <a class="nav-link" href="logout">Log out</a>
                <%
                    } else {
                %>
                <a class="nav-link" href="Login.jsp">Login</a>
                <%
                    }
                %>
              </li>  
            </ul>
              <i class="fas fa-search"></i>
              <form id="search-form" action="search" method="get">
                    <input type="text" placeholder="Search" name="name">
                    <input type="submit" class="search-domain btn btn-primary px-1" value="Search">
              </form>
            <div class="user_option-box">
              <a href="UpdateProfile.jsp">
                <i class="fas fa-user-alt"></i>
              </a>
              <a href="Cart.jsp">
                <i class="fas fa-cart-plus"></i>
              </a>
                <a></a>
            </div>
          </div>
        </nav>
      </div>
    </header>
    <!-- end header section -->
  
    </body>
</html>
