package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TestArray {

	public static void main(String[] args) {


		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Size:");
		int size=sc.nextInt();//
		
		int[] arr=new int[size];//5
		
		System.out.println("Size:"+arr.length);
		
		for(int i=0;i<arr.length;i++)
		{
		arr[i]=sc.nextInt();	
		}
		//arr[5]=90;array size is Fix
		
		for(int i:arr)
		{
		System.out.print (i+" ");	
		}
		
		
		System.out.println("\n-----------sort------");
		
		Arrays.sort(arr);
		for(int i:arr)
		{
		System.out.print (i+" ");	
		}
		
		 
		
		
	}

}
