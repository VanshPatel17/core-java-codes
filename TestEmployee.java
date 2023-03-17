
public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("----client code-------");
		//create employee
		//
		int a=10;//int is primitive type:value type 
		Employee emp1;//
		emp1=new  Employee();//this will allocate memory on heap and memory ref wil
		//return in ref variable emp1
		
		emp1.display();//
		//emp1.acceptInfo(191, "Ashish", "Nagpur", 50000);
		emp1.display();//
		
		Employee emp2=new Employee();
		//
		emp2.display();
		emp2.acceptInfo(202, "Sahil", "Pune", 30000);
	}

}
