package tester;

import java.util.Scanner;
import payroll.*;

public class TestEmpArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("1:add Emp 2:Add Mgr 3:SalesPerson 4:display  5:show salary 6:exit");

		Scanner sc = new Scanner(System.in);
		int choice;
		Employee[] seed = new Employee[5];
		int index = 0;
		do {
			System.out.println("Enter Choice");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				if(index<seed.length)
				{
				System.out.println("Employee Details:empid name city salary");

				Employee emp = new Employee(sc.nextInt(), sc.next(), sc.next(), sc.nextDouble());
				seed[index]=emp;
				System.out.println("Employee added Successfully!!!");
				
				index++;
				}
				else
				{
					System.out.println("array Is Full");
				}
				break;
			case 2:
				if(index<seed.length)
				{
				System.out.println("Manager Details:empid name city salary incentives");

				Manager mgr = new Manager(sc.nextInt(), sc.next(), sc.next(), sc.nextDouble(),sc.nextInt());
				seed[index]=mgr;
				System.out.println("Manager added Successfully!!!");
				
				index++;
				}
				else
				{
					System.out.println("array Is Full");
				}
				break;
			case 3:
				if(index<seed.length)
				{
				System.out.println("SalesPerson Details:empid name city salary pa,fa ta");

				SalesPerson mgr = new SalesPerson(sc.nextInt(), sc.next(), sc.next(), sc.nextDouble(),sc.nextInt(),sc.nextInt(),sc.nextInt());
				seed[index]=mgr;
				System.out.println("SalesPerson added Successfully!!!");
				index++;
				}
				else
				{
					System.out.println("array Is Full");
				}
				break;
			case 4:System.out.println("---Employees In SEED-----");
			   for(int i=0;i<index;i++)
			   {
				 seed[i].display();  
				 //runtime check instance of index
				 if(seed[i] instanceof Manager)
				 {
				 ((Manager) seed[i]).showIncentives();//DownCasting emp into manager
				 }
				 else if(seed[i] instanceof SalesPerson)
				 {
					 ((SalesPerson)seed[i]).target();//downcasting emp into salesperson
				 }
			   }	
			
				break;
			case 5: for(int i=0;i<index;i++)
			   {
				System.out.println(seed[i].getClass());
				 
				//seed compile type is Employee
				seed[i].calSalary(); //seed[0]=emp,seed[1]=mgr seed[2]=sp 
			   
			 
			   
			   
			   }
				
				break;
			case 6:
				break;

			}

		} while (choice < 6);

	}

}
