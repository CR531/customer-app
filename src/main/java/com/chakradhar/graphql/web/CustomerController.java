package com.chakradhar.graphql.web;

import com.chakradhar.graphql.dao.entity.Customer;
import com.chakradhar.graphql.dao.entity.CustomerCreated;
import com.chakradhar.graphql.dao.entity.CustomerObj;
import com.chakradhar.graphql.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/api")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @GetMapping("/v1/customers/")
    public ResponseEntity<List<CustomerObj>> getCustomers(@RequestParam(defaultValue = "10", required = true) int limit) {
        List<CustomerObj> customerObjs = new ArrayList<CustomerObj>();

        try {
            customerObjs = customerService.getAllCustomers(limit);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ResponseEntity.ok(customerObjs);
    }

    @GetMapping("/v1/customers/{customerId}")
    public ResponseEntity<CustomerObj> getCustomerbyCustomerId(
            @PathVariable String customerId) {
        CustomerObj customerObj = new CustomerObj();

        try {
            customerObj = customerService.getCustomerbyId(customerId);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ResponseEntity.ok(customerObj);
    }

    @PostMapping("/v1/customers/")
    public ResponseEntity<CustomerCreated> Customers(
            @RequestBody Customer customer) {

        CustomerCreated customerCreated = null;

        try {
            customerCreated = customerService.createCustomer(customer.getCustomer_id(), customer.getFirst_name(), customer.getLast_name(), customer.getEmail_id(), customer.getPhone_number(), customer.getCreation_date());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ResponseEntity.ok(customerCreated);
    }
}
