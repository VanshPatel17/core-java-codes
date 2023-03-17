package payroll;

import contract.IPrintable;

public final  class Manager extends Employee implements IPrintable {

	private int incentives;

	
	
	public Manager() {
	 	super();//this will cal Employee class def constr
		System.out.println("----default Manager constr----");
	}
	
	public Manager(int empid,String name,String city,double salary,int incentives)
	{//by default default constr
		//super();//default
		super(empid,name,city,salary);//parameter constr 
		this.incentives=incentives;
		//super();
	}
	
	//manager hides calSalary() of Employee
	//by keeping same fun name with same signature
	//method overrding
	@Override
	public void calSalary() {
		System.out.println("Manager :" + (super.salary+this.incentives));

	}
	//error :final method can not be override
//	public void calIncomeTax()
//	{
//		System.out.println("Inside Manager only Calculate Income Tax");
//	}
	public void showIncentives()
	{
		System.out.println("manager specific function");
	}
	@Override
public void display() {
	super.display();
	System.out.println("Incentives:"+this.incentives);
	
	
	
	}
	
	
	public void assignTask()
	{
		System.out.println("---manager class function----");
	}

	@Override
	public void print() {
	System.out.println("print in Manager");
	}
	
	
	
	
}
