import java.util.Scanner;
public class HelloCalender {
	public static void main(String[] args) {
		
		// 1, 3, 5, 7, 8, 10, 12월(~31일)
		// 2월(~29일)
		// 4, 6, 9, 11(~30일)
		int[] ThirtyDays ={4, 6, 9 ,11};		
		int[] ThirtyOneDays = {1, 3, 5, 7, 8, 10, 12};
		int[] TwentyNineDay = {2};
		
		// calender
		System.out.println(" 일   월    화    수   목    금    토");
		System.out.println("--------------------");
		System.out.println(" 1  2  3  4  5  6  7");
		System.out.println(" 8  9 10 11 12 13 14");
		System.out.println("15 16 17 18 19 20 21");
		System.out.println("22 23 24 25 26 27 28");
		
		
		// 숫자를 입력받아 해당하는 달의 최대 일수를 출력하는 프로그램
		System.out.println("달을 입력하세요. : ");
		int a;
		Scanner scanner = new Scanner(System.in); 
		
		String s1;
		s1 = scanner.next();
		//System.out.println(s1);
		a = Integer.parseInt(s1);
		
		for(int i = 1; i <= 1; i++) {
			if (a == ThirtyDays[i]) {
				System.out.printf("%s는 30일까지 있습니다.", a);
		} else if (a == ThirtyOneDays[i]) {
			System.out.printf("%d는 31일까지 있습니다.", a);
		} else if (a == TwentyNineDay[i]){
			System.out.printf("%d는 29일까지 있습니다.", a);			
		}
	}
	scanner.close();	
	}
}

