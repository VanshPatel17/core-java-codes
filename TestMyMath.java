
public class TestMyMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //client
		
		MyMath m=new MyMath();
		m.add(10, 10);
		m.add(10, 10, 10);
		m.add(12.34, 23.33);
		System.out.println();
		
		int a=10,b=20,c=30;
		m.sum();//
		m.sum(a);
		m.sum(a,b);
		m.sum(a,a,a,a,b,b,b,b,b,c,c,c,c,c,c,c,c);
		
		
	}

}
