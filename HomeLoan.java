package com.OOPS.POC.Inheritance;

//same as personal loan but changing some business logic
public class HomeLoan extends Loan {
	//child
	void HomeLoanDocInfo() {
		System.out.println("Person Loan avvala ayya....!!!");
	}
	// ************MAIN METHOD***************
	public static void main(String[] args) {
		System.out.println("****Welcome to Na Bank Na Istam*****");

		HomeLoan pl = new HomeLoan();
		pl.HomeLoanDocInfo();

		boolean isValidPhone = pl.isValidPhone();
		boolean isAadharValid = pl.isAadharValid();
		boolean isPanValid = pl.isPanValid();

		if (isValidPhone && isAadharValid && isPanValid) {
			String name = pl.getCustomerName();
			System.out.println("Welcome: " + name);
			double salary = pl.getCustomerSalaryInfo();
			double cibil = pl.cibilInfo();
			int age = pl.getCustomerAge();

			if (salary > 600000.00 && (age >= 20 && age <= 45) && (cibil >= 300 && cibil <= 900)) {
				System.out.println("Congrtas....HomeLoan Loan ..");
				System.out.println("Rate of interest is: " + pl.getROI());
			} else {
				System.out
						.println("array babu munduu carrer meda focus pettu ra buggi taravatha loans tesukuduvu kani");
			}
		} else {
			System.out.println("InValid details");
		}
	}

}
