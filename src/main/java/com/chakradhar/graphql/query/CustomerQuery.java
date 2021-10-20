package com.chakradhar.graphql.query;

import com.chakradhar.graphql.dao.entity.CustomerObj;
import com.chakradhar.graphql.service.CustomerService;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CustomerQuery implements GraphQLQueryResolver {

    @Autowired
    private CustomerService customerService;

    public List<CustomerObj> customerDetails() {
        return this.customerService.getCustomerDetails();
    }

    public List<CustomerObj> getCustomers(final int count) {
        return this.customerService.getAllCustomers(count);
    }

    public CustomerObj customerbyId(final String customer_id) {
        return this.customerService.getCustomerbyId(customer_id);
    }


//customersByAddress(addressFilter: AddressFilter): [CustomerObj]
//    public List<CustomerObj> customersByAddress() {
//        return this.customerService.getCustomersByAddress();
//    }
}
