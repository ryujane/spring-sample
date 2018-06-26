package com.ryujane.sample.task;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Ryujane
 */
public class Task {

    private static final Logger logger = LoggerFactory.getLogger(Task.class);
    public void task1(){
        logger.info("Task1 has been executed");
    }

    public void task2(){
        logger.info("Task2 has been executed");
    }

    public void task3(){
        logger.info("Task3 has been executed");
    }
}
