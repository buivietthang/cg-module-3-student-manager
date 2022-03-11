<%--
  Created by IntelliJ IDEA.
  User: BUI VIET THANG
  Date: 31/12/2021
  Time: 10:20 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
    <h1>STUDENT</h1>
</head>
<body>
<table border="1">
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Date Of Birth</th>
        <th>Address</th>
        <th>Phone Number</th>
        <th>Email</th>
        <th>Class Room</th>
    </tr>
    <c:forEach items="${listStudent}" var="s">
        <tr>
            <td>${s.id}</td>
            <td>${s.name}</td>
            <td>${s.dateOfBirth}</td>
            <td>${s.address}</td>
            <td>${s.phoneNumber}</td>
            <td>${s.email}</td>
            <td>${s.idClassRoom}</td>
            <td>
                <button><a href="/student?action=edit&id=${s.id}">EDIT</a></button>
            </td>
            <td>
                <button><a href="/student?action=delete&id=${s.id}">DELETE</a></button>
            </td>
        </tr>
    </c:forEach>
</table>
<button type="submit" class="btn btn-primary"><a href="/student?action=create">CREATE</a></button>
</body>
</html>
