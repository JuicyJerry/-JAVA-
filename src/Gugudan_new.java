// 배열로 구구단 구현
//public class Gugudan_new {
//	public static void main(String[] args) {
//		int[] result = new int[9];
//		for(int i = 0; i < result.length; i++) {
//			result[i] = 2 * (i + 1);
//		}
//		
//		for(int i = 0; i < result.length; i++) {
//			System.out.println(result[i]);
//		}
//		
//		// 3단
//		int[] time3  = new int[9];
//		for(int i = 0; i < time3.length; i++) {
//			time3[i] = 3 * (i + 1);
//		}
//		
//		for(int i = 0; i < time3.length; i++) {
//			System.out.println(time3[i]);
//		}
//	}
//}


//public class Gugudan_new {
//	public static void main(String[] args ) {
//		int[] result = new int[9];
//		for (int i = 0; i < result.length; i++) {
//			result[i] = 2 * (i + 1);
//		}
//		for (int i = 0; i < result.length; i++) {
//			System.out.println(result[i]);
//		}
//	}
//}


// 메소드로 구구단 구현. 함수 == 메소드
// 구현하는 method #1
public class Gugudan_new {
	public static int[] calculate(int times) {
		int[] result = new int[9];
		for (int i = 0; i < result.length; i++) {
			result[i] = times * (i + 1);
		}
		return result;
	}

	// 구현하는 method #2
	public static void print(int[] result) {
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}
	
	// 실행하는 method
//	public static void main(String[] args) {
//		for(int i = 2; i < 10; i++) {
//			int[] result = calculate(i);
//			print(result);
//			System.out.println("");
//
//		}
//		int[] times3 = calculate(3);
//		print(times3);
//		
//		int[] times4 = calculate(4);
//		print(times4);
//		
//		int[] times5 = calculate(5);
//		print(times5);
//		
	}
}



