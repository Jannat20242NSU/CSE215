import java.util.Scanner;

public class PolygonAreaMethod {

	public static void main(String[] args) {
		System.out.println("Enter no of side: ");
		Scanner input = new Scanner(System.in);
		int i = input.nextInt();
		System.out.println("Enter side: ");
		double s = input.nextDouble();
		
		System.out.println("The area of the pentagon is " +area(i,s));
		
		input.close();
	}
	
	public static double area(int n, double side) {
		
		double x = Math.toRadians(180/n);
		double area  = (n * side * side) / (4 * (Math.tan(x)));
		return area;
	}

}
