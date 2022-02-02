package net.springmvc.service;

import java.util.List;
import java.util.Optional;

import net.springmvc.entity.Customer;
import net.springmvc.exception.ResourceNotFoundException;

public interface CustomerService {

    public List < Customer > getCustomers();

    public void saveCustomer(Customer theCustomer);

    public Optional<Customer> getCustomer(Integer theId) throws ResourceNotFoundException;

    public void deleteCustomer(Integer theId) throws ResourceNotFoundException;
}