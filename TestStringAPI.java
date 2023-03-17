package com.tester;

public class TestStringAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 20;
		System.out.println(a);
		String s1 = "seed";
		System.out.println(s1+"    "+s1.hashCode());

		String s2 = "seed";
		System.out.println(s2);

		System.out.println(s1.toUpperCase());
		System.out.println(s1.contains("@"));
		System.out.println(s1.indexOf("e"));
		System.out.println(s1.lastIndexOf("e"));

		s1 = s1.concat(" Infotech");
		System.out.println(s1+"    "+s1.hashCode());

		
		//
		StringBuffer sb1=new StringBuffer("Seed");
		
		StringBuffer sb2=new StringBuffer("Seed");
		
		
		System.out.println(sb1+"    "+sb1.hashCode());

		System.out.println(sb2+"    "+sb2.hashCode());

		sb1=sb1.append("  pune");
		System.out.println(sb1+"    "+sb1.hashCode());

		
		StringBuilder sbb1=new StringBuilder("Welcome");
		
	      char[] chrs=s1.toCharArray();
		for(int i=0;i<chrs.length;i++)
		{
			System.out.print ((int)chrs[i] +"   ");
		}
		
		System.out.println();
		int a1=65;
		System.out.println(a1);
		System.out.println((char)a1);

	}

}
