package code;

public class TestShape {

	public static void displayArea(Shape obj) {
		
		obj.area();
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Shape s;//=new Shape();		
		Circle c=new Circle();
		c.area();
		Rectangle rect=new Rectangle();
		rect.area();		
		displayArea(c);
		displayArea(rect);
		
	}

}
