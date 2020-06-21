package com.singtel.codingtest.sample.model;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

public class Model implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@NotNull
	private String language;
	
	@NotNull
	private String sound;

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getSound() {
		return sound;
	}

	public void setSound(String sound) {
		this.sound = sound;
	}
	

}
