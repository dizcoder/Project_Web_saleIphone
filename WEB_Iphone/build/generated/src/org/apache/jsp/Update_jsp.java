package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Update_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Add</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/login.css\">   \n");
      out.write("        <style type=\"text/css\">\n");
      out.write("            body{\n");
      out.write("                background-image: url(images/signup.jpg);\n");
      out.write("                background-size: cover;\n");
      out.write("                height: 100%;\n");
      out.write("                margin: 0;\n");
      out.write("            }\n");
      out.write("            .login-box {\n");
      out.write("                background: rgba(0,0,0,.5);\n");
      out.write("            }\n");
      out.write("            .login-box h2{\n");
      out.write("                color:#03e9f4\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("<body>\n");
      out.write("    <h2><a href=\"list\">Back</a></h2>\n");
      out.write("        <div class=\"login-box\">\n");
      out.write("            ");

                    if (session.getAttribute("mess") != null) {
                
      out.write("\n");
      out.write("                <h2 id=\"h2\" style=\"color:red\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.mess}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h2>\n");
      out.write("                ");

                        session.removeAttribute("mess");
                    }
                
      out.write(" \n");
      out.write("  <h2>Update iphone</h2>\n");
      out.write("  <form action=\"update\" method=\"post\">\n");
      out.write("      <div class=\"user-box\">\n");
      out.write("      <input type=\"number\" name=\"id\" required>\n");
      out.write("      <label>Enter id</label>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"user-box\">\n");
      out.write("      <input type=\"text\" name=\"name\" required>\n");
      out.write("      <label>Enter name</label>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"user-box\">\n");
      out.write("      <input type=\"number\" name=\"price\" required>\n");
      out.write("      <label>Enter price</label>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"user-box\">\n");
      out.write("      <input type=\"number\" name=\"discount\" required>\n");
      out.write("      <label>Enter discount</label>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"user-box\">\n");
      out.write("      <input type=\"text\" name=\"image\" required>\n");
      out.write("      <label>Enter image</label>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"user-box\">\n");
      out.write("      <input type=\"text\" name=\"color\" required>\n");
      out.write("      <label>Enter color</label>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"user-box\">\n");
      out.write("      <input type=\"number\" name=\"size\" required>\n");
      out.write("      <label>Enter size</label>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"user-box\">\n");
      out.write("      <input type=\"number\" name=\"quantity\" required>\n");
      out.write("      <label>Enter quantity</label>\n");
      out.write("    </div>         \n");
      out.write("    <a href=\"#\">\n");
      out.write("      <span></span>\n");
      out.write("      <span></span>\n");
      out.write("      <span></span>\n");
      out.write("      <span></span>\n");
      out.write("      <input type=\"submit\" value=\"Update\">\n");
      out.write("    </a>\n");
      out.write("  </form>\n");
      out.write("</div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write('\n');
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
