   <%@page import="dto.Studentdto"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<% List<Studentdto> l1=(List<Studentdto>)request.getAttribute("studentlist"); %>
<table border=" ">
<tr>
<th>id</th>
<th>name</th>
<th>gender</th>
<th>phno</th>
<th>delete</th>
<th>edit</th>
</tr>
<% for(Studentdto a:l1) { %>
<tr>
<td><%=a.getSid()%></td>
<td><%=a.getSname()%></td>
<td><%=a.getGender()%></td>
<td><%=a.getPhno()%></td>
<td><a href="delete?sid=<%=a.getSid()%>">Remove</a> </td>
<td><a href="edit.jsp?sid=<%=a.getSid()%>&sname=<%=a.getSname()%>&phno=<%=a.getPhno()%>&gender=<%=a.getGender()%>>">edit</a></td>

</tr>
<%} %>
</table>


</body>
</html>


