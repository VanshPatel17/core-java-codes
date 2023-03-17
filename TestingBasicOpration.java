import java.util.Scanner;

public class TestingBasicOpration {

	public static void main(String[] args) {

		System.out.println("welcome To Java");
		System.out.println("enter no1");
		int a,b,c;
		//read numbers from user/keyboard
		//Scanner class is used
		//Scanner class is in package java.util
		//import java.util
		
		Scanner sc=new  Scanner(System.in);//syntax
		a=sc.nextInt();//used to read int value from user
		
		System.out.println("enter no2");
		b=sc.nextInt();
		
		c=a+b;
		System.out.println(c);		
		System.out.println("Addition="+c);
		System.out.println("Sum  of "+a+"+"+b+"="+c);
		
		
		
		
	}

}
