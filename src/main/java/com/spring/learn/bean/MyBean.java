package com.spring.learn.bean;

import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
public class MyBean {

    private static Logger logger = Logger.getLogger(MyBean.class.getName());

    public MyBean() {
        logger.info("MyBean initialized");
    }

    public String getMessage(){
        return "Message from myBean";
    }
}
