package ch02;

public class Practice02_3 {

	public static void main(String[] args) {
		int[] arr = {1, 3, 2};
		int[] arr2 = {2, 3, 1};

	    boolean isDuplicate = false;
	    for (int i = 0 ; i < arr.length; i++) {
	    	for (int j = 0; j < arr2.length; j++) {
	    		if (arr[i] == arr2[j]) {
	    			isDuplicate = true;
	    			break;
	    		}
	    	}

	    	if (!isDuplicate) {
	    		System.out.println("두 배열은 다른 배열입니다.");
	    		break;
	    	} else if (i + 1 == arr.length) {
	    		System.out.println("두 배열은 같은 배열입니다.");
	    	}
	    }
	}

}
