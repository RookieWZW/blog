package com.RookieWZW.spring.boot.blog.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.RookieWZW.spring.boot.blog.domain.User;

/**
 * @author RookieWZW
 * @version ����ʱ�䣺2018��8��4�� ����5:07:30 ��˵��
 */
public interface UserRepository extends JpaRepository<User, Long> {

	Page<User> findByNameLike(String name, Pageable pageable);

	User findByUsername(String username);

}
