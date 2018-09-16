package com.healthdisparities;

import java.util.List;

public class Disease {
	private String name ;
	private int minimumAge ;
	private List<GenderEnum> genders; 
	private List<EthnicityEnum> ethnicity;
	
	public Disease(String name, int minimumAge, List<GenderEnum> genders, List<EthnicityEnum> ethnicities) {
		this.name = name;
		this.minimumAge = minimumAge;
		this.genders = genders;
		this.ethnicity = ethnicities; 
	}
	
	public String getName() {
		return name;
	}
	
	public int getMinimumAge() {
		return minimumAge;
	}
	
	public List<GenderEnum> getGenders() {
		return genders ; 
	}
	
	public List<EthnicityEnum> getEthnicities() {
		return ethnicity ;
	}
	
	@Override
	public String toString() {
		return getName(); 
	}
}
