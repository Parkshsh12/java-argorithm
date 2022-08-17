package ch02;

import java.util.Random;

public class Chapter2_loop_4 {

	public static void main(String[] args) {
		Random random = new Random();
		final int ARRAY_LENGTH = 10;
		int[] arr = new int[ARRAY_LENGTH];
		for(int i = 0; i < ARRAY_LENGTH; i++) {
			boolean isPrimeNumber = true;
			int randomValue = random.nextInt(ARRAY_LENGTH);
			
			if(randomValue == 1) {
				continue;
			}
			if(randomValue == 2) {
				arr[i] = randomValue;
				continue;
			}
			
			for(int j = 0; j < randomValue; j++) {
				if(randomValue % 2 == 0) {
					isPrimeNumber = false;
					break;
				}
			}
			
			if(isPrimeNumber) {
				arr[i] = randomValue;
			} 
		}
		System.out.println("[배열에 저장된 소수]");
		for(int k : arr) {
			System.out.println(k);
		}
	}

}
