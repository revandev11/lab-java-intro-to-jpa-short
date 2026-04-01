package com.ironhack.demo;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import jakarta.persistence.*;

@Entity
@Table
public class Customer {
@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer customerId;
    @Column(name = "customer_name",nullable = false)
    private String customerName;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false,name = "status")
    private String customerStatus;
    @Column(nullable = false,name = "mileage")
    private Integer totalCustomerMileage;

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerStatus() {
        return customerStatus;
    }

    public void setCustomerStatus(String customerStatus) {
        this.customerStatus = customerStatus;
    }

    public Integer getTotalCustomerMileage() {
        return totalCustomerMileage;
    }

    public void setTotalCustomerMileage(Integer totalCustomerMileage) {
        this.totalCustomerMileage = totalCustomerMileage;
    }

    public Customer(Integer customerId, String customerName, String customerStatus, Integer totalCustomerMileage) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerStatus = customerStatus;
        this.totalCustomerMileage = totalCustomerMileage;
    }
}
