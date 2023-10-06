package mvc.Repository;

import mvc.Entity.ProductsEntity;
import org.springframework.data.repository.CrudRepository;

public interface ProductsRepository extends CrudRepository<ProductsEntity, Integer> {

}
