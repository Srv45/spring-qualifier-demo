package com.entity;

import org.springframework.stereotype.Component;

@Component("jio")
public class Jio implements Sim{

	@Override
	public String calling() {
		return "You Are Calling From Jio!";
	}

}
