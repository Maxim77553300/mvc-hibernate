package net.springmvc.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import net.springmvc.entity.Customer;
import net.springmvc.exception.ResourceNotFoundException;
import net.springmvc.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    @Transactional
    public List < Customer > getCustomers() {
        return customerRepository.findAll();
    }

    @Override
    @Transactional
    public void saveCustomer(Customer theCustomer) {
        customerRepository.save(theCustomer);
    }

    @Override
    @Transactional
    public Optional<Customer> getCustomer(Integer id) throws ResourceNotFoundException {
        return customerRepository.findById(id);
    }

    @Override
    @Transactional
    public void deleteCustomer(Integer theId) {
        customerRepository.deleteById(theId);
    }
}