package com.chakradhar.graphql.dao.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode
public class CustomerCreated {
    private String customer_id;

    public CustomerCreated(String customer_id) {
        this.customer_id = customer_id;
    }

    public CustomerCreated() {
    }

    public String getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(String customer_id) {
        this.customer_id = customer_id;
    }
}
