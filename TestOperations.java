package com.bank;

import java.util.Scanner;

public class TestOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner sc = new Scanner(System.in);

			System.out.println("Enter ActId Name email Balance");
			Account act1 = new Account(sc.nextInt(), sc.next(), sc.next(), sc.nextDouble());
			System.out.println(act1);

			System.out.println("Enter Amount For Withdraw");
			double amount = sc.nextDouble();

			act1.withdraw(amount);

			System.out.println("---after withdraw....save data in file.DB");

			
		} 
		catch(BankException b)
		{
			System.err.println(b.getMessage());
		b.printStackTrace();
		}
		
		catch (Exception ex) {
			ex.printStackTrace();
		}

	}

}
