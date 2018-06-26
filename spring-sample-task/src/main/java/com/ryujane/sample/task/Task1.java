package com.ryujane.sample.task;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @author RyuJane
 */
@Component
public class Task1 {

    private static final Logger logger = LoggerFactory.getLogger(Task1.class);
    @Scheduled(cron = "0/5 * * * * ?")
    public void task1(){
        logger.info("Task1 has been executed");
    }
    @Scheduled(cron = "0 0/1 * * * ?")
    public void task2(){
        logger.info("Task2 has been executed");
    }
    @Scheduled(cron = "0 5/10 * * * ?")
    public void task3(){
        logger.info("Task3 has been executed");
    }
    @Scheduled(cron = "0 0 12 * * ?")
    public void task4(){
        logger.info("Task4 has been executed");
    }
}
