<%-- 
    Document   : logout
    Created on : Jul 28, 2016, 10:55:08 PM
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    String m=(String)session.getAttribute("email");
    String ad=(String)session.getAttribute("admin");
    if("admin".equals(ad)||"cook".equals(ad))
    {
        session.removeAttribute("admin");
    
        response.sendRedirect("adminlogin.jsp");
    }
    else if(m!=null)
    {
        session.removeAttribute("email");
    
        response.sendRedirect("login.jsp");
    }
    session.invalidate();
    %>