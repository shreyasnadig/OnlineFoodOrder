<%-- 
    Document   : reg
    Created on : Jul 27, 2016, 8:32:26 PM
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>
<%
    Statement st=null;
    Class.forName("oracle.jdbc.OracleDriver");
    Connection con=DriverManager.getConnection("jdbc:oracle:thin:LOCAL/1234@localhost:1521:XE");
    st=con.createStatement();
    
    String str=request.getParameter("action");
    if("admin".equals(str))
    {
        String id=request.getParameter("id");
        String pass=request.getParameter("pwd");
        String cfmpass=request.getParameter("cfmpwd");
        ResultSet rs=st.executeQuery("select id from admins where id='"+id+"'");
        if(rs.next())
        {
            session.setAttribute("msg6", "Username not available.");
        if(!pass.equals(cfmpass))
        {
        session.setAttribute("msg4", "Password don't match.");
         }
            response.sendRedirect("adminsignup.jsp");
            
        }
    
    else
    {
        int i=st.executeUpdate("insert into admins values('"+id+"','"+pass+"','"+cfmpass+"')");
        if(i>0)
        {
        
            session.setAttribute("admin", id);
            if("admin".equals(id))
            {
             response.sendRedirect("users.jsp");
            }
            else if("cook".equals(id))
            {
                 response.sendRedirect("cook.jsp");
                     
            }
         }
        else
        {
             response.sendRedirect("adminsignup.jsp");
        }
    }
    }
    else
    {
    
    String fnam=request.getParameter("fname");
    String lnam=request.getParameter("lname");
    String phno=request.getParameter("phno");
    String email=request.getParameter("eid");
    String pass=request.getParameter("pwd");
    String cfmpass=request.getParameter("cfmpwd");
    String msg4,msg6,mg=null;
    session.setAttribute("mg", email);
    ResultSet rs=st.executeQuery("select eid from register where eid='"+email+"'");
    if(rs.next())
        {
            session.setAttribute("msg6", "Username not available.");
            if(!pass.equals(cfmpass))
    {
        session.setAttribute("msg4", "Password don't match.");
    }
            response.sendRedirect("register.jsp");
            
        }
    
    
    else
    {
        
    int i=st.executeUpdate("insert into register values('"+fnam+"','"+lnam+"','"+email+"','"+pass+"','"+cfmpass+"','"+phno+"')");
    
    if(i>0)
    {
        
       session.setAttribute("email", email);
        response.sendRedirect("index.jsp");
    }
    else
    {
        response.sendRedirect("register.jsp");
    }
    }
    }
    con.close();
   // session.invalidate();
%>
    