//Creating a console based load banking System as a POC of Inheritance
package com.OOPS.POC.Inheritance;
import java.util.Scanner;

//child class
public class PersonalLoan extends Loan{
	static Scanner sc = new Scanner(System.in);
	
	//the below method is specific to personal loan
	void PersonalLoanDocInfo() {
		System.out.println("Welcome to Personal Loan section of OOPS Banking ysytem....!!!");
	}

	// ************MAIN METHOD***************
	public static void main(String[] args) {
		System.out.println("****Welcome to OOPS Banking System*****");

		PersonalLoan pl = new PersonalLoan();
		pl.PersonalLoanDocInfo();

		boolean isValidPhone = pl.isValidPhone();
		boolean isAadharValid = pl.isAadharValid();
		boolean isPanValid = pl.isPanValid();

		

		if (isValidPhone && isAadharValid && isPanValid) {
			//String name = pl.getCustomerName();
			//System.out.println("Please enter your name " + name);
			double salary = pl.getCustomerSalaryInfo();
			double cibil = pl.cibilInfo();
			int age = pl.getCustomerAge();
			
			if (salary > 800000.00 && (age >= 20 && age <= 60) && (cibil >= 300 && cibil <= 900)) {
				System.out.println("Congrats....your are eligible for PersonalLoan Loan .");
				System.out.println("ne Rate of interest is: " + pl.getROI());
			} else {
				System.out
						.println("array babu munduu carrer meda focus pettu ra buggi taravatha loans tesukuduvu kani");
			}
		} else {
			System.out.println("InValid details.");
		}
	}

}
