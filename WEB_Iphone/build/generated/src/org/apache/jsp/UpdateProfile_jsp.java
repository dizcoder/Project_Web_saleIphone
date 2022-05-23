package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class UpdateProfile_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>profile</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container rounded bg-white mt-5 mb-5\">\n");
      out.write("    <div class=\"row\">\n");
      out.write("        <div class=\"col-md-3 border-right\">\n");
      out.write("            <div class=\"d-flex flex-column align-items-center text-center p-3 py-5\"><img class=\"rounded-circle mt-5\" src=\"https://i.imgur.com/O1RmJXT.jpg\" width=\"90\"><span class=\"font-weight-bold\">John Doe</span><span class=\"text-black-50\">john_doe12@bbb.com</span><span>United States</span></div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-md-5 border-right\">\n");
      out.write("            <div class=\"p-3 py-5\">\n");
      out.write("                <div class=\"d-flex justify-content-between align-items-center mb-3\">\n");
      out.write("                    <h6 class=\"text-right\">Edit your profile</h6>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"row mt-2\">\n");
      out.write("                    <div class=\"col-md-6\"><label class=\"labels\">Name</label><input type=\"text\" class=\"form-control\" placeholder=\"first name\" value=\"John\"></div>\n");
      out.write("                    <div class=\"col-md-6\"><label class=\"labels\">Surname</label><input type=\"text\" class=\"form-control\" value=\"Doe\" placeholder=\"Doe\"></div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"row mt-3\">\n");
      out.write("                    <div class=\"col-md-12\"><label class=\"labels\">Headline</label><input type=\"text\" class=\"form-control\" placeholder=\"headline\" value=\"UI/UX Developer\"></div>\n");
      out.write("                    <div class=\"col-md-12\"><label class=\"labels\">Current position</label><input type=\"text\" class=\"form-control\" placeholder=\"headline\" value=\"UI/UX Developer at Boston\"></div>\n");
      out.write("                    <div class=\"col-md-12\"><label class=\"labels\">Education</label><input type=\"text\" class=\"form-control\" placeholder=\"education\" value=\"Boston University\"></div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"row mt-3\">\n");
      out.write("                    <div class=\"col-md-6\"><label class=\"labels\">Country</label><input type=\"text\" class=\"form-control\" placeholder=\"country\" value=\"USA\"></div>\n");
      out.write("                    <div class=\"col-md-6\"><label class=\"labels\">State/Region</label><input type=\"text\" class=\"form-control\" value=\"Boston\" placeholder=\"state\"></div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"mt-5 text-center\"><button class=\"btn btn-primary profile-button\" type=\"button\">Save Profile</button></div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-md-4\">\n");
      out.write("            <div class=\"p-3 py-5\">\n");
      out.write("                <div class=\"d-flex justify-content-between align-items-center experience\"><span>Edit Experience</span><span class=\"border px-3 p-1 add-experience\"><i class=\"fa fa-plus\"></i>&nbsp;Experience</span></div>\n");
      out.write("                <div class=\"d-flex flex-row mt-3 exp-container\"><img src=\"https://i.imgur.com/azSfBM3.png\" width=\"45\" height=\"45\">\n");
      out.write("                    <div class=\"work-experience ml-1\"><span class=\"font-weight-bold d-block\">Senior UI/UX Designer</span><span class=\"d-block text-black-50 labels\">Twitter Inc.</span><span class=\"d-block text-black-50 labels\">March,2017 - May 2020</span></div>\n");
      out.write("                </div>\n");
      out.write("                <hr>\n");
      out.write("                <div class=\"d-flex flex-row mt-3 exp-container\"><img src=\"https://img.icons8.com/color/100/000000/facebook.png\" width=\"45\" height=\"45\">\n");
      out.write("                    <div class=\"work-experience ml-1\"><span class=\"font-weight-bold d-block\">Senior UI/UX Designer</span><span class=\"d-block text-black-50 labels\">Facebook Inc.</span><span class=\"d-block text-black-50 labels\">March,2017 - May 2020</span></div>\n");
      out.write("                </div>\n");
      out.write("                <hr>\n");
      out.write("                <div class=\"d-flex flex-row mt-3 exp-container\"><img src=\"https://img.icons8.com/color/50/000000/google-logo.png\" width=\"45\" height=\"45\">\n");
      out.write("                    <div class=\"work-experience ml-1\"><span class=\"font-weight-bold d-block\">UI/UX Designer</span><span class=\"d-block text-black-50 labels\">Google Inc.</span><span class=\"d-block text-black-50 labels\">March,2017 - May 2020</span></div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
