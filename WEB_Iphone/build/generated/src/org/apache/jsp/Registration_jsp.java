package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Registration_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>SIGN UP</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/login.css\">   \n");
      out.write("        <style type=\"text/css\">\n");
      out.write("            body{\n");
      out.write("                background-image: url(images/backlogin.jpg);\n");
      out.write("                background-size: cover;\n");
      out.write("                height: 100%;\n");
      out.write("                margin: 0;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("<body>\n");
      out.write("    \n");
      out.write("  <div class=\"login-box\">\n");
      out.write("      <h2><a href=\"Login.jsp\">Back</a></h2>\n");
      out.write("      ");

        if(session.getAttribute("msg")==null){ 
        }else{
      
      out.write("\n");
      out.write("                <h2>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.msg}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h2>\n");
      out.write("            ");

                session.removeAttribute("msg");
                }
            
      out.write("\n");
      out.write("  <h2>SIGN UP</h2>\n");
      out.write("  <form action=\"signup\" method=\"get\">\n");
      out.write("    <div class=\"user-box\">\n");
      out.write("      <input type=\"text\" name=\"acc\" required=\"\">\n");
      out.write("      <label>Username</label>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"user-box\">\n");
      out.write("      <input type=\"password\" name=\"pass\" required=\"\">\n");
      out.write("      <label>Password</label>\n");
      out.write("    </div>\n");
      out.write("    <a href=\"Login.jsp\">\n");
      out.write("      <span></span>\n");
      out.write("      <span></span>\n");
      out.write("      <span></span>\n");
      out.write("      <span></span>\n");
      out.write("      <input type=\"submit\" value=\"Sign up\"/>\n");
      out.write("    </a>\n");
      out.write("  </form>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</body>\n");
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
}
