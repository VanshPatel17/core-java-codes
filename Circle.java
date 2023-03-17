package code;

import contract.IPrintable;

public class Circle extends Shape implements IPrintable{

	@Override
	public void area() {
		// TODO Auto-generated method stub
		System.out.println("-----calculating circle area----");
	}

	@Override
	public void print() {

System.out.println("print method implemented in Circle class");
		
	}
	

}
