package exam;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Practical1 {

	public static void main(String[] args) {

		Random rand = new Random();
		int[] array = new int[500];
		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(1000);
		//	 System.out.println(array[i]);
		}
		Arrays.sort(array);
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Nth smallest number: ");
		int number = scan.nextInt();
		System.out.println("The " + number + "th smallest number is: " + array[number - 1]);
	}

}
