package com.healthdisparities;

public enum GenderEnum {
	MALE("M", "Male"), FEMALE("F", "Female"); 
	
	private String initial;
	private String gender;
	
	private GenderEnum(String initial, String gender) {
		setInitial(initial);
		setGender(gender);
	}
	
	public static GenderEnum getByInitial(String initial) {
		for (GenderEnum gender : GenderEnum.values()) {
			if(gender.getInitial().equals(initial)) {
				return gender;
			}
		}
		
		return null;
	}
	
	public String getInitial() {
		return initial;
	}
	
	public void setInitial(String initial) {
		this.initial = initial;
	}
	
	public String getGender() {
		return gender;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	@Override
	public String toString() {
		return getGender();
	}
}
