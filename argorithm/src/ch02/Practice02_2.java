package ch02;

public class Practice02_2 {

	public static void main(String[] args) {
		int[] arr = {10, 11, 2, 5, 3, 3, 24, 15, 6, 9};
		
		int max = arr[0];
		int min = arr[0];
		
		for(int i = 0; i < arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
			else if(min > arr[i]) {
				min = arr[i];
			}
		}
		
		System.out.println("최댓값 : "+ max + ", " + "최솟값 : " + min);
	}

}
