package com.vms.kafka.producer;

import com.example.vms.model.Visitor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;

public class Sender {

  private static final Logger LOGGER = LoggerFactory.getLogger(Sender.class);

  @Value("${kafka.topic.json}")
  private String jsonTopic;

  @Autowired
  private KafkaTemplate<String, Visitor> kafkaTemplate1;

 /* @Autowired
  private KafkaTemplate<String, Car> kafkaTemplate;*/

  public void send(Visitor visitor) {
    LOGGER.info("sending visitor='{}'", visitor.toString());
    kafkaTemplate1.send(jsonTopic, visitor);
  }

  /*public void send1(Car car) {
    LOGGER.info("sending car='{}'", car.toString());
    kafkaTemplate.send("CarProducer", car);
  }*/
}
