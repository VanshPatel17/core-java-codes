package com.gen;

import com.wrapper.Date;

public class TestGenralClass {

	public static void main(String[] args) {
		int a = 10;
		Integer iObj = a;//
		MyGenralClass obj1 = new MyGenralClass(a);// AutoBoxing

		int b = (int) obj1.getVar1();
		System.out.println(b);
		
		//Date s=(Date)obj1.getVar1();//This is not Type safe
		//at runtime will get ClassCastException
		
		//Solution:Generic
		//Improve performance of application
		//Type Safty at the time compilation
		
		//testGenClass
		
		//All Generic Type works only on Object Type
		
		MyGenClass<Integer> intObj1=new MyGenClass<Integer>(a);
		
	//String i=(String)intObj1.getVar1();//Type Safty
		int i=intObj1.getVar1();//Type Safty
		System.out.println(i);
		
		
		MyGenClass<String> strObj1=new  MyGenClass<String>("SEED");
		
		String str=strObj1.getVar1();
		System.out.println(str);
		
		MyGenClass<Date> dateObj=new MyGenClass<Date>(new Date());
		Date d1=dateObj.getVar1();
		
		System.out.println(d1);
		
		int x=10,y=20;
		double d3=12.23,d2=345.67;
		String ss1="SEED ",ss2=" Infotech";
		
		
		MyGenClass<Integer> intSwap=new MyGenClass<Integer>(1);
		
		intSwap.swap(x, y);
		
		MyGenClass<String> strSwap=new MyGenClass<String>("S");
		strSwap.swap(ss1, ss2);
		
		
		
		
		

	}

}
