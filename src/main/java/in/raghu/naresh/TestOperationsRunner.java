package in.raghu.naresh;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.raghu.naresh.model.Product;
import in.raghu.naresh.repo.ProductRepository;

@Component
public class TestOperationsRunner implements CommandLineRunner {
	@Autowired
	private ProductRepository repo;
	@Override
	public void run(String... args) throws Exception {
		Product pro= new Product(101,"PEN",200.0);
		repo.save(pro);
		repo.save(new Product(102,"BOOK",300.0));
	}
}
