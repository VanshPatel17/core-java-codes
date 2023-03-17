package com.bank;


//class is User Define Data Type:ref type/non primitive type
public class Account {

	//data members:fields
	//private inside class only:hidden out side class
	private int actNo;
	private String name,email;
	private double balance;
	
	//constr is used for initialization of data members at the of object creation
	
	public Account()//default constr
	{
		System.out.println("---default constr---");
		actNo=101;
		name="Ram";
		email="ram@gmail.com";
		balance=10000;
	}
	//accept parameter
	public Account(int id,String nm,String em,double bal)
	{System.out.println("---parameter constr---");
		actNo=id;
		name=nm;
		email=em;
		balance=bal;
	}
	
	
	//operations :behaviour---->method(functions)
	
 	public void withdraw(double amount)throws BankException
	{
 		if(balance>amount)
 		{
 		balance=balance-amount;
	System.out.println("after withdraw current balance :"+balance);
 		}
 		else
 		{
 			System.out.println("low balance");
 			//throw exception
 			throw new BankException("ERROR:    Low Balanace:");
 		}
		
	}
	public void deposite(double amount)
	{
		balance=balance+amount;
		System.out.println("after deposite current balance :"+balance);
		
		
	}
	@Override
	public String toString() {
		return "Account [actNo=" + actNo + ", name=" + name + ", email=" + email + ", balance=" + balance + "]";
	}

	
	
	
	
	
}
