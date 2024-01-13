<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Orders List</title>
    <!-- Bao gồm thư viện Bootstrap CSS -->
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <div class="container">
        <h1>Orders List</h1>
        <table class="table table-bordered">
            <thead>
                <tr>
                    <th>OrderID</th>
                    <th>OrderDate</th>
                    <th>Customer Name</th>
                    <th>Actions</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="order" items="${ordershow}" varStatus="index">
                    <tr>
                        <td>${order.orderId}</td>
                        <td>${order.orderDate}</td>
                        <td>${order.customerName}</td>
                        <td>
                            <a href="/orderDetails/${order.orderId}" class="btn btn-primary">View Detail</a>
                            <a href="/editOrder/${order.orderId}" class="btn btn-warning">Edit</a>
                            <a href="/deleteOrder/${order.orderId}" class="btn btn-danger">Delete</a>
                        </td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </div>
</body>
</html>
