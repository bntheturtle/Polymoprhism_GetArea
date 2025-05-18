package polymorphismGetArea;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Circle circle1 = new Circle ( 4 );
		Square square1 = new Square ( 6);
		Triangle triangle1 = new Triangle ( 6,  12);
		
		
		Shape [] shapes  = {circle1, square1, triangle1} ; 
		
		try {
			for( Shape areaCalculator : shapes ) {
				 // shapes.getArea();
				areaCalculator.getArea();
			}
			
		} catch (Exception e) {
			System.out.println(" An error occured...");
			
		} 
		
		
	}

}
