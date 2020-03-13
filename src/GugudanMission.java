import java.util.Scanner;
public class GugudanMission {
	public static void main(String[] args) {
		System.out.println("원하는 oo단의 숫자를 입력하세요 : " );
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
				
		for(int i = 0; i < 9; i++) {
			System.out.println(number * (i + 1));
		}
	}
}
