import java.io.IOException;
public class Main {
	public static void main(String[] args) throws IOException {
		Array array = new Array();
		boolean isNumber = array.input();
		if (isNumber) { 
			int number = array.stringToInt();
		}
		System.out.println("프로그램 정상 종료합니다.");
	}
}
