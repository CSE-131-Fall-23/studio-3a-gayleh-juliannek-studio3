package studio3;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Sieve {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); 
		System.out.println("What number would you like to know all the prime numbers up to?"); 
		int n = in.nextInt(); 
		boolean[] number = new boolean[n]; 
		
		
		for (int i = 2; i < n; i++) {
			number[i] = true; 
		}
		
		System.out.println("Here are the prime number up to " + n); 
		
		for (int c = 2; c < n; c++) { 
			for (int d = 2; (d*c) < n; d++) {
				number [d*c] = false; 
				
			}
			if (number[c]) { 
				System.out.println(c); 
			}

		}
//	Arrays.fill(number, true); (same thing) 


	}
} 
