<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Edit Order</title>
    <!-- Bao gồm thư viện Bootstrap CSS -->
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <div class="container">
        <h1>Edit Order</h1>
        <form action="/editOrder/update" method="post" accept-charset="UTF-8">
            <div class="form-group">
                <label for="orderDate">Order Date:</label>
                <input type="date" class="form-control" name="orderDate" value="${order.orderDate}" required>
            </div>
            <div class="form-group">
                <label for="customerName">Customer Name:</label>
                <input type="text" class="form-control" name="customerName" value="${order.customerName}" required>
            </div>
            <button type="submit" class="btn btn-primary">Update</button>
        </form>
        <br>
        <a href="/NguyenPhiTrungPR50" class="btn btn-secondary">Back to Orders List</a>
    </div>

    <!-- Bao gồm thư viện Bootstrap JavaScript và Popper.js (nếu cần) -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
</body>
</html>
