<%-- 
    Document   : orders-list
    Created on : Jul 26, 2016, 7:29:47 PM
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" import="java.sql.*"%>
<% 
    response.setHeader("Cache-Control", "no-cache");
    response.setHeader("Cache-Control", "no-store");
    response.setDateHeader("Expires", 0);
    response.setHeader("Pragma", "no-cache");
    
    String m=(String)session.getAttribute("email");
        if(m==null)
        {
            session.setAttribute("msg0", "Please login first.");
           // RequestDispatcher rd=request.getRequestDispatcher("login.jsp");
            //rd.forward(request, response);
            response.sendRedirect("login.jsp?action=cuisines");
        }
        %>
<!--
Author: W3layouts
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<!DOCTYPE html>
<html>
    <head>
        <%@include file="head.jsp" %>
    </head>
<body>
    <!-- header-section-starts -->
    <%@include file="nav.jsp" %>

	<!-- header-section-ends -->
	<!-- content-section-starts -->
        <div>
                           <span style=" color: red;text-align: center"><h3>
             <% 
                                              String msg0=(String)session.getAttribute("value");
                                            if(msg0!=null)
                                              {
                                                  out.println(msg0);
                                              }
                                            session.removeAttribute("value");
                                          %>
                            </h3> </span>
		       </div>
	<div class="orders">
	<div class="container">
            <form method="post" action="orderlist.jsp" class="">
                <div>
                <div class="col-lg-6" style="padding: 15px">
                    <h3>Pizzas</h3>
                    <br/>
                       <table class="table">
                           
                        <tr>
                                <th>Items</th>
                                <th>Price($)</th>
                                <th>Pick Item</th>
                        </tr>
                    
                        <tr>
                            <td>Cheese & Basil Pizza</td>
                            <td>$25</td>
                            <td><input type="checkbox" value="a" name="ord"></td>
                        </tr>
                        <tr>
                            <td>Vegetable Pizza</td>
                            <td>$20</td>
                            <td><input type="checkbox" value="b" name="ord"></td>
                        </tr>
                        <tr>
                            <td>Chicken Pizza</td>
                            <td>$30</td>
                            <td><input type="checkbox" value="c" name="ord"></td>
                        </tr>
                         
                       </table>
                </div>
                
                <div class="col-lg-6" style="padding: 15px">
                    <h3>Burgers</h3>
                    <br/>
                       <table class="table">
                           
                        <tr>
                                <th>Items</th>
                                <th>Price($)</th>
                                <th>Pick Item</th>
                        </tr>
                    
                        <tr>
                            <td>Vegetable Burger</td>
                            <td>$25</td>
                            <td><input type="checkbox" value="d" name="ord"></td>
                        </tr>
                        <tr>
                            <td>Cheese Burger</td>
                            <td>$20</td>
                            <td><input type="checkbox" value="e" name="ord"></td>
                        </tr>
                        <tr>
                            <td>Chicken Burger</td>
                            <td>$30</td>
                            <td><input type="checkbox" value="f" name="ord"></td>
                        </tr>
                         
                       </table>
                </div>
                </div>
                
                <div>
                <div class="col-lg-6" style="padding: 15px">
                    <h3>Cold Beverages</h3>
                    <br/>
                       <table class="table">
                           
                        <tr>
                                <th>Items</th>
                                <th>Price($)</th>
                                <th>Pick Item</th>
                        </tr>
                    
                        <tr>
                            <td>Strawberry Milk Shake</td>
                            <td>$15</td>
                            <td><input type="checkbox" value="g" name="ord"></td>
                        </tr>
                        <tr>
                            <td>Chocolate Milk Shake</td>
                            <td>$20</td>
                            <td><input type="checkbox" value="h" name="ord"></td>
                        </tr>
                         
                       </table>
                </div>
                
                <div class="col-lg-6" style="padding: 15px">
                    <h3>Ice Creams</h3>
                    <br/>
                       <table class="table">
                           
                        <tr>
                                <th>Items</th>
                                <th>Price($)</th>
                                <th>Pick Item</th>
                        </tr>
                    
                        <tr>
                            <td>Butter Scotch</td>
                            <td>$25</td>
                            <td><input type="checkbox" value="i" name="ord"></td>
                        </tr>
                        <tr>
                            <td>Chocolate with Orange</td>
                            <td>$20</td>
                            <td><input type="checkbox" value="j" name="ord"></td>
                        </tr>
                         
                       </table>
                </div>
                </div>
                
                                                                   
	        <div class="clearfix"></div>
  
                <div class="form_details">
                    <div class="clearfix"></div>
                    <input type="submit" value="Proceed to Checkout" class="">
                    <input type="reset" value="Reset" class="">
                <div class="clearfix"></div>
                </div>
            </form>
	</div>
</div>
        <%@include file="footer.jsp" %>
</body>
</html>