package work.laptop.hp;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		System.out.println("Enter a number to split even and odd numbers till ");
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int limit = scan.nextInt();	
		for( int i=1; i<=limit; i++){
			if( i % 2 == 0){
				System.out.println(i + " is a Even number");
			}else{
				System.out.println(i + " is a Odd number");
			}
		}
		
	}
}
