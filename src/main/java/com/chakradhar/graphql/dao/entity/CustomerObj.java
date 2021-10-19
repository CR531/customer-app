package com.chakradhar.graphql.dao.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import java.util.List;

@Data
@EqualsAndHashCode
public class CustomerObj {
    private String customer_id;

    private String first_name;

    private String last_name;

    private String email_id;

    private long phone_number;

    private String creation_date;

    private List<Address> addressDetails;

    public CustomerObj() {

    }

    public String getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(String customer_id) {
        this.customer_id = customer_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail_id() {
        return email_id;
    }

    public void setEmail_id(String email_id) {
        this.email_id = email_id;
    }

    public long getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(long phone_number) {
        this.phone_number = phone_number;
    }

    public String getCreation_date() {
        return creation_date;
    }

    public void setCreation_date(String creation_date) {
        this.creation_date = creation_date;
    }

    public List<Address> getAddressDetails() {
        return addressDetails;
    }

    public void setAddressDetails(List<Address> addressDetails) {
        this.addressDetails = addressDetails;
    }

    public CustomerObj(String customer_id, String first_name, String last_name, String email_id, long phone_number, String creation_date, List<Address> addressDetails) {
        this.customer_id = customer_id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email_id = email_id;
        this.phone_number = phone_number;
        this.creation_date = creation_date;
        this.addressDetails = addressDetails;
    }
}
