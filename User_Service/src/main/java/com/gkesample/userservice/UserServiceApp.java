package com.gkesample.userservice;

import java.time.LocalTime;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 *
 * https://www.youtube.com/watch?v=snZtITKxUBM
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
        LocalTime mylocalTime = LocalTime.now();
        log.info ("Starting the User service application---------{}---",mylocalTime);
        SpringApplication.run (UserServiceApp.class);
        log.info ("Started the user service application------------");
        
        }
    }