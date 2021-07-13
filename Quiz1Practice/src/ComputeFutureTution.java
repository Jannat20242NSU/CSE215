
public class ComputeFutureTution {

	public static void main(String[] args) {
		double tution = 10000,total = 0;
		double rate = 0.05;
		
		for(int i = 1; i <= 14; i++) {
			tution = tution + tution * rate;
			
			if(i == 10)
				System.out.printf("Tution in ten years is %.2f",tution);
			if(i == 11 || i == 12 || i == 13 || i == 14) {
				total += tution;
			}
		}	
		
		System.out.printf("\nThe total cost of four years’ worth of tuition after the tenth year is %.2f",total);

	}

}
