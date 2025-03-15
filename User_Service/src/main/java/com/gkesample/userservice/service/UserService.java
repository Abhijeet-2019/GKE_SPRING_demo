package com.gkesample.userservice.service;


import com.gkesample.userservice.domain.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class UserService
    {
    
    public User validate (String userName)
        {
        log.info ("validating the user {}", userName);
        User user = new User ();
        user.setUserId (1);
        user.setUserName (userName);
        user.setAddress ("SPPP");
        user.setAuthenticated (true);
        log.info ("The user is validated and the details are {}", user.toString ());
        return user;
        }
    
    
    public List<User> fetchUserByPincode (String pincode)
        {
        log.info ("fetching user By Pincode", pincode);
        User user = new User ();
        user.setUserId (1);
        user.setUserName ("Aaa");
        user.setAddress ("560068");
        user.setAuthenticated (true);
        log.info ("Fetced the user  {}", user.toString ());
        User user2 = new User ();
        user2.setUserId (10);
        user2.setUserName ("bbb");
        user2.setAddress ("560067");
        user2.setAuthenticated (true);
        log.info ("Fetced the user2  {}", user2.toString ());
        List<User> userList = new ArrayList ();
        userList.add (user);
        userList.add (user2);
        
        return userList;
        }
    }
