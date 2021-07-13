import java.util.Scanner;

public class SumDigitsUsingMethod {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer number: ");
		long num = input.nextInt();
		
		System.out.println("Sum of the digits is "+ sumDigits(num));
		
		input.close();

	}
	
	public static int sumDigits(long n){
		int sum = 0, rem;
		
		while(n!=0) {
			rem = (int) (n % 10);
			sum += rem;
			n = n / 10;
		}
		
		return sum;
	}

}
