package com.sf.controller;

import com.sf.learn.Person;
import com.sf.service.SpyService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    //1. MÓDSZER***********************************************
    //@Autowired
    //private  SpyService _spyGirl;

    //2. MÓDSZER***********************************************
    //private  SpyService _spyGirl;

    //@Autowired
    //public void set_spyGirl(SpyService _spyGirl) {
    //    this._spyGirl = _spyGirl;
    //}

    //3. MÓDSZER***********************************************
    private SpyService _spyGirl;
    private Person _person;

    @Value("${HomeController.msg}")
    private String message;

    //@Autowired
    public HomeController(SpyService spyGirl, Person person) {
        this._spyGirl = spyGirl;
        this._person = person;
    }

    @RequestMapping("/")
    public String Index(){
        return _spyGirl.iSaySomething();
    }

    @RequestMapping("/msg")
    public String Msg(){
        return this.message;
    }

    @RequestMapping("/getPerson")
    public String getPerson(){
        return this._person.toString();
    }

    @RequestMapping("/getSelectedProfile")
    public String getSelectedProfile(){
        return this._person.getProfileTypeAndMessage();
    }

}
