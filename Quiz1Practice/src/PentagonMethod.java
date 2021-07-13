//import java.util.Scanner;

public class PentagonMethod {

	public static void main(String[] args) {
		//Scanner input = new Scanner(System.in);
		//System.out.print("Enter for n: ");
		//int n = input.nextInt();
		System.out.println("First 100 pentagonal numbers are: ");
		getPentagonalNumber(1,100);
		
		//input.close();

	}
	
	public static void getPentagonalNumber(int n1,int n2){
		int pentNum = 0, count = 0;
		
		for(int i = n1; i <= n2; i++) {
			pentNum = i * (3 * i - 1) / 2;
			System.out.println(pentNum);
			count++;
			
			if(count == 10) {
				System.out.println("");
			count = 0;
			}
		}
		
		//return pentNum;
	}

}
