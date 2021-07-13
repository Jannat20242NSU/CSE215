import java.util.Scanner;

public class NbyNMatrixMethod {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter for n: ");
		int x = input.nextInt();
		
		printMatrix(x);
		
		input.close();
	}
	
	public static void printMatrix(int n) {
		int rand = (int)(Math.random()*(1 - 0 + 1) + 0);
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n; j++) {
				System.out.print(rand+ " ");
			}
			System.out.println();
		}
	}
}
