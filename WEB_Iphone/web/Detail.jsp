
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

  <title>ShopDuck</title>


  <!-- bootstrap core css -->
  <link rel="stylesheet" type="text/css" href="css/bootstrap.css" />
  <!--owl slider stylesheet -->
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css" />
  <!-- font awesome style -->
  <link href="css/font-awesome.min.css" rel="stylesheet" />
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
  <!-- Custom styles for this template -->
  <link href="css/style.css" rel="stylesheet" />
  <!-- responsive style -->
  <link href="css/responsive.css" rel="stylesheet" />

</head>
<style>
    .footer_section{
    clear: both;
}
    .footer_section {
        margin-top: 10px;
    }    
    #orange,
select,
.btn {
    color: orange
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
.header_section{
    background-color: #86cfda
}
body {
    background-color: #fff
}

.card {
    border: none
}

.product {
    background-color: #eee
}

.brand {
    font-size: 13px
}

.act-price {
    color: red;
    font-weight: 700
}

.dis-price {
    text-decoration: line-through
}

.about {
    font-size: 14px
}

.color {
    margin-bottom: 10px
}

label.radio {
    cursor: pointer
}

label.radio input {
    position: absolute;
    top: 0;
    left: 0;
    visibility: hidden;
    pointer-events: none
}

label.radio span {
    padding: 2px 9px;
    border: 2px solid #ff0000;
    display: inline-block;
    color: #ff0000;
    border-radius: 3px;
    text-transform: uppercase
}

label.radio input:checked+span {
    border-color: #ff0000;
    background-color: #ff0000;
    color: #fff
}

.btn-danger {
    background-color: #ff0000 !important;
    border-color: #ff0000 !important
}

.btn-danger:hover {
    background-color: #da0606 !important;
    border-color: #da0606 !important
}

.btn-danger:focus {
    box-shadow: none
}

.cart i {
    margin-right: 10px
}
</style>
<body class="sub_page">

  <div class="hero_area">

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
                <a class="nav-link" href="Home.jsp">Home <span class="sr-only">(current)</span></a>
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
  </div>

<div class="container mt-5 mb-5">
    <div class="row d-flex justify-content-center">
        <div class="col-md-10">
            <div class="card">
                <div class="row">
                    <div class="col-md-6">
                        <div class="images p-3">
                            <div class="text-center p-4"> <img id="main-image" src="${product.image}" width="250" /> </div>
                        </div>
                            
                    </div>
                    <div class="col-md-6">
                        <div class="product p-4">
                            <div class="d-flex justify-content-between align-items-center">
                                <div class="d-flex align-items-center"> <i class="fa fa-long-arrow-left"></i> <span class="ml-1"><a href="home">Back</a></span> </div><a href="Cart.jsp" <i class="fa fa-shopping-cart text-muted"></a></i>
                            </div>
                            <div class="mt-4 mb-3"> <span class="text-uppercase text-muted brand"></span>
                                <h5 class="text-uppercase">${product.name}</h5>
                                <div class="price d-flex flex-row align-items-center"> <span class="act-price">$${product.price}</span>
                                    <div class="ml-2"> <small class="dis-price">$${product.discount}</small> <span>20% OFF</span> </div>
                                </div>
                            </div>
                            <p class="about">Shop abcdxyz</p>
                            <div class="sizes mt-5">
                                <h6 class="text-uppercase">Capacity</h6> 
                                    <label class="radio"> <input type="radio" name="size" value=""> <span>32G</span> </label> 
                                    <label class="radio"> <input type="radio" name="size" value=""> <span>64G</span> </label> 
                                    <label class="radio"> <input type="radio" name="size" value=""> <span>128G</span> </label> 
                                    <label class="radio"> <input type="radio" name="size" value=""> <span>512G</span> </label> 
                                    <label class="radio"> <input type="radio" name="size" value=""> <span>1TB</span> </label>
                            </div>

                            <div class="cart mt-4 align-items-center">
                            <form name="f" action="process" method="post">
                            <button class="btn btn-danger text-uppercase mr-2 px-4">Add to cart</a></button>
                                <input type="hidden" name="id" value="${product.id}"/>
                                <input type="hidden" name="action" value="additem"/>
                            </form> 
                                </div>

                             
                        </div>
                    </div>          
                </div>
            </div>
        </div>
    </div>
</div>

<body/>
                
  <!-- footer section -->
  <footer class="footer_section">
    <div class="container">
      <div class="row">
        <div class="col-md-6 col-lg-3 footer-col">
          <div class="footer_detail">
            <h4>
              About
            </h4>
            <p>
              Necessary, making this the first true generator on the Internet. It uses a dictionary of over 200 Latin words, combined with
            </p>
            <div class="footer_social">
              <a href="https://www.facebook.com/duydx6868">
                <i class="fab fa-facebook"></i>
              </a>
              <a href="">
                <i class="fab fa-twitter-square"></i>
              </a>
              <a href="">
                <i class="fab fa-linkedin"></i>
              </a>
              <a href="https://www.instagram.com/xunduzzz/">
                <i class="fab fa-instagram-square"></i>
              </a>
            </div>
          </div>
        </div>
        <div class="col-md-6 col-lg-3 footer-col">
          <div class="footer_contact">
            <h4>
              Reach at..
            </h4>
            <div class="contact_link_box">
              <a href="">
                <i class="fas fa-map-marker-alt"></i>
                <span>
                  Location
                </span>
              </a>
              <a href="">
                <i class="fas fa-phone-alt"></i>
                <span>
                  Call +84 867751518
                </span>
              </a>
              <a href="">
                <i class="fas fa-envelope"></i>
                <span>
                  duydxhe151374@fpt.edu.vn
                </span>
              </a>
            </div>
          </div>
        </div>
        <div class="col-md-6 col-lg-3 footer-col">
          <div class="footer_contact">
            <h4>
              Subscribe
            </h4>
            <form action="#">
              <input type="text" placeholder="Enter email" />
              <button type="submit">
                Subscribe
              </button>
            </form>
          </div>
        </div>
        <div class="col-md-6 col-lg-3 footer-col">
          <div class="map_container">
            <div class="map">
              <div id="googleMap"></div>
            </div>
          </div>
        </div>
      </div>
      
    </div>
  </footer>
  <!-- footer section -->

  <!-- jQery -->
  <script src="js/jquery-3.4.1.min.js"></script>
  <!-- popper js -->
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous">
  </script>
  <!-- bootstrap js -->
  <script src="js/bootstrap.js"></script>
  <!-- owl slider -->
  <script src="https://cdnjs.cloudflare.com/ajax/libs/OwlCarousel2/2.3.4/owl.carousel.min.js">
  </script>
  <!-- custom js -->
  <script src="js/custom.js"></script>
  <!-- Google Map -->
  <script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyCh39n5U-4IoWpsVGUHWdqB6puEkhRLdmI&callback=myMap"></script>
  <!-- End Google Map -->

</html>