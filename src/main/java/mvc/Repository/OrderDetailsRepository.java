package mvc.Repository;

import mvc.Entity.OrderDetailsEntity;
import org.springframework.data.repository.CrudRepository;

public interface OrderDetailsRepository extends CrudRepository<OrderDetailsEntity, Integer> {

}
