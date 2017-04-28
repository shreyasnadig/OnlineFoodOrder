package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/head.jsp");
    _jspx_dependants.add("/nav.jsp");
    _jspx_dependants.add("/footer.jsp");
  }

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
 String str=request.getParameter("action");
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    \n");
      out.write("    ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<title>Online Fast Food Restaurant System</title>\n");
      out.write("<link href=\"css/bootstrap.css\" rel='stylesheet' type='text/css' />\n");
      out.write("<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->\n");
      out.write("<script src=\"js/jquery.min.js\"></script>\n");
      out.write("<!-- Custom Theme files -->\n");
      out.write("<link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("<link href=\"css/style2.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("<!-- Custom Theme files -->\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<script type=\"application/x-javascript\"> addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>\n");
      out.write("<!--webfont-->\n");
      out.write("<!--Animation-->\n");
      out.write("<script src=\"js/sisyphus.min.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"js/jquery-1.11.1.min.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"js/wow.min.js\"></script>\n");
      out.write("<link href=\"css/animate.css\" rel='stylesheet' type='text/css' />\n");
      out.write("<script>\n");
      out.write("\tnew WOW().init();\n");
      out.write("</script>\n");
      out.write("<script src=\"js/simpleCart.min.js\"> </script>\t\n");
      out.write("<script type=\"text/javascript\" src=\"js/move-top.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"js/easing.js\"></script>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\t\t\tjQuery(document).ready(function($) {\n");
      out.write("\t\t\t\t$(\".scroll\").click(function(event){\t\t\n");
      out.write("\t\t\t\t\tevent.preventDefault();\n");
      out.write("\t\t\t\t\t$('html,body').animate({scrollTop:$(this.hash).offset().top},1200);\n");
      out.write("\t\t\t\t});\n");
      out.write("\t\t\t});\n");
      out.write("\t\t</script>\n");
      out.write("                <script src=\"js/jquery-form-validation-min.js\"></script>\n");
      out.write("                ");
      out.write("\n");
      out.write("    <style>\n");
      out.write("        @media print {\n");
      out.write("    .print {\n");
      out.write("        background-color: white;\n");
      out.write("        height: 100%;\n");
      out.write("        width: 100%;\n");
      out.write("        position: fixed;\n");
      out.write("        top: 0;\n");
      out.write("        left: 0;\n");
      out.write("        margin: 0;\n");
      out.write("        padding: 15px;\n");
      out.write("        font-size: 14px;\n");
      out.write("        line-height: 18px;\n");
      out.write("    }\n");
      out.write("}\n");
      out.write("    </style>\n");
      out.write("    <script>\n");
      out.write("        function valid()\n");
      out.write("        {\n");
      out.write("            var x=document.getElementById(\"eid\").value;\n");
      out.write("            if(x==null)\n");
      out.write("            {\n");
      out.write("                document.getElementById(\"div\").innerHTML=\"Required\";\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("    </script>\n");
      out.write("</head>\n");
      out.write("<body>    <!-- header-section-starts -->\n");
      out.write("    ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- header-section-starts -->\n");
      out.write("\t<div class=\"header\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"top-header\">\n");
      out.write("                            <div class=\"logo\">\n");
      out.write("                                    <a href=\"index.jsp\"><img src=\"images/images (3).png\" width=\"156\" height=\"40\"  class=\"img-responsive\" alt=\"\" /></a>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"queries\">\n");
      out.write("\t\t\t\t\t<p>Questions? Call us Toll-free!<span>1800-0000-7777 </span><label>(11AM to 11PM)</label></p>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"header-right\">\n");
      out.write("\t\t\t\t\t\t<div class=\"cart box_1\">\n");
      out.write("                                                    <span>\n");
      out.write("                                                         ");
 
                                              String txt=(String)session.getAttribute("admin");
                                            if("admin".equals(txt)&&txt!=null||"cook".equals(txt))
                                            {}else{
      out.write("\n");
      out.write("                                           \n");
      out.write("\t\t\t\t\t\t\t<a href=\"checkout.jsp\">\n");
      out.write("\t\t\t\t\t\t\t\t<h3>Cart<img src=\"images/bag.png\" alt=\"\"></h3>\n");
      out.write("\t\t\t\t\t\t\t</a>\n");
      out.write("                                            ");
}
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t\t<div class=\"menu-bar\">\n");
      out.write("\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t<div class=\"top-menu\">\n");
      out.write("\t\t\t\t\t<ul>\n");
      out.write("                                            <li class=\"active\"><a href=\"index.jsp\">Home</a></li>| \n");
      out.write("                                            <span style=\"margin-left: 5px;\">\n");
      out.write("                                            ");
 
                                            if("admin".equals(txt)&&txt!=null)
                                            {
      out.write("\n");
      out.write("                                             <li><a href=\"users.jsp\">Users</a></li>|\n");
      out.write("\t\t\t\t\t\t<li><a href=\"allorders.jsp\">Orders</a></li>|\n");
      out.write("                                           \n");
      out.write("                                                    ");
}else
                                                    if("cook".equals(txt)&&txt!=null)
                                            {
      out.write("\n");
      out.write("                                            <li><a href=\"cook.jsp\">Orders</a></li>|\n");
      out.write("                                               ");
}else{
      out.write("\n");
      out.write("                                                <li><a href=\"menu.jsp\">Order</a></li>|\n");
      out.write("\t\t\t\t\t\t<li><a href=\"contact.jsp\">contact</a></li>|\n");
      out.write("                                                ");
}
      out.write("\n");
      out.write("\n");
      out.write("                                                 </span>\n");
      out.write("                                               <div class=\"clearfix\"></div>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"login-section\">\n");
      out.write("\t\t\t\t\t<ul>\n");
      out.write("                                            <span style=\"color: #E24425\">\n");
      out.write("                                                    ");
 if((session.getAttribute("admin")=="")||
                                                            (session.getAttribute("admin")==null)){
      out.write("\n");
      out.write("                                                    \n");
      out.write("                                            <li>\n");
      out.write("                                                <span style=\"color: #E24425\">\n");
      out.write("                                                    ");
 if((session.getAttribute("email")=="")||
                                                            (session.getAttribute("email")==null)){
      out.write("\n");
      out.write("                                                    <a href=\"login.jsp\">Login</a>\n");
      out.write("                                                     </li> |\n");
      out.write("\t\t\t\t\t\t<li><a href=\"register.jsp\">Sign Up</a> </li> |\n");
      out.write("                                                <li><a href=\"adminlogin.jsp\">Admin Login</a>\n");
      out.write("                                           \n");
      out.write("                                                    ");
}else{
      out.write("\n");
      out.write("                                                    Welcome, ");
      out.print( session.getAttribute("email"));
      out.write("\n");
      out.write("                                                    <li><a href=\"logout.jsp\">Logout</a></li> \n");
      out.write("                                                    ");
}
      out.write(" \n");
      out.write("                                                </span>\n");
      out.write("                                                    ");
}else{
      out.write("\n");
      out.write("                                                    Welcome, ");
      out.print( session.getAttribute("admin"));
      out.write("\n");
      out.write("                                                    <li><a href=\"logout.jsp\">Logout</a></li> \n");
      out.write("                                                    ");
}
      out.write(" \n");
      out.write("                                                </span>\n");
      out.write("                                             </li> |\n");
      out.write("\t\t\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t\n");
      out.write("\t</div>\n");
      out.write("\t<!-- header-section-ends -->");
      out.write("\n");
      out.write("\t<!-- header-section-ends -->\n");
      out.write("\t<!-- content-section-starts -->\n");
      out.write("        <div>\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("\t<div class=\"content\">\n");
      out.write("\t<div class=\"container\">\n");
      out.write("\t\t<div class=\"login-page\">\n");
      out.write("                    <span style=\" color: red;text-align: center\"><h3>\n");
      out.write("             ");
 
                                              String msg0=(String)session.getAttribute("msg0");
                                            if(msg0!=null)
                                              {
                                                  out.println(msg0);
                                              }
                                            session.removeAttribute("msg0");
                                          
      out.write("\n");
      out.write("                            </h3> </span>\n");
      out.write("\t\t\t    <div class=\"dreamcrub\">\n");
      out.write("\t\t\t   \t <ul class=\"breadcrumbs\">\n");
      out.write("                    <li class=\"home\">\n");
      out.write("                       <a href=\"index.jsp\" title=\"Go to Home Page\">Home</a>&nbsp;\n");
      out.write("                       <span>&gt;</span>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"women\">\n");
      out.write("                       Login\n");
      out.write("                    </li>\n");
      out.write("                    \n");
      out.write("                </ul>\n");
      out.write("                <ul class=\"previous\">\n");
      out.write("                    \n");
      out.write("                \t<li><a href=\"index.jsp\">Back to Previous Page</a></li>\n");
      out.write("                </ul>\n");
      out.write("                <div class=\"clearfix\"></div>\n");
      out.write("\t\t\t   </div>\n");
      out.write("\t\t\t   <div class=\"account_grid\">\n");
      out.write("                              <div class=\"col-md-6 login-right wow fadeInRight\" data-wow-delay=\"0.4s\">\n");
      out.write("\t\t\t  \t<h3>REGISTERED CUSTOMERS</h3>\n");
      out.write("\t\t\t\t<p>If you have an account with us, please log in.</p>\n");
      out.write("                                <form action=\"log.jsp?action=");
      out.print(str);
      out.write("\" method=\"post\">\n");
      out.write("                                 \n");
      out.write("\t\t\t\t  <div>\n");
      out.write("\t\t\t\t\t<span>Username<label>*</label></span>\n");
      out.write("                                        <input id=\"eid\" type=\"text\" required=\"required\"\n");
      out.write("                                               name=\"eid\" onsubmit=\"valid()\"> \n");
      out.write("                                        <p id=\"div\"></p>\n");
      out.write("\t\t\t\t  </div>\n");
      out.write("\t\t\t\t  <div>\n");
      out.write("\t\t\t\t\t<span>Password<label>*</label></span>\n");
      out.write("                                        <input id=\"pwd\" type=\"password\" required=\"required\"\n");
      out.write("                                               name=\"pwd\"> \n");
      out.write("\t\t\t\t  </div>\n");
      out.write("                                  <div>\n");
      out.write("                                      <span style=\"color: red\">\n");
      out.write("                                          ");
 
                                              String msg=(String)session.getAttribute("msg");
                                            if(msg!=null)
                                              {
                                                  out.println(msg);
                                              }
                                            session.removeAttribute("msg");
                                          
      out.write("\n");
      out.write("                                      </span>\n");
      out.write("                                  </div>\n");
      out.write("                                      <a class=\"forgot\" href=\"forgot.jsp\">Forgot Your Password?</a>\n");
      out.write("                                  <input type=\"submit\" value=\"Login\" name=\"submit\">\n");
      out.write("\t\t\t    </form>\n");
      out.write("\t\t\t   </div>\t\n");
      out.write("\n");
      out.write("\t\t\t   <div id=\"print\" class=\"col-md-6 login-right wow fadeInLeft\" data-wow-delay=\"0.4s\">\n");
      out.write("\t\t\t  \t <h3>NEW CUSTOMERS</h3>\n");
      out.write("\t\t\t\t <p>By creating an account with our store, you will be able to move through the checkout process faster, store multiple shipping addresses, view and track your orders in your account and more.</p>\n");
      out.write("\t\t\t\t <a class=\"acount-btn\" href=\"register.jsp\">Create an Account</a>\n");
      out.write("\t\t\t   </div>\n");
      out.write("\t\t\t   <div class=\"clearfix\"> </div>\n");
      out.write("\t\t\t </div>\n");
      out.write("\t\t   </div>\n");
      out.write("</div>\n");
      out.write("<div class=\"clearfix\"></div>\n");
      out.write("</div>\n");
      out.write("\t<!-- content-section-ends -->\n");
      out.write("\t<!-- footer-section-starts -->\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t<div class=\"contact-section\" id=\"contact\">\n");
      out.write("\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t<div class=\"contact-section-grids\">\n");
      out.write("\t\t\t\t\t<div class=\"col-md-3 contact-section-grid wow fadeInLeft\" data-wow-delay=\"0.4s\">\n");
      out.write("\t\t\t\t\t\t<h4>Site Links</h4>\n");
      out.write("\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t<li><i class=\"point\"></i></li>\n");
      out.write("\t\t\t\t\t\t\t<li class=\"data\"><a href=\"#\">About Us</a></li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t<li><i class=\"point\"></i></li>\n");
      out.write("\t\t\t\t\t\t\t<li class=\"data\"><a href=\"#\">Contact Us</a></li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t<li><i class=\"point\"></i></li>\n");
      out.write("\t\t\t\t\t\t\t<li class=\"data\"><a href=\"#\">Privacy Policy</a></li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t<li><i class=\"point\"></i></li>\n");
      out.write("\t\t\t\t\t\t\t<li class=\"data\"><a href=\"#\">Terms of Use</a></li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"col-md-3 contact-section-grid wow fadeInLeft\" data-wow-delay=\"0.4s\">\n");
      out.write("\t\t\t\t\t\t<h4>Site Links</h4>\n");
      out.write("\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t<li><i class=\"point\"></i></li>\n");
      out.write("\t\t\t\t\t\t\t<li class=\"data\"><a href=\"#\">About Us</a></li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t<li><i class=\"point\"></i></li>\n");
      out.write("\t\t\t\t\t\t\t<li class=\"data\"><a href=\"#\">Contact Us</a></li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t<li><i class=\"point\"></i></li>\n");
      out.write("\t\t\t\t\t\t\t<li class=\"data\"><a href=\"#\">Privacy Policy</a></li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t<li><i class=\"point\"></i></li>\n");
      out.write("\t\t\t\t\t\t\t<li class=\"data\"><a href=\"#\">Terms of Use</a></li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"col-md-3 contact-section-grid wow fadeInRight\" data-wow-delay=\"0.4s\">\n");
      out.write("\t\t\t\t\t\t<h4>Follow Us On...</h4>\n");
      out.write("\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t<li><i class=\"fb\"></i></li>\n");
      out.write("\t\t\t\t\t\t\t<li class=\"data\"> <a href=\"#\">  Facebook</a></li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t<li><i class=\"tw\"></i></li>\n");
      out.write("\t\t\t\t\t\t\t<li class=\"data\"> <a href=\"#\">Twitter</a></li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t<li><i class=\"in\"></i></li>\n");
      out.write("\t\t\t\t\t\t\t<li class=\"data\"><a href=\"#\"> Linkedin</a></li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t<li><i class=\"gp\"></i></li>\n");
      out.write("\t\t\t\t\t\t\t<li class=\"data\"><a href=\"#\">Google Plus</a></li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"col-md-3 contact-section-grid nth-grid wow fadeInRight\" data-wow-delay=\"0.4s\">\n");
      out.write("\t\t\t\t\t\t<h4>Subscribe Newsletter</h4>\n");
      out.write("\t\t\t\t\t\t<p>To get latest updates and food deals every week</p>\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" class=\"text\" value=\"\" onfocus=\"this.value = '';\" onblur=\"if (this.value == '') {this.value = '';}\">\n");
      out.write("\t\t\t\t\t\t<input type=\"submit\" value=\"submit\">\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t<div class=\"footer\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<p class=\"wow fadeInLeft\" data-wow-delay=\"0.4s\">&copy; 2014  All rights  Reserved | Template by &nbsp;<a href=\"http://w3layouts.com\" target=\"target_blank\">W3Layouts</a></p>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<!-- footer-section-ends -->\n");
      out.write("\t  <script type=\"text/javascript\">\n");
      out.write("\t\t\t\t\t\t$(document).ready(function() {\n");
      out.write("\t\t\t\t\t\t\t/*\n");
      out.write("\t\t\t\t\t\t\tvar defaults = {\n");
      out.write("\t\t\t\t\t  \t\t\tcontainerID: 'toTop', // fading element id\n");
      out.write("\t\t\t\t\t\t\t\tcontainerHoverID: 'toTopHover', // fading element hover id\n");
      out.write("\t\t\t\t\t\t\t\tscrollSpeed: 1200,\n");
      out.write("\t\t\t\t\t\t\t\teasingType: 'linear' \n");
      out.write("\t\t\t\t\t \t\t};\n");
      out.write("\t\t\t\t\t\t\t*/\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t$().UItoTop({ easingType: 'easeOutQuart' });\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t});\n");
      out.write("\t\t\t\t\t</script>\n");
      out.write("\t\t\t\t<a href=\"#\" id=\"toTop\" style=\"display: block;\"> <span id=\"toTopHover\" style=\"opacity: 1;\"> </span></a>");
      out.write("\n");
      out.write("</body>\n");
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
