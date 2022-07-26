package springbootMockito.api;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import springbootMockito.api.controllers.CustomerController;
import springbootMockito.api.models.Customer;
import springbootMockito.api.services.CustomerService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CustomerControllerTest {
	
	@Autowired
    private CustomerController controller;

    @MockBean
    private CustomerService mockService;
	
    @Test
	public void saveCustTest() {
		Customer cust = new Customer();
		cust.setId(1);
		when(mockService.addCustomer(cust)).thenReturn(cust);
		assertEquals(cust, controller.saveCustomer(cust));		
	}
    
}
