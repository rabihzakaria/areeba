package com.areeba.backend.services;

import com.areeba.backend.entities.Customer;
import com.areeba.backend.repositories.CustomerDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

	private final CustomerDao customerDAO;
 	//TODO add logger
	@Autowired
	public CustomerService(CustomerDao customerDAO) {
		this.customerDAO = customerDAO;
	}

	public List<Customer> getAllCustomers() {
		return customerDAO.getAllCustomers();
	}

	public Customer getCustomerById(Long id) {
		return customerDAO.getCustomerById(id);
	}

	public void addCustomer(Customer customer) {
			customerDAO.addNew(customer);
	}
	public void updateCustomer(Customer updatedCustomer) {
		customerDAO.update(updatedCustomer);
	}

	public void deleteCustomer(long id) {
		customerDAO.delete(id);
	}
}
