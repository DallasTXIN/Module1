import java.util.Scanner;

public class Lottery {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int lottery = (int)(Math.random() * 1000);
		System.out.print("Enter a three-digit number: ");
		int guess = input.nextInt();
		int lotteryDigit1 = lottery / 100;
		int remainingDigits = lottery % 100;
		int lotteryDigit2 = remainingDigits / 10;
		int lotteryDigit3 = remainingDigits % 10;
		int guessDigit1 = guess / 100;
		int remainingDigits = guess % 100;
		int guessDigit2 = remainingDigits / 10;
		int guessDigit3 = remainingDigits % 10;
		System.out.println("The lottery number is " + lottery);
		if (guess == lottery)
			System.out.println("Exact match: you win $10,000");
		if (guessDigit1 == lotteryDigit2)
		{

		}
	}
}