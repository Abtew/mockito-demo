package springbootMockito.api;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import springbootMockito.api.dao.CustomerRepository;
import springbootMockito.api.models.Customer;

@DataJpaTest //to test a persistance layer
public class RepositoryTest {
	@Autowired
	private CustomerRepository repository;
	
	@Test
	public void testRepository() {
		Customer cust = new Customer();
		cust.setAddress("123 New");
		cust.setAge(45);
		cust.setName("Kasa Abebe");		
		//when(repository.save(cust)).thenReturn(cust);
				
	}
}
