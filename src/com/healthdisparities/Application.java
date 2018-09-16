package com.healthdisparities;

import static com.healthdisparities.GenderEnum.FEMALE;
import static com.healthdisparities.GenderEnum.MALE;
import static com.healthdisparities.EthnicityEnum.*; 

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please specify age: ");
		int age = scanner.nextInt();
		System.out.println("Age: "+age);
		
		System.out.print("Please specify gender (M/F): ");
		String gender = scanner.next();
		System.out.println("Gender: " + GenderEnum.getByInitial(gender));
	
		System.out.print("Please specify ethnicity (American Indian (1), Asian (2), African American (3), Hispanic (4), White (5): ");
		int ethnicity = scanner.nextInt();
		System.out.println("Ethnicity: " + EthnicityEnum.getbyNumber(ethnicity));
		
		System.out.println("Most likely diseases: " + getMatchingDiseases(age, GenderEnum.getByInitial(gender), EthnicityEnum.getbyNumber(ethnicity)));
		
		scanner.close();
	}
	
	private static List<Disease> getAllDiseases() {
		List<Disease> diseases = new ArrayList<>();
		
		diseases.add(new Disease("Stroke", 40, Arrays.asList(MALE, FEMALE), Arrays.asList(WHITE)));
		diseases.add(new Disease("Diabetes", 13, Arrays.asList(MALE, FEMALE), Arrays.asList(HISPANIC, AMERICAN_INDIAN)));
		
		return diseases;
	}
	
	private static List<Disease> getMatchingDiseases(int age, GenderEnum gender, EthnicityEnum ethnicity) {
		List<Disease> matchingDiseases = new ArrayList<>();	
		
		for(Disease disease : getAllDiseases()) {	
			if(age >= disease.getMinimumAge() && disease.getGenders().contains(gender) && disease.getEthnicities().contains(ethnicity)) {
				matchingDiseases.add(disease);
			}
		}
		
		return matchingDiseases ; 
	}
}
