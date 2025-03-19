package com.gkesample.userservice.controller;


import com.gkesample.userservice.domain.User;
import com.gkesample.userservice.service.UserService;
import com.gkesample.userservice.utils.LogExecutionTime;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController("/user")
public class UserServiceController
    {
    @Autowired
    UserService userService;
    
    @GetMapping("/validate")
    @LogExecutionTime
    public ResponseEntity<User> validateUsers (@RequestParam(name = "userName") String userName)
        {
        log.info ("Recived the validation Request for UserName{}", userName);
        User user = userService.validate (userName);
        return ResponseEntity.ok ().body (user);
        }
    
    @GetMapping("/fetchUserByCode")
    @LogExecutionTime
    public ResponseEntity<List<User>> fetchUsersByCode (@RequestParam(name = "pincode") String pincode)
        {
        log.info ("Recived the  Request to fetch user in pincode{}", pincode);
        List<User> userList = userService.fetchUserByPincode (pincode);
        return ResponseEntity.ok ().body (userList);
        }
    
    @PostMapping("/addUsers")
    @LogExecutionTime
    public ResponseEntity<String> addUsers (@RequestBody User users)
        {
        log.info ("Received the  Request to fetch user in pin Code {}", users.getUserId ());
        return ResponseEntity.ok ().body ("User added Successfully");
        }

    @GetMapping("/Hello")
    @LogExecutionTime
    public ResponseEntity<User> testMethod (@RequestParam(name = "userName") String userName)
        {
        log.info ("Recived the Test mathod{} for HELLO -----", userName);
        User user = userService.validate (userName);
        return ResponseEntity.ok ().body (user);
        }
        
    }
