package app.code;

public class BankAccount {

	private int actid;
	private String name;
	private double balanace;
	private  Locker locker;
	
	public BankAccount(int actid, String name, double balanace) {
		super();
		this.actid = actid;
		this.name = name;
		this.balanace = balanace;
	}
	@Override
	public String toString() {
		if(this.locker!=null)
		{
		return "BankAccount [actid=" + actid + ", name=" + name + ", balanace=" + balanace +  "Locker Assigned:  "+locker;
		}else
		{
			return "BankAccount [actid=" + actid + ", name=" + name + ", balanace=" + balanace + "\n  No Locker Assigned]";
			
		}
	}
	
	//write setter for Locker
	public void setLocker(int duration)
	{
		this.locker=new Locker(duration);
	}
	//class as data member
	//Locker is inner class
	//BankAccount is outer class
	private class Locker{
		private int duration;
		private int rate;
		private double charges;
		
		public Locker(int duration)
		{
			this.duration=duration;
			rate=10000;
		}

		@Override
		public String toString() {
			return "\n Locker for ActID:"+actid  +"   "+"charges=" +(rate*duration) ;
		}
		
		
	}
	
	
	
	
	public void test( ) {
		//local 
		int a=10;
		
		class  MethodInnerClass
		{
			final int p=10;
			public void show()
			{
				System.out.println("this is in method inner class----");
			}
		}
		
		//
		MethodInnerClass mis=new MethodInnerClass();
		mis.show();
		
		
	}
	
	
	
	
	
	
	

}
