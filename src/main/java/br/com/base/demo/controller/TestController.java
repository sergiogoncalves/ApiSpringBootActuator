package br.com.base.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.actuate.metrics.MetricsEndpoint;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/controller")
public class TestController {

    private MetricsEndpoint counterService;
    private static Logger log = LoggerFactory.getLogger(TestController.class);


    @RequestMapping(path = "/", produces = "application/json", method = RequestMethod.GET)
    private String getStandard() {

        log.error("Testando erro de log");

        return "Standard";

    }
    }
