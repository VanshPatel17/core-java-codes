package tester;

import java.util.Scanner;

import code.Account;
import code.AccountType;

public class TestAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.println("ActId Name Balance Account Type:(SAVING,CURRENT,LOAN)");
		int actid=sc.nextInt();
		String name=sc.next();
		double balance=sc.nextDouble();
		String type=sc.next();//"SAVING";
		//convert string into enum using valueOf
//		AccountType actType=AccountType.valueOf(type.toUpperCase());
//		 
//		Account act=new Account(actid, name, balance, actType);
//		act.accountDetails();
		
		Account act=new Account(actid, name, balance, type);
		act.accountDetails();
		
	}

}
