import java.io.IOException;
import java.util.Vector;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

public class Main2 {
	static int arrayNumber[] = new int[20];
	static int index = 0;
	static Boolean isNumber = true;
	static long number = 0L;
	static String realNum = "";
//	@SuppressWarnings("static-access")
//	public Main(int arrayNumber[], int index, Boolean isNumber, long number, String realNum) {
//		this.arrayNumber = arrayNumber;
//		this.index = index;
//		this.isNumber = isNumber;
//		this.number = number;
//		this.realNum = realNum;
//	}

	public static void input() throws IOException {// ���п��� �Լ� f �� ���� �ǹ�
//////////////��Ŷ����� ����� �Ķ��Ÿ�� ��ſ��� ���� ��������� ��//////////
/////////////////////// input Buffering/ ///////////////////////
////////////////////////////////////////////////////////////////
		int keyvalue = System.in.read();
		while (!(keyvalue == 0x0D || keyvalue == 0x0A)) {
			if (index >= 20) {
				System.out.println("���� ������ Index�� �ʰ��ƽ��ϴ�.");
				System.out.print("arrayNumber[20]���� ����� ���� -> ");
				break;
			}
			if (keyvalue < '0' || keyvalue > '9') {
				isNumber = false;
			}
			arrayNumber[index] = keyvalue;
			index = index + 1;
			keyvalue = System.in.read();
		}
		keyvalue = System.in.read();

	}

	public static void StringToInt() {
////////////////////////////////////////////////////////////////
/////////////////////// ascii to integer ///////////////////////
////////////////////////////////////////////////////////////////
		if (isNumber) { // number < 2^32
			for (int i = 0; i < index; i++) {
				if ((long) (number * 10) + arrayNumber[i] - 48 >= Math.pow(2, 31)) {
					for (int j = 0; j < index; j++) {
						realNum += (char) arrayNumber[j];
					}
					System.out.println("IntegerOverFlowException : " + realNum);
					System.out.println("Index Number : " + index);
					break;
				}
				number = (long) (number * 10 + arrayNumber[i] - '0');
			}
		}
	}

	public static void main(String[] args) throws IOException {
		input();
		StringToInt();
	}
}
