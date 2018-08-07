package com.RookieWZW.spring.boot.blog.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.RookieWZW.spring.boot.blog.domain.User;
import com.RookieWZW.spring.boot.blog.repository.UserRepository;

/**
 * @author RookieWZW
 * @version 创建时间：2018年8月4日 下午10:19:29 类说明
 */
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Transactional
	@Override
	public User saveUser(User user) {
		// TODO Auto-generated method stub
		return userRepository.save(user);
	}
	@Transactional
	@Override
	public void removeUser(Long id) {
		// TODO Auto-generated method stub
		userRepository.delete(id);
	}
	@Transactional
	@Override
	public void removeUsersInBatch(List<User> users) {
		// TODO Auto-generated method stub
		userRepository.deleteInBatch(users);
	}
	@Transactional
	@Override
	public User updateUser(User user) {
		// TODO Auto-generated method stub
		return userRepository.save(user);
	}

	@Override
	public User getUserById(Long id) {
		// TODO Auto-generated method stub
		return userRepository.getOne(id);
	}

	@Override
	public List<User> listUsers() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

	@Override
	public Page<User> listUsersByNameLike(String name, Pageable pageable) {
		// TODO Auto-generated method stub
		name = "%" + name + "%";
		Page<User> users = userRepository.findByNameLike(name, pageable);

		return users;
	}

}
