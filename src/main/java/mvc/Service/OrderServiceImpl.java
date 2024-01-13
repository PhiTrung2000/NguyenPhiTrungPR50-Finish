package mvc.Service;

import mvc.Entity.OrdersEntity;
import mvc.Repository.OrdersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {
    private final OrdersRepository orderRepository;

    @Autowired
    public OrderServiceImpl(OrdersRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public Iterable<OrdersEntity> getAllOrders() {
        return orderRepository.findAll();
    }

    @Override
    public OrdersEntity getOrderById(int orderId) {
        return orderRepository.findByorderId(orderId);
    }


    @Override
    public void createOrder(OrdersEntity order) {
        orderRepository.save(order);
    }

    @Override
    public void updateOrder(int orderId, OrdersEntity updatedOrder) {
        OrdersEntity existingOrder = getOrderById(orderId);
        if (existingOrder != null) {
            // Cập nhật thông tin đơn hàng
            existingOrder.setOrderDate(updatedOrder.getOrderDate());
            existingOrder.setCustomerName(updatedOrder.getCustomerName());
            // Lưu lại vào cơ sở dữ liệu
            orderRepository.save(existingOrder);
        }
    }

    @Override
    public void deleteOrder(int orderId) {
        orderRepository.deleteById(orderId);
    }
}
