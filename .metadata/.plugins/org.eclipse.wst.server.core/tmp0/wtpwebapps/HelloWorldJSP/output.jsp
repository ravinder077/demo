<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
 <%@ page import="com.aris.model.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<table>
 <tr>
  <th>Number 1 :</th>
 
 </tr>
  <th>Number 2 :</th>
 
 </tr>
 
   <th>Result :</th>
  <th>
  <% 
  
  NumberModel model=(NumberModel)request.getAttribute("model");
   
  out.println(Integer.parseInt(model.getNumberOne())+Integer.parseInt(model.getNumberTwo()));
  
  %></th>
 </tr>
</table>
<body>

</body>
</html>