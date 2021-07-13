import java.util.Scanner;

public class MyTriangle {

	public static void main(String[] args) {
		System.out.println("Enter three sides: ");
		Scanner input = new Scanner(System.in);
		double n1 = input.nextDouble();
		double n2 = input.nextDouble();
		double n3 = input.nextDouble();
		
		if(isValid(n1,n2,n3))
			System.out.println("Area is " +area(n1,n2,n3));
		else
			System.out.println("Input is invalid");
		
		input.close();
			
	}
	
	public static boolean isValid(double side1, double side2, double side3) {
		if(side1+side2>side3 && side1+side3>side2 && side2+side3>side1)
			return true;
		else
			return false;
	}
	
	public static double area(double side1, double side2, double side3) {
		double s = (side1 + side2 + side3) / 2;
		double cal = s * (s - side1) * (s - side2) * (s - side3);
		double area = Math.sqrt(cal);
		
		return area;
	}

}
