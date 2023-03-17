package com.bank;

public class AccountValidation {

	public static Account isValidAccount(int actid, String name, String email, double balance)throws BankException  {
		 
			if (actid < 0)
				throw new BankException("Invalid Account No");

			if (name.length() < 3)
				throw new BankException("InValid Name");
			if (!email.contains("@") && !email.endsWith(".com"))
				throw new BankException("InValid email");
			if (balance < 5000)
				throw new BankException("Invalid Balanace");

			return new Account(actid, name, email, balance);
		 
	}

}
