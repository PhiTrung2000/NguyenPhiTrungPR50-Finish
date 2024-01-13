package mvc.Repository;

import mvc.Entity.ProductsEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ProductsRepository extends CrudRepository<ProductsEntity, Integer> {

}
