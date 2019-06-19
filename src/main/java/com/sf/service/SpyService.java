package com.sf.service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Scope("prototype")
@Component
@Service("spying")
public class SpyService {

    public String iSaySomething(){
        return "I'm a spy from the service!";
    }

}
