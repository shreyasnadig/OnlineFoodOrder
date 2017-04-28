<%-- 
    Document   : cancel
    Created on : Aug 3, 2016, 8:23:12 AM
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" import="java.sql.*"%>
<%
    Statement st=null;
    String id=(String)session.getAttribute("admin");
    String str=request.getParameter("action");
    
    Class.forName("oracle.jdbc.OracleDriver");
    Connection con=DriverManager.getConnection("jdbc:oracle:thin:LOCAL/1234@localhost:1521:XE");
    st=con.createStatement();
    if("admin".equals(id))
    {
    int k=st.executeUpdate("delete from register where eid='"+str+"'");
    if(k>0)
    {
        response.sendRedirect("users.jsp");
    }
    }
    con.close();
    
    
    
%>