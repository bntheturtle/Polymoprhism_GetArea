package polymorphismGetArea;

public class Circle extends Shape {

	protected int r ;
	
	
	public Circle ( int r) {
		this.r = r ;
	}

	
	
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		System.out.println("The shape's area will be now calculated... "); 
		double circleArea = Math.PI * (r*r) ; 
		System.out.println("The shape's area is : "  +  circleArea );
		return circleArea;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		
		return null;
	}
}
