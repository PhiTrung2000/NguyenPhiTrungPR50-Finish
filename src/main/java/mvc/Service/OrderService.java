package mvc.Service;

import mvc.Entity.OrdersEntity;

public interface OrderService {
    Iterable<OrdersEntity> getAllOrders();
    OrdersEntity getOrderById(int orderId);
    void createOrder(OrdersEntity order);
    void updateOrder(int orderId, OrdersEntity updatedOrder);
    void deleteOrder(int orderId);
}
