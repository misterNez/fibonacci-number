/* Created by: Nick Nesbit
 * Fibonacci Number Calculator (standard)
 * Date: 3/15/2017
*/

import java.math.*;

public class NoMemo {

    //Start of program
    public static void main(String[] args) {
	//Store integer argument into the variable term
	int term = Integer.parseInt(args[0]);

	//Time, compute and display the result with the function fib
	long start = System.currentTimeMillis();
	System.out.println(fib(term));
	long stop = System.currentTimeMillis();

	//Create variable to hold time
	long time = (stop - start);

	//Display time
	System.out.printf("Time: %d milliseconds\n", time);

    }
    
    //fib functin definition
    public static BigInteger fib(int num) {
	//Return num if num is 0 or 1
	if (num == 0 || num == 1)
	    return BigInteger.valueOf(num);
    
	//Else use recursion to compute; return the result
	BigInteger f1 = fib(num - 1);
	BigInteger f2 = fib(num - 2);
	return f1.add(f2);
    }
}
