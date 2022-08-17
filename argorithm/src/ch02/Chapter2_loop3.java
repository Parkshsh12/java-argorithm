package ch02;

import java.util.Random;

public class Chapter2_loop3 {

	public static void main(String[] args) {
		Random random = new Random();
		final int ARRAY_LENGTH = 100;
		
		int[] arr = new int[ARRAY_LENGTH];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = random.nextInt(ARRAY_LENGTH);
		}
		
		int max = arr[0];
		int min = arr[0];
		for(int k : arr) {
			if(max < k) {
				max = k;
			} else if(min > k) {
				min = k;
			}
		}
		
		System.out.println("최댓값: " + max);
		System.out.println("최솟값: " + min);
	}

}
