package mvc.Repository;

import mvc.Entity.OrdersEntity;
import org.springframework.data.repository.CrudRepository;

public interface OrdersRepository extends CrudRepository<OrdersEntity, Integer> {

}
