package com.pluralsight.model;

import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Range;


public class Exercise {
	
	@Range(min = 1, max = 120)
	private int minutes;
	
	@NotNull
	private String activity;
	
	

	public String getActivity() {
		return activity;
	}

	

	public int getMinutes() {
		return minutes;
	}

	public void setActivity(String activity) {
		this.activity = activity;
	}


	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}
	
}
