package tester;

import code.Student;

public class TestStudArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr=new int [5];
		//arr[0]=10;arr[1]=30;arr[2]=50
		
		Student[] students=new Student[5];
		Student s1=new Student(11, "Ram 1", "Pune");
		students[0]=s1;
		Student s2=new Student(12, "Ram 2", "Pune");
		students[1]=s2;
		
		Student s3=new Student(13, "Ram 3", "Pune");
		students[2]=s3;
		
		Student s4=new Student(14, "Ram 4", "Pune");
		students[3]=s4;
		
		Student s5=new Student(15, "Ram 5", "Pune");
		students[4]=s5;
		
		
		for(Student s:students)
		{
			s.display();
		}
		
		
	}

}
