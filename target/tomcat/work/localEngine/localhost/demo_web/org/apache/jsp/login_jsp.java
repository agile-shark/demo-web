package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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

      out.write("<!--\r\n");
      out.write(" Licensed to the Apache Software Foundation (ASF) under one or more\r\n");
      out.write("  contributor license agreements.  See the NOTICE file distributed with\r\n");
      out.write("  this work for additional information regarding copyright ownership.\r\n");
      out.write("  The ASF licenses this file to You under the Apache License, Version 2.0\r\n");
      out.write("  (the \"License\"); you may not use this file except in compliance with\r\n");
      out.write("  the License.  You may obtain a copy of the License at\r\n");
      out.write("\r\n");
      out.write("      http://www.apache.org/licenses/LICENSE-2.0\r\n");
      out.write("\r\n");
      out.write("  Unless required by applicable law or agreed to in writing, software\r\n");
      out.write("  distributed under the License is distributed on an \"AS IS\" BASIS,\r\n");
      out.write("  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.\r\n");
      out.write("  See the License for the specific language governing permissions and\r\n");
      out.write("  limitations under the License.\r\n");
      out.write("-->\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("/*function check(){\r\n");
      out.write("\tif(window != top)\r\n");
      out.write("\t\ttop.location = \"");
      out.print(request.getContextPath() );
      out.write("/index.jsp\";\r\n");
      out.write("}*/\r\n");
      out.write("</script>\r\n");
      out.write("<title>Login Page for Examples</title></head>\r\n");
      out.write("<body onload=\"check();\">\r\n");
      out.write("<form method=\"POST\" action='");
      out.print( response.encodeURL("j_spring_security_check") );
      out.write("' >\r\n");
      out.write("  <table border=\"0\" cellspacing=\"5\">\r\n");
      out.write("    <tr>\r\n");
      out.write("      <th align=\"right\">Username:</th>\r\n");
      out.write("      <td align=\"left\"><input type=\"text\" name=\"j_username\"></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <th align=\"right\">Password:</th>\r\n");
      out.write("      <td align=\"left\"><input type=\"password\" name=\"j_password\"></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td align=\"right\"><input type=\"submit\" value=\"Log In\"></td>\r\n");
      out.write("      <td align=\"left\"><input type=\"reset\"></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("  </table>\r\n");
      out.write("</form>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
