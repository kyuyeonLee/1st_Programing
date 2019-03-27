
public class array {

	public static void main(String[] args) {
		int[] ar = new int[5];
		// class명 이름 =포인터 class명
		int b = 10;
		for (int i = 0; i < ar.length; i++) {
			ar[i] = b;
			b = b + 10;
			System.out.println(ar[i]);
		}
		ar[3] = 7;
		System.out.println(ar[3]);
	
		
	}
}
