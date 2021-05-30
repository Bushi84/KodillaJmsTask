package com.example.jmsorder.domain;

import java.io.Serializable;
import java.math.BigDecimal;

public class Item implements Serializable {

    private String itemName;
    private int count;
    private BigDecimal amount;

    public Item(String itemName, int count, BigDecimal amount) {
        this.itemName = itemName;
        this.count = count;
        this.amount = amount;
    }

    public String getItemName() {
        return itemName;
    }

    public int getCount() {
        return count;
    }

    public BigDecimal getAmount() {
        return amount;
    }
}
