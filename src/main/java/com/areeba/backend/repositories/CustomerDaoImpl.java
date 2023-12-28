package com.areeba.backend.repositories;

import com.areeba.backend.entities.Customer;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class CustomerDaoImpl implements CustomerDao {

	@PersistenceContext(unitName = "default")
	private EntityManager entityManager;

	@Transactional
	@Override public Customer addNew(Customer entity) {
		 entityManager.persist(entity);
		 return entity;
	}
    @Transactional
	@Override  public void delete(Long id) {
		entityManager.createQuery("DELETE FROM Customer c WHERE c.id = :id")
				.setParameter("id", id)
				.executeUpdate();
	}

	@Override public Customer getCustomerById(Long id) {
		return entityManager.find(Customer.class, id);
	}

	@Override public List<Customer> getAllCustomers() {
		return entityManager.createQuery("SELECT c FROM Customer c", Customer.class).getResultList();
	}
    @Transactional
	@Override public Customer update(Customer customer) {
		return entityManager.merge(customer);
	}
}
