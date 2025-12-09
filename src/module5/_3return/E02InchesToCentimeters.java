package module5._3return;

/*
 * Exercise: Update this code so that instead of printing
 * the centimeters value in the inchesToCentimeters() method,
 * it returns the centimeters value and prints it from the
 * main() method.
 */
public class E02InchesToCentimeters {
	public static double inchesToCentimeters(double inches) {
		double centimeters = inches * 2.54;
		return centimeters; 
	}

	public static void main(String[] args) {
		double result = inchesToCentimeters(10.0);
		System.out.println(result);

		System.out.println(inchesToCentimeters(12.5));
	}
}
