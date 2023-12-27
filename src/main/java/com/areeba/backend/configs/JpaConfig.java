	package com.areeba.backend.configs;

	import org.springframework.boot.autoconfigure.domain.EntityScan;
	import org.springframework.context.annotation.Bean;
	import org.springframework.context.annotation.Configuration;
	import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
	import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
	import org.springframework.transaction.annotation.EnableTransactionManagement;

	import javax.sql.DataSource;
	@Configuration
	@EnableTransactionManagement
	@EntityScan(basePackages = "com.areeba.backend.entities")
	public class JpaConfig {
		@Bean
		public LocalContainerEntityManagerFactoryBean entityManagerFactory(
				DataSource dataSource) {
			LocalContainerEntityManagerFactoryBean entityManagerFactory = new LocalContainerEntityManagerFactoryBean();
			entityManagerFactory.setDataSource(dataSource);
			entityManagerFactory.setPackagesToScan("com.areeba.backend.entities");
			entityManagerFactory.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
			return entityManagerFactory;
		}
	}
