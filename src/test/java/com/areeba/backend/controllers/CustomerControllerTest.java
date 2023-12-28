package com.areeba.backend.controllers;

import com.areeba.backend.entities.Customer;
import com.areeba.backend.services.CustomerService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class CustomerControllerTest {

	@Mock
	private CustomerService customerService;

	@InjectMocks
	private CustomerController customerController;

	private MockMvc mockMvc;

	@BeforeEach
	public void setup() {
		MockitoAnnotations.openMocks(this);
		mockMvc = MockMvcBuilders.standaloneSetup(customerController).build();
	}

	//TODO add test to other apis
	@Test
	public void testGetAllCustomers() throws Exception {
		List<Customer> customers = Arrays.asList(new Customer(), new Customer());
		when(customerService.getAllCustomers()).thenReturn(customers);

		mockMvc.perform(MockMvcRequestBuilders.get("/customers/all"))
				.andExpect(status().isOk()).andExpect(MockMvcResultMatchers.content().contentType("application/json"))
				.andExpect(MockMvcResultMatchers.jsonPath("$.length()").value(2));
		verify(customerService, times(1)).getAllCustomers();
		verifyNoMoreInteractions(customerService);

	}

}
