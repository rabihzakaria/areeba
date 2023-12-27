	package com.areeba.backend.controllers;

	import com.areeba.backend.entities.Customer;
	import com.areeba.backend.services.CustomerService;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.web.bind.annotation.*;

	import java.util.List;

	@RestController
	@RequestMapping("/customers")
	public class CustomerController {
		@Autowired
		private final CustomerService customerService;

		public CustomerController(CustomerService customerService) {
			this.customerService = customerService;
		}

		@GetMapping("/all")
		public List<Customer> getAllCustomers() {
			return customerService.getAllCustomers();
		}

		@GetMapping("/{id}")
		public Customer getCustomerById(@PathVariable Long id) {
			return customerService.getCustomerById(id);
		}
		@PostMapping("/add")
		public void addCustomer(@RequestBody Customer customer) {
			customerService.addCustomer(customer);
		}

		@PutMapping("/update")
		public void updateCustomer(@RequestBody Customer updatedCustomer) {
			customerService.updateCustomer(updatedCustomer);
		}

		@DeleteMapping("/delete")
		public void deleteCustomer(@RequestBody Customer customer) {
			customerService.deleteCustomer(customer);
		}
	}
