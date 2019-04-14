package com.sprphnx.redis.jedis.jedisdemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sprphnx.redis.jedis.jedisdemo.dao.ProgrammerRepository;
import com.sprphnx.redis.jedis.jedisdemo.model.Programmer;

@Service
public class ProgrammerServiceImpl implements ProgrammerService {

	@Autowired
	private ProgrammerRepository programmerRepository;
	
	@Override
	public void setProgrammer(Programmer programmer) {
		//ObjectMapper objectMapper = new ObjectMapper();
		programmerRepository.setProgrammer(programmer.getId(),programmer);
		
	}

	@Override
	public Programmer getProgrammer(String key) {
		//ObjectMapper objectMapper = new ObjectMapper();
		//return objectMapper.readValue(programmerRepository.getProgrammer(key),Programmer.class);
		return programmerRepository.getProgrammer(key);
	}

}
