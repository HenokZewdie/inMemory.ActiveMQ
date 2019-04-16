package com.messaging.inMemory.ActiveMQ.listener;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component

public class Consumer3 {

    @JmsListener(destination = "standalone.queue")
public void consume(String message){
    System.out.println("The Message is " + message);
}
}



