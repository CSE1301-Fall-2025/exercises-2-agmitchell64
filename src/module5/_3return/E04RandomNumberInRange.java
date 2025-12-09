package module5._3return;

/*
 * Exercise: Write a method randomNumberInRange() that takes in two
 * integer parameters, min and max, and returns a random integer value
 * from within that range (inclusive). Test your method by calling it
 * from the main method.
 */
public class E04RandomNumberInRange {
	//add your method here
	public static int randomNumberInRange(int min, int max){
		// Math.random() gives [0.0, 1.0)
        // Multiplying by (max - min + 1) gives [0.0, range)
        // Casting to (int) truncates the decimal, giving [0, range - 1]
        // Adding min shifts the range to [min, max]
        return (int)(Math.random() * (max - min + 1)) + min;
	}

	public static void main(String args[]) {
		//test your method by calling it
		System.out.println(randomNumberInRange(2, 1000));
	}
}
