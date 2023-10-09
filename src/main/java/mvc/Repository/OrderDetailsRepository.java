package mvc.Repository;

import mvc.Entity.OrderDetailsEntity;
import mvc.Entity.OrdersEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface OrderDetailsRepository extends CrudRepository<OrderDetailsEntity, Integer> {

    @Query("SELECT od FROM OrderDetailsEntity od WHERE od.order.orderId = :orderId")
    List<OrderDetailsEntity> findByOrderId(@Param("orderId") int orderId);
}
