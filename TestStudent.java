package tester;

import code.Student;

public class TestStudent {
public static void main(String[] args) throws CloneNotSupportedException {
	
	Student s1=new Student(101, "Rina", 56.78);
	System.out.println(s1.hashCode()+"     "+s1    );
	Student s2=new Student(102, "Ritu", 76.78);
	System.out.println(s2.hashCode()+"     "+s2    );
	
	Student s3=new Student(101, "Rina", 56.78);
	System.out.println(s3.hashCode()+"     "+s3    );

	Student s4=(Student) s3.clone();
	System.out.println(s4.hashCode()+"     "+s4    );

	s3.setName("Rahul");
	System.out.println("----s3 updated----");
	System.out.println(s3.hashCode()+"     "+s3    );
	System.out.println(s4.hashCode()+"     "+s4    );

	
	Student s5=(Student) s2.clone();
	System.out.println(s2.hashCode()+"     "+s2    );
	System.out.println(s5.hashCode()+"     "+s5    );

	System.out.println("----s2 updated----");
	s2.setName("New Name");
	System.out.println(s2.hashCode()+"     "+s2    );
	System.out.println(s5.hashCode()+"     "+s5    );

	
}
}
