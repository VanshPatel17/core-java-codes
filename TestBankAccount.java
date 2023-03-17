package app.taster;

import java.util.Scanner;

import app.code.BankAccount;

public class TestBankAccount {
public static void main(String[] args) {
	
	
	BankAccount act=new BankAccount(303, "Rajesh", 5600);
	System.out.println(act);
	
	System.out.println("Do You Want Locker (yes/no)");
	Scanner sc=new Scanner(System.in);
	String choice=sc.next();
	
	if(choice.equals("yes"))
	{
		System.out.println("Enter Duration (years)");
		int years=sc.nextInt();
		
		act.setLocker(years);
		System.out.println(act);
	}
	
	
	act.test();//this will create method inner  class and invoke 
	
	
}
}
