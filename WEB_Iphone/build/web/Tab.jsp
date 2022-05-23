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

</head>
<style>
    label{
        color: #F44336
    }
    a{
        color: #F44336
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
.hero_area{
    min-height: 20px;
}
.header_section{
    background-color: #86cfda
}
.footer_section{
    clear: both;
}

</style>

<body>

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
              <a href="buy">
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

    <!-- Begin filter -->
    <section id="sidebar">
    <p> Home | <b>All Iphones</b></p>
    <div class="border-bottom pb-2 ml-2">
        <h4 id="burgundy">Filters</h4>
    </div>
    <div class="py-2 border-bottom ml-3">
        <h6 class="font-weight-bold">Categories</h6>
        <div id="orange"><span class="fa fa-minus"></span></div>
        
    <c:forEach items="${requestScope.data1}" var="o">
        <div class="form-group">
            <a  href="tab?id=${o.id}">${o.name}<a/>  
        </div>
    </c:forEach>
                
    </div>
    <div class="py-2 border-bottom ml-3">
        <h6 class="font-weight-bold">Capacity</h6>
        <div id="orange"><span class="fa fa-minus"></span></div>
        <form>
            <div class="form-group">  <label for="artisan">32G</label> </div>
            <div class="form-group">  <label for="artisan">64G</label> </div>
            <div class="form-group">  <label for="artisan">128G</label> </div>
            <div class="form-group">  <label for="artisan">512G</label> </div>
            <div class="form-group">  <label for="artisan">1TB</label> </div>
        </form>
    <div/>  
</section>
    <!-- End filter -->

    <!-- products section -->
    <section id="sanpham">
    <div class="container">
        <div class="d-flex flex-row">
            <div class="ml-auto mr-lg-4">
<!--                <div id="sorting" class="border rounded p-1 m-1"> <span class="text-muted">Sort by</span> <select name="sort" id="sort">
                        <option value="popularity"><b>Popularity</b></option>
                        <option value="prcie"><b>Price</b></option>
                        <option value="rating"><b>Rating</b></option>
                    </select> </div>-->
            </div>
        </div>
        
        <div class="row">
        <c:forEach items="${requestScope.data}" var="pd">
            <div class="col-lg-4 col-md-6 col-sm-10 offset-md-0 offset-sm-1">
                <div class="card"> <img class="card-img-top" src="${pd.image}">
                    <div class="card-body">
                        <h5><b>${pd.name}</b> </h5>
                        <div class="d-flex flex-row my-2">
                            <div class="text-muted"><i class="fa fa-dollar-sign"></i>${pd.price}</div>
                            <div class="ml-auto"> <button class="border rounded bg-white sign"><span class="fa fa-plus" id="orange"></span></button> <span class="px-sm-1">${pd.quantity}</span>  </div>
                        </div> <button class="btn w-100 rounded my-2">Add to cart</button>
                    </div>
                </div>
            </div>
            </c:forEach>
        </div>
        </div>
    </section>


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

</body>

</html>

