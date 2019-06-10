package com.spring.learn.bean;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
public class StartUpBean implements ApplicationListener<ApplicationReadyEvent> {
    private static Logger logger = Logger.getLogger(StartUpBean.class.getName());

    @Override
    public void onApplicationEvent(ApplicationReadyEvent applicationReadyEvent) {
        logger.info("Application is ready");
    }
}
