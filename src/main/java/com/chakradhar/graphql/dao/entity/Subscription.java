package com.chakradhar.graphql.dao.entity;

public class Subscription {
    private String subscription_id;
    private String customer_id;
    private String subscription_on_date;
    private String subscription_off_date;
    private long balance_pending;

    public String getSubscription_id() {
        return subscription_id;
    }
    public void setSubscription_id(String subscription_id) {
        this.subscription_id = subscription_id;
    }
    public String getCustomer_id() {
        return customer_id;
    }
    public void setCustomer_id(String customer_id) {
        this.customer_id = customer_id;
    }
    public String getSubscription_on_date() {
        return subscription_on_date;
    }
    public void setSubscription_on_date(String subscription_on_date) {
        this.subscription_on_date = subscription_on_date;
    }
    public String getSubscription_off_date() {
        return subscription_off_date;
    }
    public void setSubscription_off_date(String subscription_off_date) {
        this.subscription_off_date = subscription_off_date;
    }
    public long getBalance_pending() {
        return balance_pending;
    }
    public void setBalance_pending(long balance_pending) {
        this.balance_pending = balance_pending;
    }

}
