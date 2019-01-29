package interfaces_testing;

public class Circle implements Area {
	
	//instance variable
	double radius;
	
	//constructors multiple
	public Circle(double radius_in) {
		radius=radius_in;
	}

	public Circle() {
		radius=1.0;
	}
	
	//object methods
	public double getArea() {
		return Math.PI*radius*radius;
	}
	

	
}
