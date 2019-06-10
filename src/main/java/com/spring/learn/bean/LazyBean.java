package com.spring.learn.bean;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
@Lazy
public class LazyBean {

    private static Logger logger = Logger.getLogger(LazyBean.class.getName());

    public LazyBean(){
        logger.info("LazyBean initialized");
    }

    public String getMessage(){
        return "Message from lazyBean";
    }
}
