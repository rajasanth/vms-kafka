package com.vms.kafka.controller;

import com.example.vms.model.Visitor;
import com.vms.kafka.producer.Sender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaController {

    @Autowired
    Sender sender;

    @PostMapping("/visitors")
    public String createVisitor(@RequestBody Visitor visitor) {
        sender.send(visitor);
        return "Visitor is created ";

    }
}
