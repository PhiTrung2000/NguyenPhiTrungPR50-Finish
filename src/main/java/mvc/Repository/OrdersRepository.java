package mvc.Repository;

import mvc.Entity.OrdersEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdersRepository extends CrudRepository<OrdersEntity, Integer> {
    OrdersEntity findByorderId(int id);
}
