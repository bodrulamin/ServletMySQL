/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.service;

import com.example.dao.IUserDao;
import com.example.dao.UserDaoIml;
import com.example.model.User;

/**
 *
 * @author b
 */
public class UserService implements IUserService {

	private IUserDao dao;

	public UserService() {
		dao = new UserDaoIml();
	}

	@Override
	public User save(User user) {
		return dao.save(user);
	}

	@Override
	public User getUser(String username) {
		return dao.getUser(username);
	}

	@Override
	public Boolean update(User user) {
		return dao.update(user);
	}

}
