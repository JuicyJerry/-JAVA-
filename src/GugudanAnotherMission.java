import java.util.Scanner;
public class GugudanAnotherMission {
		public static void main(String[] args) {
			System.out.println("원하는 단과 크기에 대한 숫자 2개를 쉼표로 구분해서 입력하세요: ");
			Scanner scanner = new Scanner(System.in);
			String inputValue = scanner.nextLine();
			String[] splitValue = inputValue.split(",");
			int first = Integer.parseInt(splitValue[0]);
			int second = Integer.parseInt(splitValue[1]);
			
			if (first < 2) {
				System.out.println("잘못된 숫자입니다.");
			} else if (second < 1) {
				System.out.println("잘못된 숫자입니다.");
			}
			
			for(int i = 2; i <= first; i++)
				for(int j = 0; j < second; j++) {
					System.out.println(i * (j + 1));
					// System.out.println("");

				
			}
	}
}
