	package com.areeba.backend.entities;

	import jakarta.persistence.*;
	import lombok.AllArgsConstructor;
	import lombok.Data;
	import lombok.NoArgsConstructor;


	import java.io.Serializable;

	@Data
	@AllArgsConstructor
	@NoArgsConstructor
	@Entity
	@Table(name = "customer")
	public class Customer implements Serializable {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		private String name;
		private String lastName;
		private String email;
		private String phoneNumber;
		private String countryCode;
		private String operator;
	}
