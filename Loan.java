//here we are creating methods in every class we are creating a super class through which all the others class inherit
//to avoid duplication
package com.OOPS.POC.Inheritance;

import java.util.Scanner;
//whatever the common functionalities or utility functionalities are there we keep in the parent class/super/base class
public class Loan {
	static Scanner sc = new Scanner(System.in);
	// *********method to check if the phone is valid before entering the
	// app**********
	boolean isValidPhone() {
		System.out.println("Enter your Phone Number: ");
		String phone = sc.next();
		boolean isValid = phone.matches("^[6-9][0-9]{9}");// this matches method is a predefined method in String class
															// takes regular expression as input
		// since we have to check it the number matches we are taking the input as
		// string // input(^(6-9) means first number &
		// the next 9 numbers in the phone number can be between 0-9(so the reg
		// expression can be ([0-9]{9})
		return isValid;// if the input is correct it will return true otherwise it will return false
	}

	// ***********method to check if user aadhar is valid or not********
	boolean isAadharValid() {
		System.out.println("Enter your Aadhar number : ");
		String aadhar = sc.next();
		boolean isAadharValid = aadhar.matches("^[2-9][0-9]{11}");
		return isAadharValid;
	}

	// ABCD1234H
	boolean isPanValid() {
		System.out.println("Enter your Pan card details : ");
		String pan = sc.next();
		boolean isPanValid = pan.matches("^[A-Z]{5}[0-9]{4}[A-Z]{1}");// here [] allow what num or aplha it will accept
																		// and {} will tell how many number should be
																		// written
		return isPanValid;
	}

	// *******method to get customers name*******
	String getCustomerName() {
		sc.nextLine();// since we wrote sc.next in the phone valid method here we should write
						// sc.nextline to get better formatting
		System.out.println("Enter your good Name : ");
		String name = sc.nextLine();
		return name;
	}

	// *******method to get customers age*******
	int getCustomerAge() {
		System.out.println("Enter your age : ");
		int age = sc.nextInt();
		return age;
	}

	// *******method to get customers cibil info*******
	int cibilInfo() {
		System.out.println("enter your CIBIL score : ");
		int cibil = sc.nextInt();
		return cibil;
	}

	// *******method to get customers salaryinfo*******
	double getCustomerSalaryInfo() {
		System.out.println("enter your Salary : ");
		double salary = sc.nextDouble();
		return salary;
	}

	// *******method to get customers roi details*******
	double getROI() {
		int cibil = cibilInfo();// calling method inside another method(instance methods inside another instance
								// method can be called directly)
		double roi = 15.0;
		if (cibil >= 300 && cibil < 550) {
			System.out.println("Poor CIBIL Score");
			return roi = roi + 1.0;
		} else if (cibil >= 550 && cibil < 650) {
			System.out.println("average cibil score ");
			return roi; // we can return in the block also
		} else if (cibil >= 650 && cibil < 750) {
			System.out.println("good cibil score: ");
			return roi = roi - 2.0;
		} else if (cibil >= 750 && cibil <= 900) {
			System.out.println("excellent cibil score---");
			return roi = roi - 4.0;
		} else {
			System.out.println("Evadu ra unvu asalu(Invaild cibil score)");
			return roi;
		}
	}


}
