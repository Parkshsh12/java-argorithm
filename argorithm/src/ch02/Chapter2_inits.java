package ch02;

public class Chapter2_inits {

	public static void main(String[] args) {
		final int ARRAY_LENGTH = 1;
		String[] strings = new String[ARRAY_LENGTH];
		byte[] bytes = new byte[ARRAY_LENGTH];
		short[] shorts = new short[ARRAY_LENGTH];
		int[] ints = new int[ARRAY_LENGTH];
		float[] floats = new float[ARRAY_LENGTH];
		long[] longs = new long[ARRAY_LENGTH];
		double[] doubles = new double[ARRAY_LENGTH];
		boolean[] booleans = new boolean[ARRAY_LENGTH];
		
		System.out.println("참조 타입의 초깃값 : " + strings[0]);
		System.out.println("참조 타입의 초깃값 : " + bytes[0]);
		System.out.println("참조 타입의 초깃값 : " + shorts[0]);
		System.out.println("참조 타입의 초깃값 : " + ints[0]);
		System.out.println("참조 타입의 초깃값 : " + floats[0]);
		System.out.println("참조 타입의 초깃값 : " + longs[0]);
		System.out.println("참조 타입의 초깃값 : " + doubles[0]);
		System.out.println("참조 타입의 초깃값 : " + booleans[0]);
	}

}
