package com.sprphnx.redis.jedis.jedisdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.sprphnx.redis.jedis.jedisdemo.model.Programmer;
import com.sprphnx.redis.jedis.jedisdemo.service.ProgrammerService;

@RestController
@RequestMapping("/programmer")
public class ProgrammerController {

	@Autowired
	private ProgrammerService programmerService;
	
	@PostMapping("/") 
	public void setProgrammer(@RequestBody Programmer programmer) {
		try {
			programmerService.setProgrammer(programmer);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
	}
	
	@GetMapping("/{key}")
	public Programmer getProgrammer(@PathVariable String key) {
			return programmerService.getProgrammer(key);

	}
}