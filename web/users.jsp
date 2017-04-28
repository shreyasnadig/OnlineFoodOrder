<%-- 
    Document   : allorders
    Created on : Aug 13, 2016, 5:21:00 PM
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" import="java.sql.*"%>
<% 
    response.setHeader("Cache-Control", "no-cache");
    response.setHeader("Cache-Control", "no-store");
    response.setDateHeader("Expires", 0);
    response.setHeader("Pragma", "no-cache");
    
    String m=(String)session.getAttribute("admin");
    String n=(String)session.getAttribute("pwd");
        if(m==null||(!m.equals("admin")&&!n.equals("admin")))
        {
            session.setAttribute("msg0", "Please login with administrator credentials to access this page.");
           // RequestDispatcher rd=request.getRequestDispatcher("login.jsp");
           // rd.forward(request, response);
           response.sendRedirect("adminlogin.jsp");
        }
        
%>
<%
    Class.forName("oracle.jdbc.OracleDriver");
    Connection con=DriverManager.getConnection("jdbc:oracle:thin:LOCAL/1234@localhost:1521:XE");
    String id=(String)session.getAttribute("email");
    String[][] data=new String[100][100];
            
    Statement st=con.createStatement();
    int count=0;
    ResultSet rs=st.executeQuery("select * from register");
    while(rs.next())
    {
        count++;
        
    }
    rs=st.executeQuery("select * from register order by eid");
    int x=1;
    while(rs.next()&&x<=count)
    {
        data[x][1]=rs.getString("eid");
        data[x][2]=rs.getString("fname")+" "+rs.getString("lname");
         data[x][3]=rs.getString("phno");
        x++;
    }
    
    
     
 %>
<!DOCTYPE html>
<html>
    <head>
        <%@include file="head.jsp" %>
    </head>
<body>
    <!-- header-section-starts -->
    <%@include file="nav.jsp" %>

    <div class="cart-items">
	<div class="container">
            <div class="dreamcrub">
			   	 <ul class="breadcrumbs">
                    <li class="home">
                        <h1>All Users:</h1>
                    </li>
                             
                </ul>
                	   </div>
           
		
            
            <div class="" style="margin-bottom:200px;margin-top: 50px;">
	
				 <div class="">
						
					   <div class="">
                                              <table class="table table-responsive">
                                                  
                                                  
                                                  <%
                                                      out.println("<tr>");
                                                              
                                                              out.println("<td><b>");
                                                              out.println("S.No.");
                                                              out.println("</b></td>");
                                                              
                                                              out.println("<td><b>");
                                                                out.println("Email");
                                                                out.println("</b></td>");
                                                                            
                                                                out.println("<td><b>");
                                                                out.println("Name");
                                                                out.println("</b></td>");
                                                                            
                                                                out.println("<td><b>");
                                                                out.println("Phone Number");
                                                                out.println("</b></td>");
                                                                
                                                                out.println("<td><b>");
                                                                out.println("Remove User");
                                                                out.println("</b></td>");
                                                                
                                                                
                                                              out.println("</tr>");
                                                          for(int k=1;k<=count;k++)
                                                          {
                                                              out.println("<tr>");
                                                              
                                                              out.println("<td>");
                                                              out.println(k);
                                                              out.println("</td>");
                                                             for(int j=1;j<=3;j++)
                                                             {
                                                              out.println("<td>");
                                                                out.println(data[k][j]);
                                                                out.println("</td>");
                                                             }
                                                                            
                                                               out.println("<td>");
                                                                out.println("<a href=remove.jsp?action="+data[k][1]);
                                                                out.println(">Remove</a>");
                                                                out.println("</td>");
                                                                        
                                                              out.println("</tr>");
                                                                
        }
%>
                                              </table>

                                           </div>
                                 </div>
                         </div>

        </div>
    </div>
                                              
   <%@include file="footer.jsp" %>
</body>
</html>
