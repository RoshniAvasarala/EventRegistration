/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.44
 * Generated at: 2021-03-29 23:55:35 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.util.Iterator;
import java.util.List;
import com.Roshni.DBConnection.MyConnection;
import com.Roshni.DAO.Event_DAO;
import com.Roshni.Entity.Events;
import com.sun.org.glassfish.gmbal.IncludeSubclass;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("com.Roshni.Entity.Events");
    _jspx_imports_classes.add("java.util.Iterator");
    _jspx_imports_classes.add("com.Roshni.DBConnection.MyConnection");
    _jspx_imports_classes.add("com.sun.org.glassfish.gmbal.IncludeSubclass");
    _jspx_imports_classes.add("java.sql.ResultSet");
    _jspx_imports_classes.add("com.Roshni.DAO.Event_DAO");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Event Registration</title>\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "common/cdn.jsp", out, false);
      out.write("\r\n");
      out.write("<link rel = \"stylesheet\" href=\"CSS/common.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "common/header.jsp", out, false);
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t<!-- Banner Section -->\r\n");
      out.write("\t<div class = \"banner\">\r\n");
      out.write("\t\t<img class = \"banner-image\" src = \"images/events/Upcoming-Events-Banner.jpg\">\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<!--Events section  -->\r\n");
      out.write("\t<div class = \"container-fluid\">\r\n");
      out.write("\t<div class = \"row\">\r\n");
      out.write("\t\t");

			Event_DAO ed = new Event_DAO(MyConnection.connectTo());
			List list = ed.getAll();
			Iterator it2 = list.iterator();
			while(it2.hasNext()){
				Events events = (Events)it2.next();
				
      out.write("\r\n");
      out.write("\t\t\t\t<div class = \"col-sm-3\">\r\n");
      out.write("\t\t\t\t\t<div class = \"events_wrapper\">\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<img onclick=\"getEventPage('");
      out.print( events.getId());
      out.write("') \"  alt=\"#\" src=\"images/events/");
      out.print(events.getFile_name()!=null?events.getFile_name():"default.png" );
      out.write("\" class = \"pimg\">\r\n");
      out.write("\t\t\t\t\t\t<div class = \"event_title\">");
      out.print( events.getTitle() );
      out.write("</div>\r\n");
      out.write("\t\t\t\t\t\t<div class = \"event_date_time\">");
      out.print( events.getDate_time() );
      out.write("</div>\r\n");
      out.write("\t\t\t\t\t\t<div class = \"event_cost\">");
      out.print( events.getCost()+"$" );
      out.write("</div>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<div class = \"action-wrapper\">\r\n");
      out.write("\t\t\t\t\t\t<a class = \"btn btn-primary\" onclick=\"Addtocart('");
      out.print( events.getId());
      out.write("')\">Add to cart</a>\r\n");
      out.write("\t\t\t\t\t\t<a class = \"btn btn-success\" href=\"#\">Register Now!!</a>\r\n");
      out.write("\t\t\t\t\t\t</div>\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t");

			}
		
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "common/footer.jsp", out, false);
      out.write("\r\n");
      out.write("\t<script>\r\n");
      out.write("\t\tfunction Addtocart(id){\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t$.post(\"addtocart\",{\r\n");
      out.write("\t\t\t\tid: id\r\n");
      out.write("\t\t\t}, function (data,status) {\r\n");
      out.write("\t\t\t\t$(\".stickyEventList\").text(data + \" Events added\");\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t}\r\n");
      out.write("\t</script>\r\n");
      out.write("\t<div class = \"stickyEventList\" onclick=\"window.location.href='cart-items.jsp'\">\r\n");
      out.write("\t\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<script>\r\n");
      out.write("\t\tfunction getEventPage(id){\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t$.post(\"eventpage\",{\r\n");
      out.write("\t\t\t\tid: id\r\n");
      out.write("\t\t\t}, function (data,status) {\r\n");
      out.write("\t\t\t\talert(data);\r\n");
      out.write("\t\t\t\twindow.location.href=\"event_page.jsp\"\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t}\r\n");
      out.write("\t</script>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
