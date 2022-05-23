package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.Account;
import model.Item;
import model.Cart;
import model.Category;
import java.util.List;
import model.Product;

public final class Cart_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_fmt_formatNumber_value_pattern_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_fmt_formatNumber_value_pattern_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_set_var_value_nobody.release();
    _jspx_tagPool_fmt_formatNumber_value_pattern_nobody.release();
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("  <!-- bootstrap core css -->\n");
      out.write("  <link rel=\"stylesheet\" type=\"text/css\" href=\"css/bootstrap.css\" />\n");
      out.write("  <!--owl slider stylesheet -->\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css\" />\n");
      out.write("  <!-- font awesome style -->\n");
      out.write("  <link href=\"css/font-awesome.min.css\" rel=\"stylesheet\" />\n");
      out.write("  <!-- Custom styles for this template -->\n");
      out.write("  <link href=\"css/style.css\" rel=\"stylesheet\" />\n");
      out.write("  <!-- responsive style -->\n");
      out.write("  <link href=\"css/responsive.css\" rel=\"stylesheet\" />\n");
      out.write("\n");
      out.write("      <link href=\"https://fonts.googleapis.com/css?family=Roboto+Condensed\" rel=\"stylesheet\">  \n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\">   \n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"> </script>  \n");
      out.write("    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js\"> </script>\n");
      out.write("    \n");
      out.write("  \n");
      out.write("</head>\n");
      out.write("<style>\n");
      out.write("    body {  \n");
      out.write("        .button {\n");
      out.write("            color: #F44336\n");
      out.write("        }\n");
      out.write("    background-color: #f5f5f5;  \n");
      out.write("}  \n");
      out.write(".Product-img img{  \n");
      out.write("    width: 100%;  \n");
      out.write("}  \n");
      out.write(".main-section{  \n");
      out.write("    font-family: 'Roboto Condensed', sans-serif;  \n");
      out.write("    margin-top:100px;  \n");
      out.write("}  \n");
      out.write("h2 {  \n");
      out.write("    color: green;  \n");
      out.write("}  \n");
      out.write("h4 {  \n");
      out.write("    color: red;  \n");
      out.write("}  \n");
      out.write("strong {  \n");
      out.write("    color: red;  \n");
      out.write("}  \n");
      out.write("#nomargin p {  \n");
      out.write("    color: green;  \n");
      out.write("}  \n");
      out.write("h5 {  \n");
      out.write("    color: red;  \n");
      out.write("}  \n");
      out.write(".feature_section {\n");
      out.write("        background-color: #86cfda;\n");
      out.write("    }\n");
      out.write("* {\n");
      out.write("    box-sizing: border-box\n");
      out.write("}\n");
      out.write("\n");
      out.write("#search {\n");
      out.write("    outline: none;\n");
      out.write("    border: none;\n");
      out.write("    display: inline-block\n");
      out.write("}\n");
      out.write("\n");
      out.write("#burgundy {\n");
      out.write("    color: rgb(153, 40, 59)\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write(".fa-search {\n");
      out.write("    font-size: 20px;\n");
      out.write("    padding: 10px;\n");
      out.write("    margin-bottom: 3px;\n");
      out.write("    padding-right: 20px\n");
      out.write("}\n");
      out.write("\n");
      out.write(".search-nav-item {\n");
      out.write("    height: 40px\n");
      out.write("}\n");
      out.write("\n");
      out.write("nav {\n");
      out.write("    padding: 0px 100px\n");
      out.write("}\n");
      out.write(".form-group:last-child {\n");
      out.write("    margin-bottom: 0\n");
      out.write("}\n");
      out.write("\n");
      out.write("h6 {\n");
      out.write("    margin-bottom: 0px\n");
      out.write("}\n");
      out.write("\n");
      out.write("#sort {\n");
      out.write("    outline: none;\n");
      out.write("    border: none\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write(".btn:hover {\n");
      out.write("    color: #fff;\n");
      out.write("    background-color: orange\n");
      out.write("}\n");
      out.write("@media(max-width:575px) {\n");
      out.write("    .search-nav-item {\n");
      out.write("        margin: 0;\n");
      out.write("        width: 100%;\n");
      out.write("        margin-top: 10px\n");
      out.write("    }  \n");
      out.write("}\n");
      out.write(".hero_area{\n");
      out.write("    min-height: 20px;\n");
      out.write("}\n");
      out.write(".header_section{\n");
      out.write("    background-color: #86cfda\n");
      out.write("}\n");
      out.write(".footer_section{\n");
      out.write("    clear: both;\n");
      out.write("}\n");
      out.write(".footer, .push {\n");
      out.write("    height: 142px; /* .push must be the same height as .footer */\n");
      out.write("}\n");
      out.write("td.action {\n");
      out.write("    display: flex;\n");
      out.write("}\n");
      out.write("button.btn.btn-more.btn-sm{\n");
      out.write("    background-color: #FFC107\n");
      out.write("}\n");
      out.write("input.search-domain.btn.btn-primary.px-1{\n");
      out.write("    background-color: #fff;\n");
      out.write("    color:#F44336;\n");
      out.write("}\n");
      out.write("input.search-domain.btn.btn-primary.px-1:hover{\n");
      out.write("    background-color: #FFC107 \n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<div class=\"hero_area\">\n");
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
      out.write("              <li class=\"nav-item \">\n");
      out.write("                <a class=\"nav-link\" href=\"home?page=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${1}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">Home <span class=\"sr-only\">(current)</span></a>\n");
      out.write("              </li>\n");
      out.write("              <li class=\"nav-item\">\n");
      out.write("                <a class=\"nav-link\" href=\"AboutUs.jsp\"> About </a>\n");
      out.write("              </li>\n");
      out.write("              <li class=\"nav-item\">\n");
      out.write("                <a class=\"nav-link\" href=\"Contact.jsp\">Contact Us</a>\n");
      out.write("              </li>\n");
      out.write("              <li class=\"nav-item\">\n");
      out.write("              ");

                if (session.getAttribute("admin") != null) {
              
      out.write("\n");
      out.write("                <a class=\"nav-link\" href=\"logout\">Log out</a>\n");
      out.write("                ");

                    } else {
                
      out.write("\n");
      out.write("                <a class=\"nav-link\" href=\"Login.jsp\">Login</a>\n");
      out.write("                ");

                    }
                
      out.write("\n");
      out.write("              </li>  \n");
      out.write("            </ul>\n");
      out.write("              <i class=\"fas fa-search\"></i>\n");
      out.write("              <form id=\"search-form\" action=\"search\" method=\"get\">\n");
      out.write("                    <input type=\"text\" placeholder=\"Search\" name=\"name\">\n");
      out.write("                    <input type=\"submit\" class=\"search-domain btn btn-primary px-1\" value=\"Search\">\n");
      out.write("              </form>\n");
      out.write("            <div class=\"user_option-box\">\n");
      out.write("              <a href=\"UpdateProfile.jsp\">\n");
      out.write("                <i class=\"fas fa-user-alt\"></i>\n");
      out.write("              </a>\n");
      out.write("              <a href=\"Cart.jsp\">\n");
      out.write("                <i class=\"fas fa-cart-plus\"></i>\n");
      out.write("              </a>\n");
      out.write("                <a></a>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </nav>\n");
      out.write("      </div>\n");
      out.write("    </header>\n");
      out.write("    <!-- end header section -->\n");
      out.write("    \n");
      out.write("</div>\n");
      out.write("\n");
      out.write("   <body>  \n");
      out.write("       ");
      if (_jspx_meth_c_set_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("       \n");
      out.write("       \n");
      out.write("    <div class=\"container main-section\">  \n");
      out.write("        <div class=\"row\">  \n");
      out.write("            <div class=\"col-lg-12 pb-2\">  \n");
      out.write("                <h2> Customer Cart </h2>  \n");
      out.write("            </div>  \n");
      out.write("            <div class=\"col-lg-12 pl-3 pt-3\">  \n");
      out.write("                <table class=\"table table-hover border bg-white\">  \n");
      out.write("                    <thead>  \n");
      out.write("                        <tr>  \n");
      out.write("                            <th> <h4> <b>  Product Details </b> </h4> </th>  \n");
      out.write("                            <th> <h4> <b> Price </h4> <b> </th>  \n");
      out.write("                            <th style=\"width:10%;\"> <h4> <b> Quantity <b> </h4> </th>  \n");
      out.write("                            <th> <h4> <b> Subtotal <b> </h4> </th>  \n");
      out.write("                            <th> <h4> <b> Action <b> </h4> </th>  \n");
      out.write("                        </tr>  \n");
      out.write("                    </thead>\n");
      out.write("                    \n");
      out.write("        ");

            if (session.getAttribute("messPayment") != null) {
        
      out.write("\n");
      out.write("        <h1 style=\"color: #e0a800\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.messPayment}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h1>  \n");
      out.write("        ");

            }
        
      out.write("\n");
      out.write("        ");

            if (session.getAttribute("mess") != null) {
        
      out.write("\n");
      out.write("        <h1 style=\"color: #e0a800\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.messPayment}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h1>  \n");
      out.write("        ");

            }
        
      out.write("\n");
      out.write("                    <tbody> \n");
      out.write("                        ");

                            if (session.getAttribute("cart") != null) {
                                Cart cart = (Cart) session.getAttribute("cart");
                                List<Item> list = cart.getItems();
                                for (Item t : list) {
                        
      out.write("\n");
      out.write("                        <tr> \n");
      out.write("                            <td>  \n");
      out.write("                                <div class=\"row\">  \n");
      out.write("                                    <div class=\"col-lg-2 Product-img\">  \n");
      out.write("                                        <img src=\"");
      out.print(t.getProduct().getImage());
      out.write("\" alt=\"...\" class=\"img-responsive\"/>  \n");
      out.write("                                    </div>  \n");
      out.write("                                    <div class=\"col-lg-10\">  \n");
      out.write("                                        <h5 class=\"nomargin\"> <b>  ");
      out.print(t.getProduct().getName());
      out.write("</b> </h5>  \n");
      out.write("                                        <p> Preferential products, attractive gifts including: 20W charger, Airpod 2 headset, genuine Apple case, ... \n");
      out.write("                                            company warranty up to 12 months, free warranty exchange. </p>  \n");
      out.write("                                    </div>  \n");
      out.write("                                </div>  \n");
      out.write("                            </td>  \n");
      out.write("                            <td> <strong> ");
      out.print(t.getProduct().getPrice());
      out.write(" </strong> </td>  \n");
      out.write("                            <td data-th=\"Quantity\">\n");
      out.write("                                <form action=\"process\" method=\"get\">\n");
      out.write("                                    <button class=\"btn btn-more btn-sm\"><a href=\"process?num=-1&id=");
      out.print(t.getProduct().getId());
      out.write("\">-</a></button>\n");
      out.write("                                    ");
      out.print(t.getQuantity());
      out.write("\n");
      out.write("                                    <button class=\"btn btn-more btn-sm\"><a href=\"process?num=1&id=");
      out.print(t.getProduct().getId());
      out.write("\">+</a></button>\n");
      out.write("                                </form>\n");
      out.write("                            </td>  \n");
      out.write("                            <td> <strong> ");
      //  fmt:formatNumber
      org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag _jspx_th_fmt_formatNumber_0 = (org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag) _jspx_tagPool_fmt_formatNumber_value_pattern_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag.class);
      _jspx_th_fmt_formatNumber_0.setPageContext(_jspx_page_context);
      _jspx_th_fmt_formatNumber_0.setParent(null);
      _jspx_th_fmt_formatNumber_0.setPattern("##.#");
      _jspx_th_fmt_formatNumber_0.setValue(t.getProduct().getPrice()* t.getQuantity());
      int _jspx_eval_fmt_formatNumber_0 = _jspx_th_fmt_formatNumber_0.doStartTag();
      if (_jspx_th_fmt_formatNumber_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_fmt_formatNumber_value_pattern_nobody.reuse(_jspx_th_fmt_formatNumber_0);
        return;
      }
      _jspx_tagPool_fmt_formatNumber_value_pattern_nobody.reuse(_jspx_th_fmt_formatNumber_0);
      out.write(" </strong> </td>  \n");
      out.write("                            <td class=\"action\" data-th=\"\" style=\"width:10%;\">  \n");
      out.write("\n");
      out.write("                                <form action=\"process\" method=\"post\">\n");
      out.write("                                    <button class=\"btn btn-danger btn-sm\"> <i class=\"fa fa-trash-o\"> </i></button>\n");
      out.write("                                    <input type=\"hidden\" name=\"id\" value=\"");
      out.print(t.getProduct().getId());
      out.write("\"/>\n");
      out.write("                                    <input type=\"hidden\" name=\"action\" value=\"removeitem\"/>\n");
      out.write("                                </form>\n");
      out.write("                                                               \n");
      out.write("                            </td>  \n");
      out.write("                        </tr>  \n");
      out.write("                        ");

                            }
                        
      out.write("  \n");
      out.write("                          \n");
      out.write("                    </tbody>  \n");
      out.write("                    <tfoot>  \n");
      out.write("                        <tr>  \n");
      out.write("                            <td> <a href=\"home?page=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${1}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"btn btn-success \"> <i class=\"fa fa-angle-left\"> </i> Continue Shopping </a> </td>  \n");
      out.write("                            <td colspan=\"2\" class=\"hidden-xs\"> </td>  \n");
      out.write("                            <td class=\"hidden-xs text-center\" style=\"width:10%;\"> <strong> Total Price : ");
      //  fmt:formatNumber
      org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag _jspx_th_fmt_formatNumber_1 = (org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag) _jspx_tagPool_fmt_formatNumber_value_pattern_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag.class);
      _jspx_th_fmt_formatNumber_1.setPageContext(_jspx_page_context);
      _jspx_th_fmt_formatNumber_1.setParent(null);
      _jspx_th_fmt_formatNumber_1.setPattern("##.#");
      _jspx_th_fmt_formatNumber_1.setValue(cart.getTotalMoney());
      int _jspx_eval_fmt_formatNumber_1 = _jspx_th_fmt_formatNumber_1.doStartTag();
      if (_jspx_th_fmt_formatNumber_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_fmt_formatNumber_value_pattern_nobody.reuse(_jspx_th_fmt_formatNumber_1);
        return;
      }
      _jspx_tagPool_fmt_formatNumber_value_pattern_nobody.reuse(_jspx_th_fmt_formatNumber_1);
      out.write("  </strong> </td>  \n");
      out.write("                            <td> \n");
      out.write("                                <form action=\"checkout\" method=\"post\">\n");
      out.write("                                <input class=\"btn btn-success btn-block\" type=\"submit\" value=\"Check Out\" >\n");
      out.write("                                </form>\n");
      out.write("                            </td>  \n");
      out.write("                        </tr> \n");
      out.write("                        ");

                            }
                        
      out.write("\n");
      out.write("                    </tfoot>\n");
      out.write("                </table>  \n");
      out.write("            </div>  \n");
      out.write("        </div>  \n");
      out.write("    </div>\n");
      out.write("                            \n");
      out.write("</body> \n");
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
    _jspx_th_c_set_0.setVar("size");
    _jspx_th_c_set_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.size}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
    if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
    return false;
  }
}
