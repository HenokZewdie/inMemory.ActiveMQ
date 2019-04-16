package com.messaging.inMemory.ActiveMQ.listner;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {
    @JmsListener(destination = "inmemory_queue")
    public void listener(String message){
        System.out.println("Message Received is " + message);
    }
}
