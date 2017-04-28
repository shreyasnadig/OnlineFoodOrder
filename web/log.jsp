<%-- 
    Document   : log
    Created on : Jul 28, 2016, 10:29:05 AM
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>

<%
    RequestDispatcher rd;
    String email=request.getParameter("eid");
    String pwd=request.getParameter("pwd");
    String str=request.getParameter("action");
    Class.forName("oracle.jdbc.OracleDriver");
    Connection con=DriverManager.getConnection("jdbc:oracle:thin:LOCAL/1234@localhost:1521:XE");
    
        
    Statement st=con.createStatement();
    ResultSet rs=null;
    if(str.equals("admin"))
    {
    rs=st.executeQuery("select * from admins where id='"+email+"' and pwd='"+pwd+"'");
    if(rs.next())
    {
            session.setAttribute("admin", email);
            if("admin".equals(email))
            {
             response.sendRedirect("users.jsp");
            }
             else
            {
                 response.sendRedirect("cook.jsp");
                     
            } 
    }
    else
    {
          session.setAttribute("msg", "Invalid Admin credentials");
          rd=request.getRequestDispatcher("adminlogin.jsp");
             rd.forward(request, response);
    }
    }
    else if(str.equals("forgot"))
            {
                rs=st.executeQuery("select * from register where eid='"+email+"' and phno='"+pwd+"'");
                if(rs.next())
                {
                    String pw=rs.getString(4);
                    pw="Your password is "+pw;
                    session.setAttribute("ms", pw);
                     response.sendRedirect("forgot.jsp");
            
                }
                else
                {
                    response.sendRedirect("forgot.jsp");
            
                }
            }
    else 
    {
    rs=st.executeQuery("select * from register where eid='"+email+"' and pwd='"+pwd+"'");
    if(rs.next())
    {
        
        session.setAttribute("pwd", pwd);
        
            session.setAttribute("email", email);
            
            if(str.equals("order"))
            {
                response.sendRedirect("menu.jsp");
            }
            else if(str.equals("checkout"))
            {
                response.sendRedirect("checkout.jsp");
            }
            else if(str.equals("cuisines"))
            {
                response.sendRedirect("menu.jsp");
            }
            else
            {
                response.sendRedirect("index.jsp");
            }
            
        
    }
   
    else
        {
       
        
        session.setAttribute("msg", "Invalid Email or password");
             rd=request.getRequestDispatcher("login.jsp");
             rd.forward(request, response);
             
       }
    }
    con.close();
    
%>