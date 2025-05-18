package polymorphismGetArea;

public class Triangle  extends Shape {
	
	protected int b; 
	protected int h;
	
	public Triangle ( int b, int h) {
		this.b = b ;
		this.h = h ;
	}
	


	@Override
	public double getArea( ) {
		// TODO Auto-generated method stub
		System.out.println("The shape's area will be now calculated... "); 
		int triangleArea = (b * h) / 2;
		System.out.println("The shape's area is : "  +  triangleArea );
		return triangleArea;
		
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
