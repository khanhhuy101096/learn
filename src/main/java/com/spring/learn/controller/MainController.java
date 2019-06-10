package com.spring.learn.controller;

import com.spring.learn.bean.LazyBean;
import com.spring.learn.bean.MyBean;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @Autowired
    private BeanFactory factory;

    @GetMapping(value="messages")
    public String getMessages(Model model){
        LazyBean lazyBean = factory.getBean(LazyBean.class);
        MyBean myBean = factory.getBean(MyBean.class);

        model.addAttribute("myBean", myBean);
        model.addAttribute("lazyBean", lazyBean);

        return "showMessages";
    }
}
