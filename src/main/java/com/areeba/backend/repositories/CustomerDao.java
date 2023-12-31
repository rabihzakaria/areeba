package com.areeba.backend.repositories;

import com.areeba.backend.entities.Customer;

import java.util.List;

public interface CustomerDao {

    Customer addNew(Customer entity);

	void delete(Long id);

	Customer getCustomerById(Long id);

	List<Customer> getAllCustomers();

	 Customer  update(Customer customer);
}
