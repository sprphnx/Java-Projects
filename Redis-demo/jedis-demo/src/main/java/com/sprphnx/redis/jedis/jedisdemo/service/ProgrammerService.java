package com.sprphnx.redis.jedis.jedisdemo.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.sprphnx.redis.jedis.jedisdemo.model.Programmer;

public interface ProgrammerService {

	public void setProgrammer(Programmer programmer) throws JsonProcessingException;
	
	public Programmer getProgrammer(String key);
	
}
