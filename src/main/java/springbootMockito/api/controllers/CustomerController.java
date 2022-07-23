package springbootMockito.api.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import springbootMockito.api.models.Customer;
import springbootMockito.api.services.CustomerService;

@RestController
public class CustomerController {
	@Autowired
	private CustomerService service;

	@PostMapping(value = "/customers")
	public Customer saveCustomer(@RequestBody Customer cust) {
		return service.addCustomer(cust);
	}

	@GetMapping("/customers")
	public List<Customer> findAllCustomers() {
		return service.getCustomers();
	}

	@GetMapping("/customers/{id}")
	public Optional<Customer> findCustomerByAddress(@PathVariable Integer id) {
		return service.getCustomerbyAddress(id);
	}

	@DeleteMapping(value="/customers")
	public Customer removeUser(@RequestBody Customer cust) {
		service.deleteCustomer(cust);
		return cust;
	}
}
