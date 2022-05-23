package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.Product;

public final class Detail_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
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
      out.write("  <!-- font awesome style -->\n");
      out.write("  <link href=\"css/font-awesome.min.css\" rel=\"stylesheet\" />\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("  <!-- Custom styles for this template -->\n");
      out.write("  <link href=\"css/style.css\" rel=\"stylesheet\" />\n");
      out.write("  <!-- responsive style -->\n");
      out.write("  <link href=\"css/responsive.css\" rel=\"stylesheet\" />\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<style>\n");
      out.write("    .footer_section{\n");
      out.write("    clear: both;\n");
      out.write("}\n");
      out.write("    .footer_section {\n");
      out.write("        margin-top: 10px;\n");
      out.write("    }    \n");
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
      out.write(".header_section{\n");
      out.write("    background-color: #86cfda\n");
      out.write("}\n");
      out.write("body {\n");
      out.write("    background-color: #fff\n");
      out.write("}\n");
      out.write("\n");
      out.write(".card {\n");
      out.write("    border: none\n");
      out.write("}\n");
      out.write("\n");
      out.write(".product {\n");
      out.write("    background-color: #eee\n");
      out.write("}\n");
      out.write("\n");
      out.write(".brand {\n");
      out.write("    font-size: 13px\n");
      out.write("}\n");
      out.write("\n");
      out.write(".act-price {\n");
      out.write("    color: red;\n");
      out.write("    font-weight: 700\n");
      out.write("}\n");
      out.write("\n");
      out.write(".dis-price {\n");
      out.write("    text-decoration: line-through\n");
      out.write("}\n");
      out.write("\n");
      out.write(".about {\n");
      out.write("    font-size: 14px\n");
      out.write("}\n");
      out.write("\n");
      out.write(".color {\n");
      out.write("    margin-bottom: 10px\n");
      out.write("}\n");
      out.write("\n");
      out.write("label.radio {\n");
      out.write("    cursor: pointer\n");
      out.write("}\n");
      out.write("\n");
      out.write("label.radio input {\n");
      out.write("    position: absolute;\n");
      out.write("    top: 0;\n");
      out.write("    left: 0;\n");
      out.write("    visibility: hidden;\n");
      out.write("    pointer-events: none\n");
      out.write("}\n");
      out.write("\n");
      out.write("label.radio span {\n");
      out.write("    padding: 2px 9px;\n");
      out.write("    border: 2px solid #ff0000;\n");
      out.write("    display: inline-block;\n");
      out.write("    color: #ff0000;\n");
      out.write("    border-radius: 3px;\n");
      out.write("    text-transform: uppercase\n");
      out.write("}\n");
      out.write("\n");
      out.write("label.radio input:checked+span {\n");
      out.write("    border-color: #ff0000;\n");
      out.write("    background-color: #ff0000;\n");
      out.write("    color: #fff\n");
      out.write("}\n");
      out.write("\n");
      out.write(".btn-danger {\n");
      out.write("    background-color: #ff0000 !important;\n");
      out.write("    border-color: #ff0000 !important\n");
      out.write("}\n");
      out.write("\n");
      out.write(".btn-danger:hover {\n");
      out.write("    background-color: #da0606 !important;\n");
      out.write("    border-color: #da0606 !important\n");
      out.write("}\n");
      out.write("\n");
      out.write(".btn-danger:focus {\n");
      out.write("    box-shadow: none\n");
      out.write("}\n");
      out.write("\n");
      out.write(".cart i {\n");
      out.write("    margin-right: 10px\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("<body class=\"sub_page\">\n");
      out.write("    <div class=\"hero_area\">\n");
      out.write("\n");
      out.write("    <!-- header section strats -->\n");
      out.write("    <header class=\"header_section\">\n");
      out.write("      <div class=\"container-fluid\">\n");
      out.write("        <nav class=\"navbar navbar-expand-lg custom_nav-container \">\n");
      out.write("          <a class=\"navbar-brand\" href=\"index.html\">\n");
      out.write("            <span>\n");
      out.write("              ShopDuck\n");
      out.write("            </span>\n");
      out.write("          </a>\n");
      out.write("\n");
      out.write("          <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("            <span class=\"\"> </span>\n");
      out.write("          </button>\n");
      out.write("\n");
      out.write("          <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("            <ul class=\"navbar-nav\">\n");
      out.write("              <li class=\"nav-item active\">\n");
      out.write("                <a class=\"nav-link\" href=\"Home.jsp\">Home <span class=\"sr-only\">(current)</span></a>\n");
      out.write("              </li>\n");
      out.write("              <li class=\"nav-item\">\n");
      out.write("                <a class=\"nav-link\" href=\"AboutUs.jsp\"> About </a>\n");
      out.write("              </li>\n");
      out.write("              <li class=\"nav-item\">\n");
      out.write("                <a class=\"nav-link\" href=\"Contact.jsp\">Contact Us</a>\n");
      out.write("              </li>\n");
      out.write("            </ul>\n");
      out.write("              <i class=\"fas fa-search\"></i>\n");
      out.write("              <form id=\"search-form\" action=\"search\" method=\"get\">\n");
      out.write("                    <input type=\"text\" placeholder=\"Search\" name=\"name\">\n");
      out.write("                    <input type=\"submit\" class=\"search-domain btn btn-primary px-1\" value=\"Search\">\n");
      out.write("              </form>\n");
      out.write("            <div class=\"user_option-box\">\n");
      out.write("              <a href=\"Login.jsp\">\n");
      out.write("                <i class=\"fas fa-user-alt\"></i>\n");
      out.write("              </a>\n");
      out.write("              <a href=\"\">\n");
      out.write("                <i class=\"fas fa-cart-plus\"></i>\n");
      out.write("              </a>\n");
      out.write("              <a> </a>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </nav>\n");
      out.write("      </div>\n");
      out.write("    </header>\n");
      out.write("    <!-- end header section -->\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("    <div class=\"container mt-5 mb-5\">\n");
      out.write("    <div class=\"row d-flex justify-content-center\">\n");
      out.write("        <div class=\"col-md-10\">\n");
      out.write("            <div class=\"card\">\n");
      out.write("                ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${data.getImage()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    </div>\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("  \n");
      out.write("\n");
      out.write("                \n");
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
