package com.ibanmo.service.account.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AccountController {
    private static final Log log = LogFactory.getLog(AccountController.class);

    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping("/account/services")
    public List<String> services() {
        return this.discoveryClient.getServices();
    }
}
