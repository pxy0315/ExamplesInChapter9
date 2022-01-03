package sample;

public class TotalArea {

	public static void main(String[] args) {
		// Declare circleArray
		CirclePr[] circleArray;
		
		//Create circleArray
		circleArray= createCircleArray();
		
		//print circleArray and total areas of the circles
		printCircleArray(circleArray);
	}
	/**Create an array  of Circle objects*/
	public static CirclePr[] createCircleArray() {
		CirclePr[] circleArray = new CirclePr[5];
		
		for (int i=0;i<circleArray.length;i++) {
			circleArray[i]=new CirclePr(Math.random()*100);
		}
		//Return circleArry
		return circleArray;
	}
	/**Print an array of circles and their total area*/
	public static void printCircleArray(CirclePr[] circleArray) {
		System.out.printf("%-30s%-15s\n","Radius","Area");
		for (int i=0;i<circleArray.length;i++) {
			System.out.printf("%-30f%-15f\n",circleArray[i].getRadius(),circleArray[i].getArea());
		}
		System.out.println("______________________________");
		//Compute and display the results
		System.out.printf("%-30s%-15f\n","The total areas of circles is ",
				sum(circleArray));
	}
	/**add circle areas*/
	public static double sum(CirclePr[] circleArray) {
		//Initialize sum
		double sum=0;
		
		//Add areas to sum
		for (int i=0;i<circleArray.length;i++) {
			sum+=circleArray[i].getArea();
		}
		return sum;
	}

}
