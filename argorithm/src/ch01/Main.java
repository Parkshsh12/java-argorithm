package ch01;

public class Main {

	public static void main(String[] args) {
		int data1 = 3;
		int data2 = 1;
		int data3 = 9;
		int data4 = 5;
		int data5 = 10;
		
		int min = data1;
		
		if(min > data2) {
			min = data2;
		}
		
		if(min > data3) {
			min = data3;
		}
		
		if(min > data4) {
			min = data4;
		}
		
		if(min > data5) {
			min = data5;
		}
		
		System.out.println("최솟값 : " + min);
	}

}
