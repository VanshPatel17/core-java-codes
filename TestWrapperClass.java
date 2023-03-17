package com.wrapper;

public class TestWrapperClass {

	public static Object display(Object obj)
	{
		System.out.println(obj.toString());
		return obj;
	}
	
	public static void main(String[] args) {
		
		Employee emp=new  Employee();
		
		Date d=new Date();
		
		display(emp);;//Object obj=emp;Base cls can hold ref of derived class
		//upcasting
		display(d);//upcasting
		
		String str="SEED";
		display(str);//upcasting
		
		int a=10;
		//to convert premitive type(value data type)
		//into reference type Wrapper classes are Used
		
		//for int premitive type Integer wrapper class is used
		
		Integer intObj=new Integer(a);//Boxing 
		
		System.out.println(intObj);
		
		display(intObj);//upcasting
		
		int b1=intObj.intValue();//unBoxing
		
		//java 5 onwards  AutoBoxing and AutoUnBoxing given
		
		Integer intObj2=a;//AutoBoxing
		
		int c=intObj2;//AutoUnBoxing
		display(a);//AutoBoxing  object=int

		
		int x=(int)display(20);
		
		
	}

}
