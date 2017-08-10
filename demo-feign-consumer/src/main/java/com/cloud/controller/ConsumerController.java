package com.cloud.controller;

import com.cloud.service.ComputeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by pgwt on 2017/8/10.
 */
@RestController
public class ConsumerController {


    @Autowired
    private ComputeService computeService;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public Integer add() {
        return computeService.add(10, 20);
    }
}
