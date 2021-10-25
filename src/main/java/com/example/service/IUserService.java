/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.service;

import com.example.model.User;

/**
 *
 * @author b
 */
public interface IUserService {

	public User save(User user);

	public User getUser(String username);

	public Boolean update(User user);

}
