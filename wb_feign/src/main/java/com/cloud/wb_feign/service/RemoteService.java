package com.cloud.wb_feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "wb-server")
public interface RemoteService {

    @RequestMapping(value = "/findCount",method = RequestMethod.GET)
    String findCount();
}
