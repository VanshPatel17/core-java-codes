package pkg1;
//public :accessible everywhere
public class A {
	
	private int pr1,pr2;//inside class only
	
	int def1,def2;//default:accessible anywhere in package ,outside package not accessible
	
	protected int pro1,pro2;//protected:accessible anywhere in package ,
	//outside package accessible only with in sub class
		
	public int pub1,pub2;//public:everywhere
	
	
	

}
