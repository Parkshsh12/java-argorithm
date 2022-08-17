package ch02;

import java.util.Scanner;

public class Practice02_1 {

	public static void main(String[] args) {
		int[] arr = new int[5];
		int sum = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
			sum += arr[i];
		}
		System.out.println(sum);
	}

}
