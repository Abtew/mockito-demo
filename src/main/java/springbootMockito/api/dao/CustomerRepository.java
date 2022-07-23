package springbootMockito.api.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import springbootMockito.api.models.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer>{

}
