package in.raghu.naresh.repo;

import org.springframework.data.repository.CrudRepository;

import in.raghu.naresh.model.Product;

public interface ProductRepository extends CrudRepository<Product, Integer>{

}
