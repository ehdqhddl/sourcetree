package com.example.treetest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PublicController {
    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public String retrieveText(@RequestParam String text){
        return text;
    }
}
