package com.entity;

import org.springframework.stereotype.Component;

@Component("airtel")
public class Airtel implements Sim {

	@Override
	public String calling() {
		return "You Are Calling From Airtel!";
	}

}
