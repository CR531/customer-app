package com.chakradhar.graphql.query;

import com.chakradhar.graphql.service.CustomerService;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.chakradhar.graphql.dao.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CustomerQuery implements GraphQLQueryResolver {

    @Autowired
    private CustomerService customerService;

    public List<Customer> getCustomers(final int count) {
        return this.customerService.getAllCustomers(count);
    }

    public Customer customerbyId(final String customer_id) {
        return this.customerService.getCustomerbyId(customer_id);
    }
}
