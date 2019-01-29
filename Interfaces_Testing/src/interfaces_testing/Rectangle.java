package interfaces_testing;

public class Rectangle implements Area {
	
	//instance variable
	double length, width;
	
	//constructors multiple
	public Rectangle(double length_in, double width_in) {
		length=length_in;
		width=width_in;
	}

	public Rectangle() {
		length=1.0;
		width=1.0;
	}
	
	//object methods
	public double getArea() {
		return length*width;
	}
	

	
}
