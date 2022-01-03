package sample;

public class CircleSt {
	/**The radius of the circle*/
	double radius;
	
	/**The number of objects created*/
	static int numberOfObjects = 0;
	
	/**Construct a circle with radius 1*/
	CircleSt(){
		radius=1;
		numberOfObjects++;
	}
	/**Construct a circle with a specified radius*/
	CircleSt(double newRadius){
		radius=newRadius;
		numberOfObjects++;
	}
	/**Return number of objects*/
	static int getNumberOfObject() {
		return numberOfObjects;
	}
	/**Return the area of this circle*/
	double getArea() {
		return radius*radius*Math.PI;
	}
}
