package com.epam.as.milkproduct.main;


import com.epam.as.milkproduct.entity.Delivery;
import com.epam.as.milkproduct.entity.DeliveryFactory;
import org.slf4j.*;

public class Runner {
    private final static Logger logger = org.slf4j.LoggerFactory.getLogger(Runner.class);

    public static void main(String[] args) throws CloneNotSupportedException {

        Delivery delivery = DeliveryFactory.createRandomDelivery();
//        System.out.println(delivery);

        logger.warn(String.valueOf(delivery));

//        Delivery clonedDelivery = (Delivery) delivery.clone();
//        System.out.println("Cloned delivery: " + clonedDelivery);
    }


}