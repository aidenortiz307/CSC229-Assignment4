
package org.example;

/**
 *
 * @author MoaathAlrajab
 */
public class Problem01 {
    
    public static long getSumOfPrimes(int n){
    // Todo 04: Develop a method that returns the sum of the prime numbers between 1 and n
    //          Test your solution
    //          Analyze its space and time  
        long sum = 0;
        for (long number = 2; number <= n; number++) {
            boolean isPrime = true;
            for (long divisor = 2; divisor < number; divisor++) {
                if (number % divisor == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                sum = sum + number;
            }
        }
        return sum;
    
    }
    
    public static void main(String[] args) {
        System.out.println(getSumOfPrimes(10));
        System.out.println(getSumOfPrimes(11));
        System.out.println(getSumOfPrimes(1));
    }
}
