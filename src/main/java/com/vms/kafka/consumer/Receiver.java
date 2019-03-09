package com.vms.kafka.consumer;

import java.util.concurrent.CountDownLatch;

import com.example.vms.model.Visitor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;

public class Receiver {

  private static final Logger LOGGER = LoggerFactory.getLogger(Receiver.class);

  private CountDownLatch latch = new CountDownLatch(1);

  public CountDownLatch getLatch() {
    return latch;
  }

  /*@KafkaListener(topics = "${kafka.topic.json}")
  public void receive(Car car) {
    LOGGER.info("received car='{}'", car.toString());
    latch.countDown();
  }*/

  @KafkaListener(topics = "${kafka.topic.json}")
  public void receive(Visitor visitor) {
    LOGGER.info("received visitor='{}'", visitor.toString());
    System.out.println("send to queues");
    latch.countDown();
  }

/*  @KafkaListener(topics = "CarProducer")
  public void receive1(Car car) {
    LOGGER.info("received car='{}'", car.toString());
    System.out.println("send to queues");
    latch.countDown();
  }*/

}
