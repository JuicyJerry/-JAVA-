import java.util.Scanner;
public class GugudanAnotherMission {
		public static void main(String[] args) {
			System.out.println("���ϴ� �ܰ� ũ�⿡ ���� ���� 2���� ��ǥ�� �����ؼ� �Է��ϼ���: ");
			Scanner scanner = new Scanner(System.in);
			String inputValue = scanner.nextLine();
			String[] splitValue = inputValue.split(",");
			int first = Integer.parseInt(splitValue[0]);
			int second = Integer.parseInt(splitValue[1]);
			
			if (first < 2) {
				System.out.println("�߸��� �����Դϴ�.");
			} else if (second < 1) {
				System.out.println("�߸��� �����Դϴ�.");
			}
			
			for(int i = 2; i <= first; i++)
				for(int j = 0; j < second; j++) {
					System.out.println(i * (j + 1));
					// System.out.println("");

				
			}
	}
}
