package com.gen;

public class MyGenClass<T > {
	
	
	private T var1;

	public MyGenClass(T var1) {
	 
		this.var1 = var1;
	}

	public T getVar1() {
		return var1;
	}

	public void setVar1(T var1) {
		this.var1 = var1;
	}
	
	public   void swap(T a,T b)
	{
	T temp;
	temp=a;
	a=b;
	b=temp;
	System.out.println("Swap Values  a="+a+"    b="+b);
	}
	
	
	
	

}
