/* Created by: Nick Nesbit
 * Fibonacci Number Calculator (memoized)
 * Date: 3/15/2017
*/

import java.math.*;

public class Memo {

    //Start of program
    public static void main(String args[]) {
	//Get argument information
	int term = Integer.parseInt(args[0]);
	//Create variable for size
	int size = (term + 1);

	//Allocate new array
	BigInteger[] memoArray = new BigInteger[Integer.valueOf(size)];

	for (int i = 0; i < size; i++) {
	    memoArray[i] = BigInteger.ZERO;
	}

	//Time, compute, and display the Fibonacci number
	long start = System.currentTimeMillis();
	System.out.println(memo_fib(memoArray, term));
	long stop = System.currentTimeMillis();

	//Create variable to hold time
	long time = (stop - start);

	//Display time
	System.out.printf("Time: %d milliseconds\n", time);

	//Delete the allocated array
	memoArray = null;
    }

    //memo_fib function defintion
    private static BigInteger memo_fib(BigInteger[] array, int num) {
	//Return 0 if num is 0
	if (num == 0)
	    return BigInteger.ZERO;
    
	//Return 1 if num is 1 or 2
	if (num == 1 || num == 2)
	    return BigInteger.ONE;
    
	//Return array[num] if known
	if (array[num] != BigInteger.ZERO)
	    return array[num];
    
	//Else return array[num] after computing it by recursion
	BigInteger f1 = memo_fib(array, num - 1);
	BigInteger f2 = memo_fib(array, num - 2);
	array[num] = f1.add(f2);
	return array[num];
    }
}
