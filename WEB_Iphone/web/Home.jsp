
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
<script type="text/javascript">
            function buy(id) {
                document.f.action = "process?id=" + id;
                document.f.submit();
            }
        </script>
<body>
<jsp:include page="Header.jsp"/>

<div class="hero_area">
    <section class="slider_section ">
      <div id="customCarousel1" class="carousel slide" data-ride="carousel">
        <div class="carousel-inner">
          <div class="carousel-item active">
            <div class="container-fluid ">
              <div class="row">
                <div class="col-md-6">
                  <div class="detail-box">
                    <h1>
                      New SmartPhone
                    </h1>
                    <p>
                      New arrivals, customer gratitude, many incentives, attractive gifts.
                    </p>
                    <div class="btn-box">
                      <a href="Contact.jsp" class="btn1">
                        Contact Us
                      </a>
                    </div>
                  </div>
                </div>
                <div class="col-md-6">
                  <div class="img-box">
                    <img src="images/backgr.png" alt="">
                  </div>
                </div>
              </div>
            </div>
          </div>
          <div class="carousel-item ">
            <div class="container-fluid ">
              <div class="row">
                <div class="col-md-6">
                  <div class="detail-box">
                    <h1>
                      Best Selling 
                    </h1>
                    <p>
                      New arrivals, customer gratitude, many incentives, attractive gifts.
                    </p>
                    <div class="btn-box">
                      <a href="" class="btn1">
                        Contact Us
                      </a>
                    </div>
                  </div>
                </div>
                <div class="col-md-6">
                  <div class="img-box">
                    <img src="images/backgr1.png" alt="">
                  </div>
                </div>
              </div>
            </div>
          </div>
          <div class="carousel-item ">
            <div class="container-fluid ">
              <div class="row">
                <div class="col-md-6">
                  <div class="detail-box">
                    <h1>
                      Featured 
                    </h1>
                    <p>
                      New arrivals, customer gratitude, many incentives, attractive gifts.
                    </p>
                    <div class="btn-box">
                      <a href="" class="btn1">
                        Contact Us
                      </a>
                    </div>
                  </div>
                </div>
                <div class="col-md-6">
                  <div class="img-box">
                    <img src="images/backgr2.png" alt="">
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
        <ol class="carousel-indicators">
          <li data-target="#customCarousel1" data-slide-to="0" class="active"></li>
          <li data-target="#customCarousel1" data-slide-to="1"></li>
          <li data-target="#customCarousel1" data-slide-to="2"></li>
        </ol>
      </div>

    </section>
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
        
            <%
                List<Category> Clist = (List<Category>) session.getAttribute("listC");
                    for (Category cate : Clist) {
            %>
            <div class="form-group ">
                
                <a  href="tab?id=<%= cate.getId() %> "active><%= cate.getName()%><a/>  
            </div>
            <% } %>
        
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
                        <option value="name"><b>Name</b></option>
                        <option value="prcie"><b>Price</b></option>
                    </select> </div>-->
            </div>
        </div>
        
        <div class="row">
            <%
                        List<Product> list = (List<Product>) session.getAttribute("data");
                        for (Product c : list) {
                    %>
            <div class="col-lg-4 col-md-6 col-sm-10 offset-md-0 offset-sm-1">
                <div class="card"> <a href="detail?id=<%= c.getId()%>"><img class="card-img-top" src="<%= c.getImage()%>"></a>
                    <div class="card-body">
                        <h5><b><%= c.getName()%></b> </h5>
                        <div class="d-flex flex-row my-2">
                            <div class="text-muted"><i class="fa fa-dollar-sign"></i><%= c.getPrice()%></div>
                            <div class="ml-auto"> <button class="border rounded bg-white sign"><span class="fa fa-plus" id="orange"></span></button> <span class="px-sm-1"><%= c.getQuantity()%></span> </div>
                        </div> 
                        <form name="f" action="process" method="post">
                        <button class="btn w-100 rounded my-2">Add to cart</a></button>
                                <input type="hidden" name="id" value="<%=c.getId()%>"/>
                                <input type="hidden" name="action" value="additem"/>
                        </form> 
                    </div>
                </div>
            </div>
            <% } %>
        </div>
        </div>
    </section>
        <div class="clearfix">
                <ul class="pagination">
                    <li><c:set var="page" value="${requestScope.page}"/>
                        <div class="pagination">
                    <c:forEach begin="${1}" end="${requestScope.num}" var="i">
                        <a class="${i==page?"active":""}" href="home?page=${i}&id=${id}">${i}</a>
                    </c:forEach>
                        </div>
                    </li>
                </ul>
            </div>

  <!-- feature section -->
  <section class="feature_section layout_padding">
    <div class="container">
      <div class="heading_container">
        <h2>
          Features Of Our IPhones
        </h2>
        <p>
          Outstanding features.
        </p>
      </div>
      <div class="row">
        <div class="col-sm-6 col-lg-3">
          <div class="box">
            <div class="img-box">
              <img src="images/cam.jpg" alt="">
            </div>
            <div class="detail-box">
              <h5>
                Rear Camera
              </h5>
              <p>
                12MP wide-angle camera, 12MP ultra-wide-angle camera, 12MP font removal.
              </p>
              <a href="https://www.thegioididong.com/tin-tuc/danh-gia-camera-iphone-13-pro-max-1385552">
                <span>
                  Read More
                </span>
                <i class="fas fa-long-arrow-alt-right"></i>
              </a>
            </div>
          </div>
        </div>
        <div class="col-sm-6 col-lg-3">
          <div class="box">
            <div class="img-box">
              <img src="images/1tb.jpg" alt="">
            </div>
            <div class="detail-box">
              <h5>
                Capacity 1TB
              </h5>
              <p>
                iPhone 13 Pro and 13 Pro Max will probably be equipped with up to 1 terabyte of memory by Apple, double the 512 GB level of the previous generation.
              </p>
              <a href="https://vnexpress.net/iphone-13-pro-se-co-phien-ban-bo-nho-1-tb-4342869.html">
                <span>
                  Read More
                </span>
                <i class="fas fa-long-arrow-alt-right"></i>
              </a>
            </div>
          </div>
        </div>
        <div class="col-sm-6 col-lg-3">
          <div class="box">
            <div class="img-box">
              <img src="images/pin.jpg" alt="">
            </div>
            <div class="detail-box">
              <h5>
                Good Battery
              </h5>
              <p>
                Significantly improved compared to its predecessor, iPhone 13 Pro Max works continuously for nearly 10 hours.
              </p>
              <a href="https://www.thegioididong.com/tin-tuc/danh-gia-pin-iphone-13-series-1386049">
                <span>
                  Read More
                </span>
                <i class="fas fa-long-arrow-alt-right"></i>
              </a>
            </div>
          </div>
        </div>
        <div class="col-sm-6 col-lg-3">
          <div class="box">
            <div class="img-box">
              <img src="images/120Hz.jpg" alt="">
            </div>
            <div class="detail-box">
              <h5>
                ProMotion 120Hz display
              </h5>
              <p>
                Apple has integrated it with a 120Hz display, a system dubbed ProMotion.
              </p>
              <a href="https://fptshop.com.vn/tin-tuc/danh-gia/thong-tin-can-biet-ve-man-hinh-120hz-cua-iphone-13-pro-139907">
                <span>
                  Read More
                </span>
                <i class="fas fa-long-arrow-alt-right"></i>
              </a>
            </div>
          </div>
        </div>
      </div>
      <div class="btn-box">
        <a href="AboutUs.jsp">
          View More
        </a>
      </div>
    </div>
  </section>
  <!-- end feature section -->

<jsp:include page="footer.jsp"/>
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

