<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="edit1">
id:<input type="number" name="sid" value=<%=request.getParameter("sid")%>  readonly="readonly"><br>
name:<input type="text" name="sname" value=<%=request.getParameter("sname")%>><br>
phno1:<input type="number" name="phno" value=<%=request.getParameter("phno")%>><br>

<%if(request.getParameter("gender").equals("male")) {%>
Male:<input type="radio" name="gender" value="male" >
female:<input type="radio" name="gender" value="female" checked="checked"><br>

<%}else { %>

Male:<input type="radio" name="gender" value="male" checked="checked">
female:<input type="radio" name="gender" value="female" ><br>
<%} %>

<button>update</button><br>
<button>cancel</button>

</body>
</html>