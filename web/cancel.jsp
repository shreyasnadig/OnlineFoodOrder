<%-- 
    Document   : cancel
    Created on : Aug 3, 2016, 8:23:12 AM
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" import="java.sql.*"%>
<%
    Statement st=null;
    String eid=(String)session.getAttribute("admin");
    String str=request.getParameter("action");
    
    Class.forName("oracle.jdbc.OracleDriver");
    Connection con=DriverManager.getConnection("jdbc:oracle:thin:LOCAL/1234@localhost:1521:XE");
    st=con.createStatement();
    if(!("admin".equals(eid)))
    {
    int i=st.executeUpdate("delete from orderdata where oid='"+str+"'");
    int j=st.executeUpdate("delete from userdetails where oid='"+str+"'");
    if(i>0||j>0)
    {
        response.sendRedirect("checkout.jsp");
    }
    else
    {
        response.sendRedirect("checkout.jsp");
    }
    }
    else
    {
    int i=st.executeUpdate("delete from orderdata where oid='"+str+"'");
    int j=st.executeUpdate("delete from userdetails where oid='"+str+"'");
    if(i>0||j>0)
    {
        response.sendRedirect("allorders.jsp");
    }
    else
    {
        response.sendRedirect("allorders.jsp");
    }
    }
    
    
    
%>