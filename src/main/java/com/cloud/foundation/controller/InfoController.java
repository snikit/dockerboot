package com.cloud.foundation.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InfoController {

	@Value("${DATABASE_HOST}")
	private String dbHost;
	@Value("${DATABASE_PORT}")
	private String dbPort;
	@Value("${DATABASE_NAME}")
	private String dbName;
	@Value("${DATABASE_USER}")
	private String dbUser;
	@Value("${DATABASE_PASSWORD}")
	private String dbPaas;

	public Map<String, String> getInfo() {

		Map<String, String> dataMap = new HashMap<>();
		dataMap.put("DATABASE_HOST", dbHost);
		dataMap.put("DATABASE_PORT", dbPort);
		dataMap.put("DATABASE_NAME", dbName);
		dataMap.put("DATABASE_USER", dbUser);
		dataMap.put("DATABASE_PASSWORD", dbPaas);

		System.err.println(System.getenv());

		return dataMap;

	}

}
