package app.tester;

public class TestString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="seed";//values will get stored string pool
		
		System.out.println(s1 +"    "+s1.hashCode());
		
		String s2="seed";
		System.out.println(s2 +"    "+s2.hashCode());
		System.out.println("-----------------------------");
		s1="Seed Infotech";
		System.out.println(s1 +"    "+s1.hashCode());
		System.out.println(s2 +"    "+s2.hashCode());
		
		
		for(int i=1;i<=10;i++)
		{
			s1=s1.concat("* ");
		}
		
		
		
	}

}
