package module6._1recursion;

/*
 * Exercise: Use the debugger to examine how this recursive method works.
 * Add examples for the factorial of 4 and the factorial of 1.
 */
public class E01FactorialTest {

	public static int factorial(int n) {
		if(n == 0) { //base case (some known value)
			return 1;
		} else { //recursive case 
			return n * factorial(n - 1); //repetition 
		}
	}

	// inverse while loop 
	public static int factorialLoop (int n){
		int result = 1; 
		while(n != 0){
			result = result * n; 
			n--; 
		}
		return result; 
	}

	//4! = 4 * 3 * 2 * 1 = 24 --> 3! = 3*2*1 could also write as 4*3! = 24
	//n! = n * (n-1)! 

	//substitution method 
	// factorial(4) = 4 * factorial (3) = 4*6 = 24  
	// factorial (3) = 3 * factorial (2) = 3* 2 = 6
	// factorial (2) = 2 * factorial (1) = 2 *1 =2
	// factorial (1) = 1* factorial (0) = 1*1=1 
	// factorial (0) = 1 
// flip the order lol 
	// factorial(4) =  4*6 = 24  
	// factorial (3) = 3* 2 = 6
	// factorial (2) = 2 *1 =2
	// factorial (1) = 1*1=1 
	// factorial (0) = 1 
 	
	public static void main(String[] args) {
		System.out.println(factorialLoop(4));
	}
}

