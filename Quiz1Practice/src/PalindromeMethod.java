import java.util.Scanner;

public class PalindromeMethod {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer number: ");
		int number = input.nextInt();
	
		if(isPalindrome(number))
			System.out.println(number+" is palindrome.");
		else
			System.out.println(number+" is not palindrome.");
	
		input.close();
	}

	public static int reverse(int number) {
		int rev = 0, rem;
	
		while(number != 0) {
			rem = number % 10;
			rev =rev * 10 + rem;
			number = number / 10;
		}
	
		return rev;
	}

	public static boolean isPalindrome(int number) {
	
		if(reverse(number) == number)
			return true;
		else 
			return false;
	
	}

}
