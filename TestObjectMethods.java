package tester;

import code.Student;

public class TestObjectMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Student s1=new Student(101, "Ram", "Pune", 69.90);
		System.out.println("s1 :"+s1.hashCode() +"    "+s1 );
		
		Student s2=new Student(145601, "Ram4564", "Pune", 49.90);
		System.out.println("s2 :"+s2.hashCode() +"    "+s2 );
		
		if(s1==s2)
			System.out.println("same ");
		else
			System.out.println("not same");
		
		System.out.println("---------------------------------");
		
		Student s3=s1;
		System.out.println("s3 :"+s3.hashCode() +"    "+s3 );
		
		if(s1==s3)
			System.out.println("same ");
		else
			System.out.println("not same");
		
		
		System.out.println("---------------------------------");
		
		if(s1.equals(s2))//Object obj=s2; Upcasting
		{
			System.out.println(" equal");
		}
		else
			System.out.println("not equal");
		
		
		String str="SEED";
		
		if(s1.equals(str))//Object obj=str
		{
			
		}
		
		 
		
		
		
		
		
		
		
		
		
	}

}
