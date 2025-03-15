package com.gkesample.userservice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * Swagger Link  :
 *                  <a href="http://localhost:8080/swagger-ui/index.html">...</a>
 * This is the main class of User service.
 */
@Slf4j
@SpringBootApplication
public class UserServiceApp
    {
    
    public static void main (String[] args)
        {
        log.info ("Starting the User service application------------");
        SpringApplication.run (UserServiceApp.class);
        log.info ("Started the user service application------------");
        
        }
    }