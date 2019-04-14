package com.sprphnx.redis.jedis.jedisdemo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import com.sprphnx.redis.jedis.jedisdemo.model.Programmer;

@Repository
public class ProgrammerRepositoryImpl implements ProgrammerRepository{

	@Autowired
	private RedisTemplate<String, Object> redisTemplate;
	
	@Override
	public void setProgrammer(String key, Programmer programmer) {
		redisTemplate.opsForValue().set(key, programmer);
		//redisTemplate.expire(key, 30, TimeUnit.SECONDS);
	}

	@Override
	public Programmer getProgrammer(String key) {
		return (Programmer) redisTemplate.opsForValue().get(key);
	}


}
