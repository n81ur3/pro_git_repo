public class Hello {

	public static void main(String[] args) {
		String name = "Helmut";
		String last_name = "Bierbaumer";
		System.out.println("Hello Git");
		System.out.println("Calculation 2 + 3: " + (2+3));
		System.out.println("Modulo Operation 3243%7: " + (3243%7));
		System.out.printf("Created by %s %s \n", name, last_name);
		printPower(2, 8);
	}

	private static void printPower(int base, int exp) {
		int result = 1;

		for (int i = 0; i < exp; i++) {
			result *= base;
		}
		
		System.out.println("####################################");
		System.out.println(base + " to the power of " + exp + " equals " + result);
		System.out.println("####################################");
	}
}
