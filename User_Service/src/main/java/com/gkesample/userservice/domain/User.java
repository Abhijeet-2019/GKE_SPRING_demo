package com.gkesample.userservice.domain;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User
    
    {
    private int userId;
    private String userName;
    private String address;
    private boolean isAuthenticated;
    
    @Override
    public String toString ()
        {
        return "User ID -- " + userId + "--name--"  + userName + "--address--" + address
                       + "  -- and is authenticated--" + isAuthenticated;
        }
    }
