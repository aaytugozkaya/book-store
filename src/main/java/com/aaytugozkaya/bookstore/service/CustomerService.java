package com.aaytugozkaya.bookstore.service;

import com.aaytugozkaya.bookstore.model.Customer;
import com.aaytugozkaya.bookstore.repository.CustomerRepository;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    CustomerRepository customerRepository;

    CustomerService(CustomerRepository customerRepository){
        this.customerRepository = customerRepository;
    }
}
