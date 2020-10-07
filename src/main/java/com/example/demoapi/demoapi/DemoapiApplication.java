package com.example.demoapi.demoapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoapiApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoapiApplication.class, args);
        //flow of application
        //user-> request to rest endpoint
        // user -> request(eg. postman) -> controller(rest) -> service(business logic) -> repository (db interaction)
        // (then vice versa)
    }
}
