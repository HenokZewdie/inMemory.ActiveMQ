package com.messaging.inMemory.ActiveMQ.resource;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.jms.Queue;

@RestController
@RequestMapping("/rest")
public class ProducerResource {

    @Autowired
    private JmsTemplate jmsTemplate;
    @Autowired
    private Queue queue;
    @GetMapping("/{message}")
    public String publish(@PathVariable("message") final String message1){

        jmsTemplate.convertAndSend(queue, message1);
        return "Published Successfully";
    }
}
