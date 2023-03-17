package com.bank;

import java.util.Scanner;

public class TestValidations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try
		{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter ActId Name email Balance");

		int actno = sc.nextInt();
		String name = sc.next();
		String email = sc.next();
		double balance = sc.nextDouble();

		Account act = AccountValidation.isValidAccount(actno, name, email, balance);

		if(act!=null)
		{
			System.out.println(act);
			System.out.println("Enter Amount For Withdraw");
			double amount = sc.nextDouble();

			act.withdraw(amount);

			System.out.println("---after withdraw....save data in file.DB");

		}
		System.out.println("---perform operation on Account---");
		
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}

}
