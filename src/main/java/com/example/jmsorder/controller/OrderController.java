package com.example.jmsorder.controller;

import com.example.jmsorder.domain.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/messages")
public class OrderController {

    @Autowired
    private JmsTemplate jmsTemplate;

    @PostMapping(path = "/process")
    public void processMessage(@RequestBody Order order) {

        jmsTemplate.convertAndSend("queue-order", order);
    }
}
