package springbootMockito.api.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springbootMockito.api.dao.CustomerRepository;
import springbootMockito.api.models.Customer;

@Service
public class CustomerService {
	@Autowired
	private CustomerRepository repository;
	
	public Customer addCustomer(Customer cust) {
		return repository.save(cust);
	}

	public List<Customer> getCustomers() {
		List<Customer> cust = repository.findAll();
		return cust;
	}

	public Optional<Customer> getCustomerbyAddress(Integer id) {
		return repository.findById(id);
	}

	public void deleteCustomer(Customer cust) {
		repository.delete(cust);
		
	}
}
