package tester;

import java.util.Scanner;

import payroll.Employee;
import payroll.Manager;
import payroll.SalesPerson;

public class TestInteheritanceConstr {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*System.out.println("Create Employee");
		System.out.println("EmpId Name City Salary");
		
		Employee emp=new Employee(sc.nextInt(), sc.next(), sc.next(), sc.nextDouble());
		
		emp.display();*/
		
//		System.out.println("Create Manager ");
//		System.out.println("empid name city salary deptno");
//		Manager mgr=new Manager(sc.nextInt(), sc.next(), sc.next(), sc.nextDouble(),sc.nextInt());
//		mgr.display();
		
		//menu 1:create employee 2:create manager 3:create salesperson
		
		
		
		
		Employee emp=new Employee(202, "Ritesh", "Mumbai", 45000);
		emp.calSalary();//employee
		emp.display();//employee
		System.out.println("-----------------------------");
		
		Manager mgr=new Manager(404, "Sumit", "Nagar", 80000, 7000);
		mgr.calSalary();
		mgr.display();
		
		mgr.assignTask();
		
		System.out.println("-----------------------------");
		
		
		SalesPerson sp=new SalesPerson(808, "Nilesh", "Thane", 25000, 1000, 2000, 3000);
		sp.calSalary();
		sp.display();
		sp.target();//salesperson
		
		
		System.out.println("\n\n\n\n\n------------------------");
		
		Employee obj=new Manager(555,"Nitesh","Nagpur",70000,20000);
		obj.calSalary();
		
		
		
		

	}

}
