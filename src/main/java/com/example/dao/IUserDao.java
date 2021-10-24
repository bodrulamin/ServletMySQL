
package com.example.dao;

import com.example.model.User;


public interface IUserDao {
    public User save(User user);
    public User getUser(String username);
    public Boolean update(User user);
    
}
