public class CheckPrime {

	public static void main(String[] args) {

		int input = 13;
		int count = 0;
		for (int i = 2; i < input / 2; i++) {
			if (input % i == 0) {
				count++;
			}
		}
		if (count == 0) {
			System.out.println("Prime number");
		} else {
			System.out.println("Not a prime number");
		}

	}

}
