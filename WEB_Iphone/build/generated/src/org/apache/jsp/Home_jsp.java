package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.Account;
import model.Category;
import java.util.List;
import model.Product;

public final class Home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_end_begin;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_forEach_var_end_begin = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_set_var_value_nobody.release();
    _jspx_tagPool_c_forEach_var_end_begin.release();
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
      out.write("  <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("  <title>ShopDuck</title>\n");
      out.write("\n");
      out.write("\n");
      out.write("  <!-- bootstrap core css -->\n");
      out.write("  <link rel=\"stylesheet\" type=\"text/css\" href=\"css/bootstrap.css\" />\n");
      out.write("  <!--owl slider stylesheet -->\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css\" />\n");
      out.write("\n");
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
      out.write("<script type=\"text/javascript\">\n");
      out.write("            function buy(id) {\n");
      out.write("                document.f.action = \"process?id=\" + id;\n");
      out.write("                document.f.submit();\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("<body>\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Header.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"hero_area\">\n");
      out.write("    <section class=\"slider_section \">\n");
      out.write("      <div id=\"customCarousel1\" class=\"carousel slide\" data-ride=\"carousel\">\n");
      out.write("        <div class=\"carousel-inner\">\n");
      out.write("          <div class=\"carousel-item active\">\n");
      out.write("            <div class=\"container-fluid \">\n");
      out.write("              <div class=\"row\">\n");
      out.write("                <div class=\"col-md-6\">\n");
      out.write("                  <div class=\"detail-box\">\n");
      out.write("                    <h1>\n");
      out.write("                      New SmartPhone\n");
      out.write("                    </h1>\n");
      out.write("                    <p>\n");
      out.write("                      New arrivals, customer gratitude, many incentives, attractive gifts.\n");
      out.write("                    </p>\n");
      out.write("                    <div class=\"btn-box\">\n");
      out.write("                      <a href=\"Contact.jsp\" class=\"btn1\">\n");
      out.write("                        Contact Us\n");
      out.write("                      </a>\n");
      out.write("                    </div>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-6\">\n");
      out.write("                  <div class=\"img-box\">\n");
      out.write("                    <img src=\"images/backgr.png\" alt=\"\">\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"carousel-item \">\n");
      out.write("            <div class=\"container-fluid \">\n");
      out.write("              <div class=\"row\">\n");
      out.write("                <div class=\"col-md-6\">\n");
      out.write("                  <div class=\"detail-box\">\n");
      out.write("                    <h1>\n");
      out.write("                      Best Selling \n");
      out.write("                    </h1>\n");
      out.write("                    <p>\n");
      out.write("                      New arrivals, customer gratitude, many incentives, attractive gifts.\n");
      out.write("                    </p>\n");
      out.write("                    <div class=\"btn-box\">\n");
      out.write("                      <a href=\"\" class=\"btn1\">\n");
      out.write("                        Contact Us\n");
      out.write("                      </a>\n");
      out.write("                    </div>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-6\">\n");
      out.write("                  <div class=\"img-box\">\n");
      out.write("                    <img src=\"images/backgr1.png\" alt=\"\">\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"carousel-item \">\n");
      out.write("            <div class=\"container-fluid \">\n");
      out.write("              <div class=\"row\">\n");
      out.write("                <div class=\"col-md-6\">\n");
      out.write("                  <div class=\"detail-box\">\n");
      out.write("                    <h1>\n");
      out.write("                      Featured \n");
      out.write("                    </h1>\n");
      out.write("                    <p>\n");
      out.write("                      New arrivals, customer gratitude, many incentives, attractive gifts.\n");
      out.write("                    </p>\n");
      out.write("                    <div class=\"btn-box\">\n");
      out.write("                      <a href=\"\" class=\"btn1\">\n");
      out.write("                        Contact Us\n");
      out.write("                      </a>\n");
      out.write("                    </div>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-6\">\n");
      out.write("                  <div class=\"img-box\">\n");
      out.write("                    <img src=\"images/backgr2.png\" alt=\"\">\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <ol class=\"carousel-indicators\">\n");
      out.write("          <li data-target=\"#customCarousel1\" data-slide-to=\"0\" class=\"active\"></li>\n");
      out.write("          <li data-target=\"#customCarousel1\" data-slide-to=\"1\"></li>\n");
      out.write("          <li data-target=\"#customCarousel1\" data-slide-to=\"2\"></li>\n");
      out.write("        </ol>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("    </section>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("    <!-- Begin filter -->\n");
      out.write("    <section id=\"sidebar\">\n");
      out.write("    <p> Home | <b>All Iphones</b></p>\n");
      out.write("    <div class=\"border-bottom pb-2 ml-2\">\n");
      out.write("        <h4 id=\"burgundy\">Filters</h4>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"py-2 border-bottom ml-3\">\n");
      out.write("        <h6 class=\"font-weight-bold\">Categories</h6>\n");
      out.write("        <div id=\"orange\"><span class=\"fa fa-minus\"></span></div>\n");
      out.write("        \n");
      out.write("            ");

                List<Category> Clist = (List<Category>) session.getAttribute("listC");
                    for (Category cate : Clist) {
            
      out.write("\n");
      out.write("            <div class=\"form-group \">\n");
      out.write("                \n");
      out.write("                <a  href=\"tab?id=");
      out.print( cate.getId() );
      out.write(" \"active>");
      out.print( cate.getName());
      out.write("<a/>  \n");
      out.write("            </div>\n");
      out.write("            ");
 } 
      out.write("\n");
      out.write("        \n");
      out.write("    </div>\n");
      out.write("    <div class=\"py-2 border-bottom ml-3\">\n");
      out.write("        <h6 class=\"font-weight-bold\">Capacity</h6>\n");
      out.write("        <div id=\"orange\"><span class=\"fa fa-minus\"></span></div>\n");
      out.write("        <form>\n");
      out.write("            <div class=\"form-group\">  <label for=\"artisan\">32G</label> </div>\n");
      out.write("            <div class=\"form-group\">  <label for=\"artisan\">64G</label> </div>\n");
      out.write("            <div class=\"form-group\">  <label for=\"artisan\">128G</label> </div>\n");
      out.write("            <div class=\"form-group\">  <label for=\"artisan\">512G</label> </div>\n");
      out.write("            <div class=\"form-group\">  <label for=\"artisan\">1TB</label> </div>\n");
      out.write("        </form>\n");
      out.write("    <div/>  \n");
      out.write("</section>\n");
      out.write("    <!-- End filter -->\n");
      out.write("\n");
      out.write("    <!-- products section -->\n");
      out.write("    <section id=\"sanpham\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"d-flex flex-row\">\n");
      out.write("            <div class=\"ml-auto mr-lg-4\">\n");
      out.write("<!--                <div id=\"sorting\" class=\"border rounded p-1 m-1\"> <span class=\"text-muted\">Sort by</span> <select name=\"sort\" id=\"sort\">\n");
      out.write("                        <option value=\"name\"><b>Name</b></option>\n");
      out.write("                        <option value=\"prcie\"><b>Price</b></option>\n");
      out.write("                    </select> </div>-->\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div class=\"row\">\n");
      out.write("            ");

                        List<Product> list = (List<Product>) session.getAttribute("data");
                        for (Product c : list) {
                    
      out.write("\n");
      out.write("            <div class=\"col-lg-4 col-md-6 col-sm-10 offset-md-0 offset-sm-1\">\n");
      out.write("                <div class=\"card\"> <a href=\"detail?id=");
      out.print( c.getId());
      out.write("\"><img class=\"card-img-top\" src=\"");
      out.print( c.getImage());
      out.write("\"></a>\n");
      out.write("                    <div class=\"card-body\">\n");
      out.write("                        <h5><b>");
      out.print( c.getName());
      out.write("</b> </h5>\n");
      out.write("                        <div class=\"d-flex flex-row my-2\">\n");
      out.write("                            <div class=\"text-muted\"><i class=\"fa fa-dollar-sign\"></i>");
      out.print( c.getPrice());
      out.write("</div>\n");
      out.write("                            <div class=\"ml-auto\"> <button class=\"border rounded bg-white sign\"><span class=\"fa fa-plus\" id=\"orange\"></span></button> <span class=\"px-sm-1\">");
      out.print( c.getQuantity());
      out.write("</span> </div>\n");
      out.write("                        </div> \n");
      out.write("                        <form name=\"f\" action=\"process\" method=\"post\">\n");
      out.write("                        <button class=\"btn w-100 rounded my-2\">Add to cart</a></button>\n");
      out.write("                                <input type=\"hidden\" name=\"id\" value=\"");
      out.print(c.getId());
      out.write("\"/>\n");
      out.write("                                <input type=\"hidden\" name=\"action\" value=\"additem\"/>\n");
      out.write("                        </form> \n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            ");
 } 
      out.write("\n");
      out.write("        </div>\n");
      out.write("        </div>\n");
      out.write("    </section>\n");
      out.write("        <div class=\"clearfix\">\n");
      out.write("                <ul class=\"pagination\">\n");
      out.write("                    <li>");
      if (_jspx_meth_c_set_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                        <div class=\"pagination\">\n");
      out.write("                    ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("  <!-- feature section -->\n");
      out.write("  <section class=\"feature_section layout_padding\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <div class=\"heading_container\">\n");
      out.write("        <h2>\n");
      out.write("          Features Of Our IPhones\n");
      out.write("        </h2>\n");
      out.write("        <p>\n");
      out.write("          Outstanding features.\n");
      out.write("        </p>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"row\">\n");
      out.write("        <div class=\"col-sm-6 col-lg-3\">\n");
      out.write("          <div class=\"box\">\n");
      out.write("            <div class=\"img-box\">\n");
      out.write("              <img src=\"images/cam.jpg\" alt=\"\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"detail-box\">\n");
      out.write("              <h5>\n");
      out.write("                Rear Camera\n");
      out.write("              </h5>\n");
      out.write("              <p>\n");
      out.write("                12MP wide-angle camera, 12MP ultra-wide-angle camera, 12MP font removal.\n");
      out.write("              </p>\n");
      out.write("              <a href=\"https://www.thegioididong.com/tin-tuc/danh-gia-camera-iphone-13-pro-max-1385552\">\n");
      out.write("                <span>\n");
      out.write("                  Read More\n");
      out.write("                </span>\n");
      out.write("                <i class=\"fas fa-long-arrow-alt-right\"></i>\n");
      out.write("              </a>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-sm-6 col-lg-3\">\n");
      out.write("          <div class=\"box\">\n");
      out.write("            <div class=\"img-box\">\n");
      out.write("              <img src=\"images/1tb.jpg\" alt=\"\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"detail-box\">\n");
      out.write("              <h5>\n");
      out.write("                Capacity 1TB\n");
      out.write("              </h5>\n");
      out.write("              <p>\n");
      out.write("                iPhone 13 Pro and 13 Pro Max will probably be equipped with up to 1 terabyte of memory by Apple, double the 512 GB level of the previous generation.\n");
      out.write("              </p>\n");
      out.write("              <a href=\"https://vnexpress.net/iphone-13-pro-se-co-phien-ban-bo-nho-1-tb-4342869.html\">\n");
      out.write("                <span>\n");
      out.write("                  Read More\n");
      out.write("                </span>\n");
      out.write("                <i class=\"fas fa-long-arrow-alt-right\"></i>\n");
      out.write("              </a>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-sm-6 col-lg-3\">\n");
      out.write("          <div class=\"box\">\n");
      out.write("            <div class=\"img-box\">\n");
      out.write("              <img src=\"images/pin.jpg\" alt=\"\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"detail-box\">\n");
      out.write("              <h5>\n");
      out.write("                Good Battery\n");
      out.write("              </h5>\n");
      out.write("              <p>\n");
      out.write("                Significantly improved compared to its predecessor, iPhone 13 Pro Max works continuously for nearly 10 hours.\n");
      out.write("              </p>\n");
      out.write("              <a href=\"https://www.thegioididong.com/tin-tuc/danh-gia-pin-iphone-13-series-1386049\">\n");
      out.write("                <span>\n");
      out.write("                  Read More\n");
      out.write("                </span>\n");
      out.write("                <i class=\"fas fa-long-arrow-alt-right\"></i>\n");
      out.write("              </a>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-sm-6 col-lg-3\">\n");
      out.write("          <div class=\"box\">\n");
      out.write("            <div class=\"img-box\">\n");
      out.write("              <img src=\"images/120Hz.jpg\" alt=\"\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"detail-box\">\n");
      out.write("              <h5>\n");
      out.write("                ProMotion 120Hz display\n");
      out.write("              </h5>\n");
      out.write("              <p>\n");
      out.write("                Apple has integrated it with a 120Hz display, a system dubbed ProMotion.\n");
      out.write("              </p>\n");
      out.write("              <a href=\"https://fptshop.com.vn/tin-tuc/danh-gia/thong-tin-can-biet-ve-man-hinh-120hz-cua-iphone-13-pro-139907\">\n");
      out.write("                <span>\n");
      out.write("                  Read More\n");
      out.write("                </span>\n");
      out.write("                <i class=\"fas fa-long-arrow-alt-right\"></i>\n");
      out.write("              </a>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"btn-box\">\n");
      out.write("        <a href=\"AboutUs.jsp\">\n");
      out.write("          View More\n");
      out.write("        </a>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </section>\n");
      out.write("  <!-- end feature section -->\n");
      out.write("\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
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
      out.write("</html>\n");
      out.write("\n");
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

  private boolean _jspx_meth_c_set_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_0.setPageContext(_jspx_page_context);
    _jspx_th_c_set_0.setParent(null);
    _jspx_th_c_set_0.setVar("page");
    _jspx_th_c_set_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.page}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
    if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_end_begin.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setBegin(((java.lang.Integer) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${1}", java.lang.Integer.class, (PageContext)_jspx_page_context, null)).intValue());
    _jspx_th_c_forEach_0.setEnd(((java.lang.Integer) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.num}", java.lang.Integer.class, (PageContext)_jspx_page_context, null)).intValue());
    _jspx_th_c_forEach_0.setVar("i");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                        <a class=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i==page?\"active\":\"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" href=\"home?page=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("&id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a>\n");
          out.write("                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_end_begin.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
