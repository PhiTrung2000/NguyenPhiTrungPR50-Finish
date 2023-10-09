<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Order Details</title>
</head>
<body>
    <h1>Order Details</h1>
    <table border="1">
        <tr>
            <th>OrderDetailsID</th>
            <th>OrderID</th>
            <th>OrderDate</th>
            <th>Product Name</th>
            <th>Quantity</th>
        </tr>
        <c:forEach var="orderDetail" items="${orderDetails}">
            <tr>
                <td>${orderDetail.orderDetailsId}</td>
                <td>${orderDetail.order.orderId}</td>
                <td>${orderDetail.order.orderDate}</td>
                <td>${orderDetail.product.proName}</td>
                <td>${orderDetail.quantity}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
