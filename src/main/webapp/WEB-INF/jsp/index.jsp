<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head><title>SpringBoot</title>

</head>
<body>
<h1>ergrgr</h1>
<table>
  <tr>
    <th>ID</th>
    <th>First Name</th>
    <th>Last Name</th>
    <th>Action</th>
  </tr>
   <c:forEach var = "student" items = "${students}">
  <tr>
    <td>${student.id}</td>
    <td>${student.firstName}</td>
    <td>${student.surname}</td>
   <td>${student.averageScore}</td>
   
  </tr>
  </c:forEach>
</table>