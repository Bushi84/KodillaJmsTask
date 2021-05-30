package com.example.jmsorder.reciver;

import com.example.jmsorder.domain.Item;
import com.example.jmsorder.domain.Order;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class MessageReceiver {

    @JmsListener(containerFactory = "jmsFactory", destination = "queue-order")
    public void receive(Order order) {
        System.out.println(order.getOrderNumber());
        for(Item item: order.getItems()) {
            System.out.println(" - " + item.getItemName() + ": " + item.getCount() + " x "  + item.getAmount() + " PLN");
        }
        System.out.println("Total: " + order.getAmount() + " PLN");
    }
}