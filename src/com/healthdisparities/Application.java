package com.healthdisparities;

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
		
		scanner.close();
		
	
	}

}
