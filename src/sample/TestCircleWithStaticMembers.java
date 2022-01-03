package sample;

public class TestCircleWithStaticMembers {

	public static void main(String[] args) {
		System.out.println("Before creating objects");
		System.out.println("The number of circle objects is "+CircleSt.numberOfObjects);
		
		//Creat c1
		CircleSt c1=new CircleSt();//Using the CircleSt class
		
		//Display c1 BEFORE c2 is created
		System.out.println("\nAfter creating c1");
		System.out.println("c1:radius (" + c1.radius + ") and number of Circle objects (" + c1.numberOfObjects + ")");
		
		//Create c2
		CircleSt c2=new CircleSt(5);
		
		//Modify c1
		c1.radius=9;
		
		//Display c1 and c2 AFTER c2 was created
		System.out.println("\nAfter creating c2 and modifing c1");
		System.out.println("c1:radius (" + c1.radius + ") and number of Circle objects (" + c1.numberOfObjects + ")");
		System.out.println("c2:radius (" + c2.radius + ") and number of Circle objects (" + c2.numberOfObjects + ")");

	}

}
