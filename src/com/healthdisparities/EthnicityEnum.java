package com.healthdisparities;

public enum EthnicityEnum {
	AMERICAN_INDIAN (1,"American Indian"), 
	ASIAN (2, "Asian"), 
	AFRICAN_AMERICAN (3, "African American"), 
	HISPANIC (4, "Hispanic"), 
	WHITE (5, "White");
	
	private int number;
	private String ethnicity; 
	
	
	private EthnicityEnum (int number, String ethnicity) {
		setNumber(number);
		setEthnicity(ethnicity);
	}

	private void setEthnicity(String ethnicity2) {
		this.ethnicity = ethnicity2;
	}

	private void setNumber(int number2) {
	    this.number = number2;
	}
	
	public static EthnicityEnum getbyNumber (int number) {
		for (EthnicityEnum ethnicity : EthnicityEnum.values()) {
			if (ethnicity.number == number) {
				return ethnicity; 
			}
		}
		
		return null; 
	}
	
	@Override
	public String toString() {
		return ethnicity; 

	}
}
