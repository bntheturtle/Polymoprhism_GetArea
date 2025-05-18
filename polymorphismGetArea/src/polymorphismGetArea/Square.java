package polymorphismGetArea;

public class Square extends Shape  {

	protected int a ;
	
	public Square ( int a) {
		this.a = a ;
	}
	
	
	
	@Override
	public double getArea() {
		System.out.println("The shape's area will be now calculated... "); 
		double squareArea = a*a ; 
		System.out.println("The shape's area is : "  +  squareArea );
		return squareArea;
		// TODO Auto-generated method stub
		
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null  ;
	}

	
	
}

