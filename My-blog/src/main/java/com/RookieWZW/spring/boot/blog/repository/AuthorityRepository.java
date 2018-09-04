package com.RookieWZW.spring.boot.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.RookieWZW.spring.boot.blog.domain.Authority;


public interface AuthorityRepository extends JpaRepository<Authority, Long>{
}
