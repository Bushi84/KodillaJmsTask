package com.example.jmsorder.domain;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

public class Order implements Serializable {

    private String orderNumber;
    private BigDecimal amount;
    private List<Item> items;

    public Order(String orderNumber, BigDecimal amount, List<Item> items) {
        this.orderNumber = orderNumber;
        this.amount = amount;
        this.items = items;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public List<Item> getItems() {
        return items;
    }
}
