package tester;

import code.Circle;
import contract.IPrintable;
import payroll.Manager;
import payroll.SalesPerson;


 
public class TestInterface {

	
	public static void showPrint(IPrintable obj)
	{
		obj.print();
	}
	
	public static void main(String[] args) {
	
	Manager mgr=new  Manager();
	//mgr.display();
	//mgr.print();
	mgr.accpet();
	
	Circle c=new Circle();
	 c.print();
	 c.accpet();
	
	showPrint(mgr);
	showPrint(c);
	SalesPerson sp=new SalesPerson();
	
	}
	

}
