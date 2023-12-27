package com.areeba.backend.dtos;

import com.areeba.backend.entities.Customer;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.modelmapper.ModelMapper;

import java.io.Serializable;
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class CustomerDto implements Serializable {
	private Long id;
	private String name;
	private String lastName;
	private String email;
	private String phoneNumber;
	private String countryCode;


	public static CustomerDto fromCustomer(Customer customer) {
		ModelMapper modelMapper = new ModelMapper();
		return modelMapper.map(customer, CustomerDto.class);
	}

	public static  Customer toCustomer(CustomerDto customerDto){
		ModelMapper modelMapper = new ModelMapper();
		return modelMapper.map(customerDto, Customer.class);
	}
}
