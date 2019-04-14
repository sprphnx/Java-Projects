package com.sprphnx.redis.jedis.jedisdemo.dao;

import com.sprphnx.redis.jedis.jedisdemo.model.Programmer;

public interface ProgrammerRepository {

	public void setProgrammer(String key, Programmer programmer);
	
	public Programmer getProgrammer(String key);
	
}
