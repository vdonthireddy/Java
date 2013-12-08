<%-- 
    Document   : index
    Created on : Nov 17, 2013, 8:07:39 PM
    Author     : Kavitha
--%>

<%@page import="java.io.PrintWriter"%>
<%@page import="org.jboss.weld.context.http.HttpRequestContext"%>
<%@page import="com.niharsystems.shoppingcart.Customer"%>
<%@page import="java.util.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <br />
        <%=new Date().toString()%> <br />
        <%
            Customer customer = new Customer();
            customer.setCustomerId(1);
            customer.setCustomerName("Nihar Donthireddy");
            customer.setIsActive(true);
        %>

        <%=customer.getCustomerId()%> <br />
        <%=customer.getCustomerName()%> <br />
        <%=customer.isIsActive()%> <br />
        <% customer = null;%>

    </body>
</html>
