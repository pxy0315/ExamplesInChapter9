package sample;

public class TestPassObject {

	public static void main(String[] args) {
		// Create a Circle object with radius 1
		CirclePr myCircle=new CirclePr(1);//Use the Circle class in CirclePr
		
		//print areas for radius 1,2,3,4,5
		int n=5;
		printAreas(myCircle,n);
		
		//See myCircle.radius and times
		System.out.println("\n"+"Radius is "+myCircle.getRadius());
		System.out.println("n is "+n);
	}
	public static void printAreas(CirclePr c,int times) {
		System.out.println("Radius \t\tArea");
		while(times>=1) {
			System.out.println(c.getRadius()+"\t\t"+c.getArea());
			c.setRadius(c.getRadius()+1);
			times--;
		}
	}

}
