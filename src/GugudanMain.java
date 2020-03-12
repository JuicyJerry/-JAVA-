// 클래스로 구구단 구현
public class GugudanMain {
	public static void main(String[] args) {
		for(int i = 2; i < 10; i++) {
			int[] result = Gugudan_new.calculate(i);
			Gugudan_new.print(result);
			System.out.println("");
		}
	}
}
// class 대문자로 시작 method 소문자로 시작하는 convention이 있음을 유념.