<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Order Details</title>
    <!-- Bao gồm thư viện Bootstrap CSS -->
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <div class="container">
        <h1>Order Details</h1>
        <table class="table table-bordered">
            <thead>
                <tr>
                    <th>OrderDetailsID</th>
                    <th>OrderID</th>
                    <th>OrderDate</th>
                    <th>Product Name</th>
                    <th>Quantity</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="orderDetail" items="${orderDetails}">
                    <tr>
                        <td>${orderDetail.orderDetailsId}</td>
                        <td>${orderDetail.order.orderId}</td>
                        <td>${orderDetail.order.orderDate}</td>
                        <td>${orderDetail.product.proName}</td>
                        <td>${orderDetail.quantity}</td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </div>
</body>
</html>
