import java.io.IOException;
import java.util.Vector;

public class Main {
	public static void main(String[] args) throws IOException {
		// primitive type, variable : java���� ���� ���� �⺻���� ���Ұ��� Ÿ�� �̰Ÿ� ������ Ÿ���� ���⿡�� �ʹ� �۾Ƽ�
		// ���ڷ� ���� �� �ְ� ���� ���� class
		int x;
		float y;
		char c;
		boolean b;

		// class (�츮�� ���� Ÿ��), object(������Ʈ �̸��� ������Ʈ �ٵ�� ��������)

		boolean mode = true;
		// get String
		Vector<Integer> input; // �ּҸ� ���� ����
		input = new Vector<Integer>();
		int key = 0;// �ּҸ� �������ִ� �� �޸�/
		int number = 0;// �ּҸ� �������ִ� �� �޸�/
		while (mode) {
			System.out.print("������ �Է��ϼ��� : ");
			//�Է�&�Ǻ�
			for (int keyvalue = System.in.read(); keyvalue != 0x0D; keyvalue = System.in.read()) {
				if (!(keyvalue < '0' || keyvalue > '9')) {
					input.add(keyvalue);
				} else {
					mode = false;
				}
			}
			System.out.println("input�� : " + input);
			
			//��ȯ
			for (int i = 0; i < input.size(); i++) {
				key = input.elementAt(i) - 48;
				number = number * 10 + key;
			}
			System.out.println("��ȯ�� �� : " + number);
			System.in.read();
			
			//�������
			if (mode == false) {
				System.out.println("�߸� �Է��ϼ̽��ϴ�.(�����Է�)");
			} else if (number > 100) {
				System.out.println("�߸� �Է� �ϼ̽��ϴ�.(1)");
			} else if (number > 90) {
				System.out.println("���� : " + number + "��\n��� : A");
			} else if (number > 80) {
				System.out.println("���� : " + number + "��\n��� : B");
			} else if (number > 70) {
				System.out.println("���� : " + number + "��\n��� : C");
			} else if (number > 60) {
				System.out.println("���� : " + number + "��\n��� : D");
			} else if (number >= 0) {
				System.out.println("���� : " + number + "��\n��� : F");
			} else {
				System.out.println("�߸� �Է� �ϼ̽��ϴ�.(2)");
			}
			input.removeAllElements();
			number = 0;
		}
	}
}
