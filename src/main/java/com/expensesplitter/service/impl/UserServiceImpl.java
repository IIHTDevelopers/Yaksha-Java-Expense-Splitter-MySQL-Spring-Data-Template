package com.expensesplitter.service.impl;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.expensesplitter.dto.UserDTO;
import com.expensesplitter.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Override
	public UserDTO createUser(UserDTO userDto) {
		// write your logic here
		return null;
	}

	@Override
	public UserDTO getUserById(Long userId) {
		// write your logic here
		return null;
	}

	@Override
	public UserDTO updateUser(Long userId, UserDTO userDto) {
		// write your logic here
		return null;
	}

	@Override
	public boolean deleteUser(Long userId) {
		// write your logic here
		return false;
	}

	@Override
	public Page<UserDTO> listUsers(Pageable pageable) {
		// write your logic here
		return null;
	}
}
