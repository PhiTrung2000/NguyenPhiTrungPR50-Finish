<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Edit Order</title>
</head>
<body>
    <h1>Edit Order</h1>
    <form action="/NguyenPhiTrungPR50/editOrder/${order.orderId}" method="post">
        <input type="hidden" name="_method" value="PUT"> <!-- Sử dụng HTTP PUT -->
        <label for="orderDate">Order Date:</label>
        <input type="date" name="orderDate" value="${order.orderDate}" required><br>
        <label for="customerName">Customer Name:</label>
        <input type="text" name="customerName" value="${order.customerName}" required><br>
        <input type="submit" value="Update">
    </form>

    <br>
    <a href="/NguyenPhiTrungPR50/orders">Back to Orders List</a>
</body>
</html>
