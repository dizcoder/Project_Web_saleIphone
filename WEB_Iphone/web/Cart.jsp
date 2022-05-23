
<%@page import="model.Account"%>
<%@page import="model.Item"%>
<%@page import="model.Cart"%>
<%@page import="model.Category"%>
<%@page import="java.util.List"%>
<%@page import="model.Product"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
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

      <link href="https://fonts.googleapis.com/css?family=Roboto+Condensed" rel="stylesheet">  
    <link rel="stylesheet" type="text/css" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">   
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"> </script>  
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"> </script>
    
  
</head>
<style>
    body {  
        .button {
            color: #F44336
        }
    background-color: #f5f5f5;  
}  
.Product-img img{  
    width: 100%;  
}  
.main-section{  
    font-family: 'Roboto Condensed', sans-serif;  
    margin-top:100px;  
}  
h2 {  
    color: green;  
}  
h4 {  
    color: red;  
}  
strong {  
    color: red;  
}  
#nomargin p {  
    color: green;  
}  
h5 {  
    color: red;  
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



.btn:hover {
    color: #fff;
    background-color: orange
}
@media(max-width:575px) {
    .search-nav-item {
        margin: 0;
        width: 100%;
        margin-top: 10px
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
.footer, .push {
    height: 142px; /* .push must be the same height as .footer */
}
td.action {
    display: flex;
}
button.btn.btn-more.btn-sm{
    background-color: #FFC107
}
input.search-domain.btn.btn-primary.px-1{
    background-color: #fff;
    color:#F44336;
}
input.search-domain.btn.btn-primary.px-1:hover{
    background-color: #FFC107 
}
</style>

<body>

<div class="hero_area">
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
    
</div>

   <body>  
       <c:set var="size" value="${sessionScope.size}"/>
       
       
    <div class="container main-section">  
        <div class="row">  
            <div class="col-lg-12 pb-2">  
                <h2> Customer Cart </h2>  
            </div>  
            <div class="col-lg-12 pl-3 pt-3">  
                <table class="table table-hover border bg-white">  
                    <thead>  
                        <tr>  
                            <th> <h4> <b>  Order Details </b> </h4> </th>  
                            <th> <h4> <b> Price </h4> <b> </th>  
                            <th style="width:10%;"> <h4> <b> Quantity <b> </h4> </th>  
                            <th> <h4> <b> Subtotal <b> </h4> </th>  
                            <th> <h4> <b> Action <b> </h4> </th>  
                        </tr>  
                    </thead>
                    
        <%
            if (session.getAttribute("messPayment") != null) {
        %>
        <h1 style="color: #e0a800">${sessionScope.messPayment}</h1>  
        <%
            }
        %>
        <%
            if (session.getAttribute("mess") != null) {
        %>
        <h1 style="color: #e0a800">${sessionScope.messPayment}</h1>  
        <%
            }
        %>
                    <tbody> 
                        <%
                            if (session.getAttribute("cart") != null) {
                                Cart cart = (Cart) session.getAttribute("cart");
                                List<Item> list = cart.getItems();
                                for (Item t : list) {
                        %>
                        <tr> 
                            <td>  
                                <div class="row">  
                                    <div class="col-lg-2 Product-img">  
                                        <img src="<%=t.getProduct().getImage()%>" alt="..." class="img-responsive"/>  
                                    </div>  
                                    <div class="col-lg-10">  
                                        <h5 class="nomargin"> <b>  <%=t.getProduct().getName()%></b> </h5>  
                                        <p> Preferential products, attractive gifts including: 20W charger, Airpod 2 headset, genuine Apple case, ... 
                                            company warranty up to 12 months, free warranty exchange. </p>  
                                    </div>  
                                </div>  
                            </td>  
                            <td> <strong> <%=t.getProduct().getPrice()%> </strong> </td>  
                            <td data-th="Quantity">
                                <form action="process" method="get">
                                    <button class="btn btn-more btn-sm"><a href="process?num=-1&id=<%=t.getProduct().getId()%>">-</a></button>
                                    <%=t.getQuantity()%>
                                    <button class="btn btn-more btn-sm"><a href="process?num=1&id=<%=t.getProduct().getId()%>">+</a></button>
                                </form>
                            </td>  
                            <td> <strong> <fmt:formatNumber pattern="##.#" value="<%=t.getProduct().getPrice()* t.getQuantity()%>"/> </strong> </td>  
                            <td class="action" data-th="" style="width:10%;">  

                                <form action="process" method="post">
                                    <button class="btn btn-danger btn-sm"> <i class="fa fa-trash-o"> </i></button>
                                    <input type="hidden" name="id" value="<%=t.getProduct().getId()%>"/>
                                    <input type="hidden" name="action" value="removeitem"/>
                                </form>
                                                               
                            </td>  
                        </tr>  
                        <%
                            }
                        %>  
                          
                    </tbody>  
                    <tfoot>  
                        <tr>  
                            <td> <a href="home?page=${1}" class="btn btn-success "> <i class="fa fa-angle-left"> </i> Continue Shopping </a> </td>  
                            <td colspan="2" class="hidden-xs"> </td>  
                            <td class="hidden-xs text-center" style="width:10%;"> <strong> Total Price : <fmt:formatNumber pattern="##.#" value="<%=cart.getTotalMoney()%>"/>  </strong> </td>  
                            <td> 
                                <form action="checkout" method="post">
                                <input class="btn btn-success btn-block" type="submit" value="Check Out" >
                                </form>
                            </td>  
                        </tr> 
                        <%
                            }
                        %>
                    </tfoot>
                </table>  
            </div>  
        </div>  
    </div>
                            
</body> 

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

