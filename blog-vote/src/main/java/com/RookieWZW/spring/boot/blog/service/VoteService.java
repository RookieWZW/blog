package com.RookieWZW.spring.boot.blog.service;

import com.RookieWZW.spring.boot.blog.domain.Vote;

/**
 * @author RookieWZW
 * @version 创建时间：2018年8月4日  类说明
 */
public interface VoteService {
	/**
	 * 根据id获取 Vote
	 * @param id
	 * @return
	 */
	Vote getVoteById(Long id);
	/**
	 * 删除Vote
	 * @param id
	 * @return
	 */
	void removeVote(Long id);
}
