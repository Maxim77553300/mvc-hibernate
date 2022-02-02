package net.springmvc.controller;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import net.springmvc.entity.Customer;
import net.springmvc.exception.ResourceNotFoundException;
import net.springmvc.service.CustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController {

    private static final Logger LOG = LoggerFactory.getLogger(CustomerController.class);

    @Autowired
    private CustomerService customerService;

    @GetMapping("/list")
    public String listCustomers(Model theModel) {
        List < Customer > customers = customerService.getCustomers();
        theModel.addAttribute("customers", customers);
        return "list-customer";
    }

    @GetMapping("/showForm")
    public String showFormForAdd(Model model) {
        LOG.debug("inside show customer-form handler method");
        Customer customer = new Customer();
        model.addAttribute("customer", customer);
        return "customer-form";
    }

    @PostMapping("/saveCustomer")
    public String saveCustomer(@ModelAttribute("customer") Customer customer) {
        customerService.saveCustomer(customer);
        return "redirect:/customer/list";
    }

    @GetMapping("/updateForm")
    public String showFormForUpdate(@RequestParam("customerId") int id,
                                    Model theModel) throws ResourceNotFoundException {
        Optional<Customer> customer = customerService.getCustomer(id);
        theModel.addAttribute("customer", customer);
        return "customer-form";
    }

    @GetMapping("/delete")
    public String deleteCustomer(@RequestParam("customerId") int id) throws ResourceNotFoundException {
        customerService.deleteCustomer(id);
        return "redirect:/customer/list";
    }
}