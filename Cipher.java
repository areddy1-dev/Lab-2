

	 /**  Author: Anand Kumar Reddy	        **/
	 /**  Class: Programming Foundamentals  **/
	 /**  Semester: Summer 2			    **/
	 /**  Assignment Name: Program 1		**/  

import java.util.Random;
import java.util.Scanner;

public class Cipher {
	public static void main(String[] args) {
		int number1, number2, number3, number4, number5;
		int total, NumRandom, NumEncoded;
		int firstDigit, lastDigit;
		
		Scanner sc = new Scanner(System.in);
		Random gen = new Random();
		
		System.out.println("Class: Programming Fundamentals");
		System.out.println("Name: Anand Kumar Reddy ");
		System.out.println("Assignment: Programming 1");
		System.out.println("Welcome to the Cipher Program.");
		System.out.println("Enter the 5 integers in the range of 0 to 19");
		
		number1 = sc.nextInt();
		if (number1 < 0 || number1 > 19) {
			System.out.println("Please read directions and try again!");
			System.exit(0);
		}
		System.out.println("1st number: " + number1);
		
		number2 = sc.nextInt();
		if (number2 < 0 || number2 > 19) {
			System.out.println("Please read directions and try again!");
			System.exit(0);
		}
		System.out.println("2nd number: " + number2);
		
		number3 = sc.nextInt();
		if (number3 < 0 || number3 > 19) {
			System.out.println("Please read directions and try again!");
			System.exit(0);
		}
		System.out.println("3rd number: " + number3);
		
		number4 = sc.nextInt();
		if (number4 < 0 || number4 > 19) {
			System.out.println("Please read directions and try again!");
			System.exit(0);
		}
		System.out.println("4th number: " + number4);
		
		number5 = sc.nextInt();
		if (number5 < 0 || number5 > 19) {
			System.out.println("Please read directions and try again!");
			System.exit(0);
		}
		System.out.println("5th number: " + number5);
		System.out.println();
		
		total = number1 + number2 + number3 + number4 + number5;
		System.out.println("Total = " + total);
		
		NumRandom = gen.nextInt(10);	// Random integer in range 0-9
		System.out.println("your random key for encoding is " + NumRandom);
		
		lastDigit = total % 10;
		lastDigit = (lastDigit + NumRandom) % 10;
		total = total / 10;
		firstDigit = total % 10;
		firstDigit = (firstDigit + NumRandom) % 10;
		
		
		NumEncoded = firstDigit * 10 + lastDigit;
		System.out.println("Your encoded number is " + NumEncoded);
		
		sc.close();
	}
}