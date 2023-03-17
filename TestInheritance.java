package tester;

import payroll.Employee;
import payroll.Manager;
import payroll.SalesPerson;

public class TestInheritance {

	public static void main(String[] args) {


		Employee emp=new  Employee();//empid name city salary
	     emp.display();
		System.out.println("------------------------");
		Manager mgr=new Manager();//empid name city salary+dptno
		 mgr.display();
		
		
		 System.out.println("------------------------");
		
		SalesPerson sp=new SalesPerson();
		sp.display();
		
		
		
		

	}

}
