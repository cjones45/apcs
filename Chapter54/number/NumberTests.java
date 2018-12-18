import java.util.Scanner;

public class NumberTests {

	// Check for Odious number
	public static boolean checkOdious(int num) {
		int numberOfOnes = 0;
		int numberOfZeros = 0;

		// See how many 1s and 0s in number
		while (num != 0) {
			if (num % 2 == 1) {
				numberOfOnes++;
			} else {
				numberOfZeros++;
			}
			num = num / 2;
		}

		if (numberOfOnes % 2 == 1) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean checkUnlucky(int num) {
		while (num != 0) {
			if (num == 13) {
				return true;
			} 
			num = num / 10;
		}
		return false;
	}

	public static boolean checkPerfect(int num) {
		int sumDivisors = 0;
		for (int i = 1; i < num; i++) {
			if (num % i == 0) {
				sumDivisors += i;
			}
		}

		if (sumDivisors == num) {
			return true;
		} else {
			return false;
		}
	}


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		
		System.out.println("Enter upper limit: ");
		int upperLimit = scan.nextInt();

		for (int i = 1; i <= upperLimit; i++) {
			if (checkPerfect(i)) {
				System.out.println(i + " is a perfect number.");
			}
		}
		
	}

}