<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Orders List</title>
</head>
<body>
    <h1>Orders List</h1>
    <table border="1">
        <tr>
            <th>OrderID</th>
            <th>OrderDate</th>
            <th>Customer Name</th>
            <th>View Detail</th>
        </tr>
        <c:forEach var="order" items="${orders}" varStatus="index">
            <tr>
                <td>${order.orderId}</td>
                <td>${order.orderDate}</td>
                <td>${order.customerName}</td>
                <td><a href="viewDetail?orderId=${order.orderId}">ViewDetail</a></td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
