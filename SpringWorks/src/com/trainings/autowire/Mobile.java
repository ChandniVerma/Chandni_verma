package com.trainings.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

public class Mobile {
	@Autowired
	private Camera camera;
	@Autowired
	private Speaker speaker;
	@Autowired
	private Screen screen;
	public Camera getCamera() {
		return camera;
	}
	
	
	
	public void setCamera(Camera camera) {
		this.camera = camera;
	}
	public Speaker getSpeaker() {
		return speaker;
	}

	public void setSpeaker(Speaker speaker) {
		this.speaker = speaker;
	}
	public Screen getScreen() {
		return screen;
	
	}
	
	public void setScreen(Screen screen) {
		this.screen = screen;
	}
	public Mobile() {
		System.out.println("creating Mobiloe"+this);
	}
	
	

}
