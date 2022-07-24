package springbootMockito.api;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import springbootMockito.api.dao.CustomerRepository;
import springbootMockito.api.models.Customer;
import springbootMockito.api.services.CustomerService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CustomerServiceTest {
	@Autowired
	private CustomerService service;
	
	@MockBean
	private CustomerRepository mockRepository;
	
	@Test
	public void testAddCustomer() {
		Customer cust = new Customer();
		when(mockRepository.save(cust)).thenReturn(cust);
		assertEquals(cust, service.addCustomer(cust));
		
	}
	
	@Test
	public void testGetCustomer() {
		List<Customer> custList = new ArrayList<>();
		when(mockRepository.findAll()).thenReturn(custList);
		assertEquals(custList, service.getCustomers());
		
	}
	
}
