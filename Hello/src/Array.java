import java.io.IOException;

public class Array {

	// encapsulation

	private int maxLength = 20;
	private int length;
	private int array[] = new int[maxLength];

	public boolean input() throws IOException {
		boolean isNumber = true;
		int keyvalue = System.in.read();
		while (!(keyvalue == 0x0D || keyvalue == 0x0A)) {
			if (length >= 20) {
				System.out.println("저장 가능한 Index가 초과됐습니다.");
				break;
			}
			if (keyvalue < '0' || keyvalue > '9') {
				isNumber = false;
			}
			array[length] = keyvalue;
			length = length + 1;
			keyvalue = System.in.read();
		}
		keyvalue = System.in.read();
		return isNumber;
	}

	public int stringToInt() {
		int number = 0;
		for (int i = 0; i < length; i++) {
			if (number * 10L + array[i] - 48 >= Math.pow(2, 31)) {
				System.out.println("20자를 넘었습니다.");
				break;
			} else {
				number = number * 10 + array[i] - '0';
			}
		}
		System.out.println("number : " + number);
		return number;
	}
}
