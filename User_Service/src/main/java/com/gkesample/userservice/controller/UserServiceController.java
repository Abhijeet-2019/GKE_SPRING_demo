package com.gkesample.userservice.controller;


import com.gkesample.userservice.domain.User;
import com.gkesample.userservice.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController("/user")
public class UserServiceController
    {
    @Autowired
    UserService userService;
    
    @GetMapping("/validate")
    public ResponseEntity<User> validateUsers (@RequestParam(name = "userName") String userName)
        {
        log.info ("Recived the validation Request for UserName{}", userName);
        User user = userService.validate (userName);
        return ResponseEntity.ok ().body (user);
        }

    @GetMapping("/fetchUserByCode")
        public  ResponseEntity<List<User>> fetchUsersByCode(@RequestParam(name="pincode")String pincode){
        log.info ("Recived the  Request to fetch user in pincode{}", pincode);
        List<User> userList = userService.fetchUserByPincode (pincode);
        return ResponseEntity.ok ().body (userList);
        }
    }
