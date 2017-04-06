package work.laptop.hp;

import java.util.Scanner;

public class PrimeNumberPrinting {

	public static void main(String[] args) {
		System.out.println("please enter a number to print prime numbers to a limit");
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int limit = scan.nextInt();
		System.out.println("print prime numbers 1 to : " + limit);
		
		for(int number=2; number<= limit; number++){
			if(isPrimeNumber(number)){
				System.out.println(number);
			}
		}
	}
	    /*
	     * Prime number is not divisible by any number other than 1 and itself
	     * @return true if number is prime
	     */

	private static boolean isPrimeNumber(int num) {
		for(int j = 2; j< num ; j++){
			if(num % j == 0){
				return false; // number is divisible by another number so not prime number
			}
		}
		return true; // number is not divisible so it is prime
	}
}
