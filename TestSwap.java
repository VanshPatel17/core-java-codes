
public class TestSwap {

	public static void swap(int  a,int b)
	{
		//System.out.println("---inside swap---" );
		int temp=a;
		a=b;
		b=temp;
		System.out.println("---inside swap---a="+a+"   b="+b );//20 10
	}
	
	
	public static void main(String[] args) {


		int a=10,b=20;;
		System.out.println("---b4 swap---a="+a+"   b="+b );//10 20
		
		swap( a, b);
		
		System.out.println("---after swap---a="+a+"   b="+b );//10 20
		

	}

}
