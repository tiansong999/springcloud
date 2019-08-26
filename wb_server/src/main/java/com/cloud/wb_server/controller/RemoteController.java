package com.cloud.wb_server.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RemoteController {

    @RequestMapping("/findCount")
    public String findCount(){
        return "hi " + 55555 + " ,i am from port:" + "9099";
    }

}
