package net.springmvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.springmvc.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}