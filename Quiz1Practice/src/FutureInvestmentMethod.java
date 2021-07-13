import java.util.Scanner;

public class FutureInvestmentMethod {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter investment amount: ");
		double amnt = input.nextDouble();
		System.out.print("Enter interest rate: ");
		double rate = input.nextDouble();
		double Mrate = rate / 1200.0;
		
		System.out.println("Years  future value: ");
		for(int i = 1; i <= 30; i++) {
			System.out.printf(" %d\t%.2f",i, futureInvestmentValue(amnt,Mrate,i));
			System.out.println("");
		}
		
		input.close();

	}
	
	public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years) {
		return investmentAmount * Math.pow((1 + monthlyInterestRate), years * 12);
	}

}
