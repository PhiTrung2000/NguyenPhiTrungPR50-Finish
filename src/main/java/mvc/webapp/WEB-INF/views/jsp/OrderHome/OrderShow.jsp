<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
            <th>Actions</th>
        </tr>
        <c:forEach var="order" items="${ordershow}" varStatus="index">
            <tr>
                <td>${order.orderId}</td>
                <td>${order.orderDate}</td>
                <td>${order.customerName}</td>
                <td>
                    <a href="/NguyenPhiTrungPR50/orderDetails/${order.orderId}">View Detail</a>
                    <a href="/NguyenPhiTrungPR50/editOrder/${order.orderId}">Edit</a>
                    <a href="/NguyenPhiTrungPR50/deleteOrder/${order.orderId}">Delete</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
