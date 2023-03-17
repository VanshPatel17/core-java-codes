import java.util.ArrayList;

public class EmpUtil {
	public static ArrayList<Employee> populateEmployee()
	{
		
		ArrayList<Employee> list=new ArrayList<Employee>();
		System.out.println("IsEmpty="+list.isEmpty());//true
		//add employee object in AL
		Employee emp1=new Employee(192, "Ritesh", "Nagar");
		
		list.add(emp1);
		
		list.add(new Employee(523, "Seeta", "Pune"));
		list.add(new Employee(223, "Geeta", "Pune"));
		list.add(new Employee(426, "Xyz", "Mumbai"));
		list.add(new Employee(573, "Zara", "Pune"));
		list.add(new Employee(23, "Aneeta", "Thane"));
		list.add(new Employee(1, "Tanu", "Xyz"));
		
		//IsEmpty=fasle
		return list;
		
		
		
	}

}
