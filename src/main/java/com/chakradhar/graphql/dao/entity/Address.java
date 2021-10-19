package com.chakradhar.graphql.dao.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode
public class Address {
    private String address_id;
    private String address1;
    private String address2;
    private String city;
    private String state;
    private String postal_code;
    private String last_update_date;

    public String getAddress_id() {
        return address_id;
    }

    public void setAddress_id(String address_id) {
        this.address_id = address_id;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPostal_code() {
        return postal_code;
    }

    public void setPostal_code(String postal_code) {
        this.postal_code = postal_code;
    }

    public String getLast_update_date() {
        return last_update_date;
    }

    public void setLast_update_date(String last_update_date) {
        this.last_update_date = last_update_date;
    }

    public Address(String address_id, String address1, String address2, String city, String state, String postal_code, String last_update_date) {
        this.address_id = address_id;
        this.address1 = address1;
        this.address2 = address2;
        this.city = city;
        this.state = state;
        this.postal_code = postal_code;
        this.last_update_date = last_update_date;
    }

    public Address() {
    }
}
