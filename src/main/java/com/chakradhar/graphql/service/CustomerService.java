package com.chakradhar.graphql.service;

import com.chakradhar.graphql.dao.entity.Customer;
import com.chakradhar.graphql.dao.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CustomerService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Transactional
    public Customer createCustomer(final String customer_id, final String first_name, final String last_name, final String email_id, final long phone_number, final String creation_date) {
        final Customer customer = new Customer();
        customer.setCustomer_id(customer_id);
        customer.setFirst_name(first_name);
        customer.setLast_name(last_name);
        customer.setEmail_id(email_id);
        customer.setPhone_number(phone_number);
        customer.setCreation_date(creation_date);
        return this.customerRepository.save(customer);
    }

    @Transactional(readOnly = true)
    public List<Customer> getAllCustomers(final int count) {
        return this.customerRepository.findAll().stream().limit(count).collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public Customer getCustomerbyId(final String id) {
        //TODO: need to add persistant logic to get customer by ID
        return null;
    }
    /**
     * If postgres db is connected
     */

    /*
    @Transactional
    public Customer createCustomer(final String customer_id, final String first_name, final String last_name, final String email_id, final long phone_number, final String creation_date) {
        final Customer customer = new Customer();
        customer.setCustomer_id(customer_id);
        customer.setFirst_name(first_name);
        customer.setLast_name(last_name);
        customer.setEmail_id(email_id);
        customer.setPhone_number(phone_number);
        customer.setCreation_date(creation_date);
        int i = jdbcTemplate.update("INSERT INTO customers (customer_id, first_name, last_name, email_id, phone_number, creation_date) VALUES(?,?,?,?,?,?)",
                new Object[]{customer.getCustomer_id(), customer.getFirst_name(), customer.getLast_name(), customer.getEmail_id(), customer.getPhone_number(), customer.getCreation_date()});
        if (i != 0)
            return customer;
        else
            return new Customer();
    }

    @Transactional(readOnly = true)
    public List<Customer> getAllCustomers(final int count) {
        return jdbcTemplate.query("SELECT * from customers LIMIT ?", BeanPropertyRowMapper.newInstance(Customer.class), count);
    }


    @Transactional(readOnly = true)
    public Customer getCustomerbyId(final String id) {
        try {
            Customer customer = jdbcTemplate.queryForObject("SELECT * FROM Customers WHERE customer_id=?",
                    BeanPropertyRowMapper.newInstance(Customer.class), id);
            return customer;
        } catch (IncorrectResultSizeDataAccessException e) {
            return null;
        }
    }
    */
}
