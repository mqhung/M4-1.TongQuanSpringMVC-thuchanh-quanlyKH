<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<table style="border-collapse: collapse; border: 1px solid black">
    <tr>
        <td>ID</td>
        <td>Name</td>
        <td>Email</td>
        <td>Address</td>
    </tr>
    <c:forEach items="${listCustomer}" var="list">
        <tr>
            <td>${list.getId()}</td>
            <td>${list.getName()}</td>
            <td>${list.getEmail()}</td>
            <td>${list.getAddress()}</td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
