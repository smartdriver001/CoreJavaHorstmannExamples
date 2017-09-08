package c01examples;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int number = Integer.parseInt(sc.nextLine());
		sc.close();
		System.out.println(floorMod(number, 360));
		System.out.println(Math.floorMod(number, 360));
	}
	
	public static int floorMod(int a, int b) {
		return (a % b + b) % b; 		
	}
}
