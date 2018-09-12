package Circle;

import java.util.Scanner;

/*
 * Zachary Moncur
 * 9/12
 */
public class area_circle {

	public static void main(String[] args) {
		//Calculate area of a circle
		// Enter the radius of a circle
		//Compute the area - pi x radius^2
		// Display result
		//Assign values
		
		System.out.println("Enter radius");
		Scanner input = new Scanner(System.in);
		
		//Constants
		double PI = 3.141592653589793238462643383279502884197169399375105820974944592307816406;
		//Variables
		double radius;
		double area;
		
		radius = input.nextDouble();
		area = radius*radius*PI;
		
		System.out.println("the area of your circle is: " + area +"\"");
		

	}

}
