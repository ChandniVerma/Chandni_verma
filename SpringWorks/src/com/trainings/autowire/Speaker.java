package com.trainings.autowire;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class Speaker {
	
	@Value("${mobile.speakertype}")
	private String type;
	@Value("${mobile.volume}")
	
	private int volLevels;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getVolLevels() {
		return volLevels;
	}
	public void setVolLevels(int volLevels) {
		this.volLevels = volLevels;
	}
	public Speaker() {
		System.out.println("Creating Speaker"+this);
	}
	
	

}
