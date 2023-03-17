package payroll;

public class SalesPerson extends Employee {

	private int pa,fa,ta;

	public SalesPerson() {
		System.out.println("-----default of SalesPerson----");
			
	}
	
	public SalesPerson(int empid,String name,String city,double salary,int pa,int fa,int ta) {
		
		super(empid,name,city,salary);
		this.pa=pa;
		this.fa=fa;
		this.ta=ta;
	}
	
	
	public void target()
	{
		System.out.println("--salesperson class function---");
	}
	
	
	public void calSalary()
	{
	System.out.println("Sales Person ="+(super.salary+this.pa+this.fa+this.ta));	
	
	}
	public void display() {
		super.display();
		System.out.println(pa+"   "+ta+ "    "+fa   );
	 	}
}
