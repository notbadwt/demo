package com.cloud.controller;

import com.cloud.service.ComputeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by pgwt on 2017/8/10.
 */
@RestController
public class ConsumerController {

    @Autowired
    private ComputeService computeService;

    @Value("${from}")
    private String from;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String add() {
        return computeService.addService();
    }

    @RequestMapping(value = "/config_file", method = RequestMethod.GET)
    public String configFile() {
        System.out.println(from);
        return from;
    }

}
