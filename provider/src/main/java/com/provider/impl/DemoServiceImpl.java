package com.provider.impl;

import com.api.DemoService;

public class DemoServiceImpl implements DemoService{

	public String testDubbo(String name) {
		// TODO Auto-generated method stub
		String result = "Hello"+name;
		System.out.println(result);
		return result;
	}

}
