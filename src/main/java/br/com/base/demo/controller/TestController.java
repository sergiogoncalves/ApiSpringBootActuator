package br.com.base.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/controller")
public class TestController {


    @RequestMapping(path = "/", produces = "application/json", method = RequestMethod.GET)
    private String getStandard() {


        return "Standard";

    }
    }
