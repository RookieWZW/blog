package com.RookieWZW.spring.boot.blog.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.RookieWZW.spring.boot.blog.domain.User;

/**
 * @author RookieWZW
 * @version ����ʱ�䣺2018��8��4�� ����10:13:01 ��˵��
 */
public interface UserService {

	User saveUser(User user);

	void removeUser(Long id);

	void removeUsersInBatch(List<User> users);

	User updateUser(User user);

	User getUserById(Long id);

	List<User> listUsers();

	Page<User> listUsersByNameLike(String name, Pageable pageable);

}
