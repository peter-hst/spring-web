package com.example.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController
public class HomeController {

    @GetMapping("/")
    public Data index() throws UnknownHostException {
        return Data.builder()
                .dbHost(System.getenv("DB_HOST"))
                .dbUser(System.getenv("DB_USERNAME"))
                .dbPwd(System.getenv("DB_PASSWORD"))
                .msg("Hello Spring-boot v0.1.0-SNAPSHOT running in " + InetAddress.getLocalHost().getHostName())
                .build();
    }
}
