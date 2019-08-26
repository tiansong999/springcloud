package com.cloud.wb_feign.controller;

import com.cloud.wb_feign.service.RemoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RemoteController {

    @Autowired
    RemoteService remoteService;

    @GetMapping(value = "/findCount")
    public String findCount(){
        return remoteService.findCount();
    }
}
