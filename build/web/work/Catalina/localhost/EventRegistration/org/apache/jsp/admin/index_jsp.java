/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.44
 * Generated at: 2021-03-26 16:04:24 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.apache.jasper.tagplugins.jstl.core.If;
import com.Roshni.Entity.Register;
import com.Roshni.Entity.Register;
import java.util.ListIterator;
import java.util.List;
import com.Roshni.DBConnection.MyConnection;
import com.Roshni.DAO.RegisterDAO;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("jar:file:/C:/Users/roshn/Desktop/EventRegistration/build/web/wtpwebapps/EventRegistration/WEB-INF/lib/standard.jar!/META-INF/c.tld", Long.valueOf(1098729090000L));
    _jspx_dependants.put("/WEB-INF/lib/standard.jar", Long.valueOf(1357519650000L));
    _jspx_dependants.put("/admin/common/sidebar.jsp", Long.valueOf(1616450189621L));
    _jspx_dependants.put("/admin/../login-check.jsp", Long.valueOf(1616391521814L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("com.Roshni.Entity.Register");
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("org.apache.jasper.tagplugins.jstl.core.If");
    _jspx_imports_classes.add("java.util.ListIterator");
    _jspx_imports_classes.add("com.Roshni.DBConnection.MyConnection");
    _jspx_imports_classes.add("com.Roshni.DAO.RegisterDAO");
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
      out.write(" \r\n");
      out.write("\r\n");
      out.write(" ");
 
 if(session.getAttribute("rg")!= null){
	  Register rg = (Register)session.getAttribute("rg");
	 
 }else{
	 response.sendRedirect("../login.jsp");
 }
	  
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
      out.write("<title>Admin portal</title>\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "common/cdn.jsp", out, false);
      out.write("\r\n");
      out.write("<link  href=\"common/common.css\" rel = \"stylesheet\" type = \"text/css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "common/header.jsp", out, false);
      out.write("\r\n");
      out.write("<div class = \"containerfluid\">\r\n");
      out.write("\t\r\n");
      out.write("\t<div class = \"row\">\r\n");
      out.write("\t\t<div class = \"col-sm-3 sidebar-col\">\r\n");
      out.write("\t\t");
      out.write("<div>\r\n");
      out.write(" \r\n");
      out.write("<a href=\"index.jsp\">Students registered</a>\r\n");
      out.write("<a href=\"event_category.jsp\">Event Category</a>\r\n");
      out.write("<a href=\"events.jsp\">Events</a>\r\n");
      out.write("<a href=\"index.jsp\">Event Registration</a>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</div>");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class = \"col-sm-9 main-col\">\r\n");
      out.write("\t\t<h3>Students list</h3>\t\r\n");
      out.write("\t\t");
 
	if(request.getParameter("status")!=null){ 
		out.print("<h5>Deleted<h5>");
	}
	
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<table class = \"table table-bordered\">\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<th>ID</th>\r\n");
      out.write("\t\t\t\t<th>Name</th>\r\n");
      out.write("\t\t\t\t<th>Student-ID</th>\r\n");
      out.write("\t\t\t\t<th>Email-ID</th>\r\n");
      out.write("\t\t\t\t<th>Role</th>\r\n");
      out.write("\t\t\t\t<th></th>\r\n");
      out.write("\t\t\t\t<th></th>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t");

		List li = new RegisterDAO(MyConnection.connectTo()).getAll();
		ListIterator lit = li.listIterator();
		while (lit.hasNext()){
			Register rb = (Register)lit.next();
			                 
			
			
      out.write("\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<td>");
      out.print( rb.getId() );
      out.write("</td>\r\n");
      out.write("\t\t\t<td>");
      out.print( rb.getName() );
      out.write("</td>\r\n");
      out.write("\t\t\t<td>");
      out.print( rb.getStudent_id() );
      out.write("</td>\r\n");
      out.write("\t\t\t<td>");
      out.print( rb.getEmailid() );
      out.write("</td>\r\n");
      out.write("\t\t\t<td>");
      out.print( rb.getRole() );
      out.write("</td>\r\n");
      out.write("\t\t\t<td><a href=\"\" class=\"btn btn-outline-info\" >Update</a>\r\n");
      out.write("\t\t\t<td><a href = \"../DeleteController?id=");
      out.print( rb.getId() );
      out.write("\"  class=\"btn btn-outline-danger\">Delete</button></a>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t");

		
		}
		
		
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
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