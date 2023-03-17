
public class TestStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student std1 = new Student(101, "Ram", 80);

		std1.display();
		Student std2 = new Student(202, "Seeta", 50);
		std2.display();
		Student std3 = new Student(303, "Geeta", 55);

		std3.display();
//		
//		//static methods get called by class name
 		Student.setIntituteName("IACSD");
//		
 		std1.setName("Ramesh");
 		std1.display();//
 		
 		std2.display();

	}

}
