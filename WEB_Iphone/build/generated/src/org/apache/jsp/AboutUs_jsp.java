package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AboutUs_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("  <!-- Basic -->\n");
      out.write("  <meta charset=\"utf-8\" />\n");
      out.write("  <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />\n");
      out.write("  <!-- Mobile Metas -->\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\" />\n");
      out.write("  <!-- Site Metas -->\n");
      out.write("  <meta name=\"keywords\" content=\"\" />\n");
      out.write("  <meta name=\"description\" content=\"\" />\n");
      out.write("  <meta name=\"author\" content=\"\" />\n");
      out.write("  <link rel=\"shortcut icon\" href=\"images/favicon.png\" type=\"image/x-icon\">\n");
      out.write("\n");
      out.write("  <title>ShopDuck</title>\n");
      out.write("\n");
      out.write("\n");
      out.write("  <!-- bootstrap core css -->\n");
      out.write("  <link rel=\"stylesheet\" type=\"text/css\" href=\"css/bootstrap.css\" />\n");
      out.write("  <!--owl slider stylesheet -->\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css\" />\n");
      out.write("\n");
      out.write("  <!-- font awesome style -->\n");
      out.write("  <link href=\"css/font-awesome.min.css\" rel=\"stylesheet\" />\n");
      out.write("\n");
      out.write("  <!-- Custom styles for this template -->\n");
      out.write("  <link href=\"css/style.css\" rel=\"stylesheet\" />\n");
      out.write("  <!-- responsive style -->\n");
      out.write("  <link href=\"css/responsive.css\" rel=\"stylesheet\" />\n");
      out.write("  <link rel=\"stylesheet\" type=\"text/css\" href=\"css/home.css\">\n");
      out.write("  \n");
      out.write("</head>\n");
      out.write("<style>\n");
      out.write("    .footer_section{\n");
      out.write("    clear: both;\n");
      out.write("}\n");
      out.write("    #orange,\n");
      out.write("select,\n");
      out.write(".btn {\n");
      out.write("    color: orange\n");
      out.write("}\n");
      out.write("    .btn {\n");
      out.write("    border: 1px solid orange;\n");
      out.write("    border-radius: 10px;\n");
      out.write("    background-color: #fff\n");
      out.write("}\n");
      out.write("\n");
      out.write(".btn:hover {\n");
      out.write("    color: #fff;\n");
      out.write("    background-color: orange\n");
      out.write("}\n");
      out.write("    .about_section{\n");
      out.write("        background-color: #1d1c1cb2;\n");
      out.write("    }\n");
      out.write("    .header_section{\n");
      out.write("    background-color: #86cfda\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("<body class=\"sub_page\">\n");
      out.write("\n");
      out.write("  ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Header.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("  <!-- about section -->\n");
      out.write("\n");
      out.write("  <section class=\"about_section layout_padding\">\n");
      out.write("    <div class=\"container  \">\n");
      out.write("      <div class=\"row\">\n");
      out.write("        <div class=\"col-md-6 col-lg-5 \">\n");
      out.write("          <div class=\"img-box\">\n");
      out.write("            <img src=\"images/aboutus.jpg\" alt=\"\">\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-md-6 col-lg-7\">\n");
      out.write("          <div class=\"detail-box\">\n");
      out.write("            <div class=\"heading_container\">\n");
      out.write("              <h2>\n");
      out.write("                About Us\n");
      out.write("              </h2>\n");
      out.write("            </div>\n");
      out.write("            <p>\n");
      out.write("              Starting from a passion for discovering Smart phone, ShopDuck is known as one of the few phone shops specializing in providing prestigious Smart phone in Hanoi.<br/>\n");
      out.write("\n");
      out.write("                    In October 2001, joining the development trend on the Internet, ShopDuck officially had a website with the domain name: http://localhost:8080/WEB_Iphone/home to better meet the products and services provided. In addition to efforts to create better service and product quality, ShopDuck also focuses on the development of the store's employees and the interests of customers.<br/><br/>\n");
      out.write("\n");
      out.write("                    Coming to ShopDuck, customers will have great experiences because of ShopDuck's commitments to customers:<br/>\n");
      out.write("\n");
      out.write("                    1. Commitment to the best selling price:\n");
      out.write("\n");
      out.write("                    As a unit specializing in providing reputable Smart phone phone lines, we are always committed to 100% ShopDuck products are genuine products and are sold at the most competitive prices, with professional after-sales service.<br/>\n");
      out.write("\n");
      out.write("                    2. Commitment to diversified products:\n");
      out.write("\n");
      out.write("                    ShopDuck always diversify technology products: mobile phones, laptops, tablets, and accessories. We commit that all products sold at the store are imported and assembled by genuine domestic and foreign famous brands such as: Iphone 7, Iphone 8, Iphone X, 11, 12, 13...<br/>\n");
      out.write("\n");
      out.write("                    3. Commitment to comprehensive service:\n");
      out.write("\n");
      out.write("                    With the desire to be a trusted friend of customers, ShopDuck is committed to providing customers with perfect services with the best service quality. Services at Shopping Phone: Free exchange, 24 hour warranty, 24/7 customer care.\n");
      out.write("            </p>\n");
      out.write("            <a href=\"https://www.facebook.com/duydx6868\">\n");
      out.write("               More\n");
      out.write("            </a>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </section>\n");
      out.write("\n");
      out.write("  <!-- end about section -->\n");
      out.write("\n");
      out.write("  <!-- footer section -->\n");
      out.write("  <footer class=\"footer_section\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <div class=\"row\">\n");
      out.write("        <div class=\"col-md-6 col-lg-3 footer-col\">\n");
      out.write("          <div class=\"footer_detail\">\n");
      out.write("            <h4>\n");
      out.write("              About\n");
      out.write("            </h4>\n");
      out.write("            <p>\n");
      out.write("              Necessary, making this the first true generator on the Internet. It uses a dictionary of over 200 Latin words, combined with\n");
      out.write("            </p>\n");
      out.write("            <div class=\"footer_social\">\n");
      out.write("              <a href=\"https://www.facebook.com/duydx6868\">\n");
      out.write("                <i class=\"fab fa-facebook\"></i>\n");
      out.write("              </a>\n");
      out.write("              <a href=\"\">\n");
      out.write("                <i class=\"fab fa-twitter-square\"></i>\n");
      out.write("              </a>\n");
      out.write("              <a href=\"\">\n");
      out.write("                <i class=\"fab fa-linkedin\"></i>\n");
      out.write("              </a>\n");
      out.write("              <a href=\"https://www.instagram.com/xunduzzz/\">\n");
      out.write("                <i class=\"fab fa-instagram-square\"></i>\n");
      out.write("              </a>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-md-6 col-lg-3 footer-col\">\n");
      out.write("          <div class=\"footer_contact\">\n");
      out.write("            <h4>\n");
      out.write("              Reach at..\n");
      out.write("            </h4>\n");
      out.write("            <div class=\"contact_link_box\">\n");
      out.write("              <a href=\"\">\n");
      out.write("                <i class=\"fas fa-map-marker-alt\"></i>\n");
      out.write("                <span>\n");
      out.write("                  Location\n");
      out.write("                </span>\n");
      out.write("              </a>\n");
      out.write("              <a href=\"\">\n");
      out.write("                <i class=\"fas fa-phone-alt\"></i>\n");
      out.write("                <span>\n");
      out.write("                  Call +84 867751518\n");
      out.write("                </span>\n");
      out.write("              </a>\n");
      out.write("              <a href=\"\">\n");
      out.write("                <i class=\"fas fa-envelope\"></i>\n");
      out.write("                <span>\n");
      out.write("                  duydxhe151374@fpt.edu.vn\n");
      out.write("                </span>\n");
      out.write("              </a>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-md-6 col-lg-3 footer-col\">\n");
      out.write("          <div class=\"footer_contact\">\n");
      out.write("            <h4>\n");
      out.write("              Subscribe\n");
      out.write("            </h4>\n");
      out.write("            <form action=\"#\">\n");
      out.write("              <input type=\"text\" placeholder=\"Enter email\" />\n");
      out.write("              <button type=\"submit\">\n");
      out.write("                Subscribe\n");
      out.write("              </button>\n");
      out.write("            </form>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-md-6 col-lg-3 footer-col\">\n");
      out.write("          <div class=\"map_container\">\n");
      out.write("            <div class=\"map\">\n");
      out.write("              <div id=\"googleMap\"></div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      \n");
      out.write("    </div>\n");
      out.write("  </footer>\n");
      out.write("  <!-- footer section -->\n");
      out.write("\n");
      out.write("  <!-- jQery -->\n");
      out.write("  <script src=\"js/jquery-3.4.1.min.js\"></script>\n");
      out.write("  <!-- popper js -->\n");
      out.write("  <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js\" integrity=\"sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo\" crossorigin=\"anonymous\">\n");
      out.write("  </script>\n");
      out.write("  <!-- bootstrap js -->\n");
      out.write("  <script src=\"js/bootstrap.js\"></script>\n");
      out.write("  <!-- owl slider -->\n");
      out.write("  <script src=\"https://cdnjs.cloudflare.com/ajax/libs/OwlCarousel2/2.3.4/owl.carousel.min.js\">\n");
      out.write("  </script>\n");
      out.write("  <!-- custom js -->\n");
      out.write("  <script src=\"js/custom.js\"></script>\n");
      out.write("  <!-- Google Map -->\n");
      out.write("  <script src=\"https://maps.googleapis.com/maps/api/js?key=AIzaSyCh39n5U-4IoWpsVGUHWdqB6puEkhRLdmI&callback=myMap\"></script>\n");
      out.write("  <!-- End Google Map -->\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
