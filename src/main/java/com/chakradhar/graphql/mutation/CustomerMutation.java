package com.chakradhar.graphql.mutation;

import com.chakradhar.graphql.dao.entity.CustomerCreated;
import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.chakradhar.graphql.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CustomerMutation implements GraphQLMutationResolver {

    @Autowired
    private CustomerService customerService;

    public CustomerCreated createCustomer(final String customer_id, final String first_name, final String last_name, final String email_id, final long phone_number, final String creation_date) {
        return this.customerService.createCustomer(customer_id, first_name, last_name, email_id, phone_number, creation_date);
    }
}
