package com.itachallenge.challenge.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/itachallenge/api/v1/challenge")
public class ChallengeController {

    private static final Logger log = LoggerFactory.getLogger(ChallengeController.class);

    @GetMapping(value = "/test")
    public String test() {
        log.info("** Saludos desde el logger **");
        return "Hello from ITA Challenge!!!";
    }


}