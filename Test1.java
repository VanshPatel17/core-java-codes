package com.code;

import java.io.File;
import java.io.FileInputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {

		try {
	      FileInputStream fin=new FileInputStream("result.txt");
			
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No1 No2=");
		int a, b, c;
		int[] arr=new int[2];
		//arr[2]=3;
		a = sc.nextInt();
		b = sc.nextInt();
		MyMath.div(a, b);
		
//		c=a/b;
//		System.out.println("----Div----"+c);
		System.out.println("---write data into file---");
		System.out.println("---close file----");
		fin.close();
		System.out.println("----end main----");
		}
//		catch(ArithmeticException ax)
//		{
//			System.err.println(ax.getMessage());
//		}
//		catch(InputMismatchException ix )
//		{
//			System.err.println(ix.getMessage());
//		}
		catch( Exception ex)
		{
			System.err.println(ex.getMessage());
			ex.printStackTrace();
		}
		finally
		{
			System.out.println("finally block---close file---");
		}

	}

}
