import java.util.Vector;

public class svector {
	public static void main(String[] args) {

		Vector<Integer> vint = new Vector<Integer>();

		for (int i = 0; i < 60; i = i + 10) {
			vint.add(i);
		}
		System.out.println(vint);
		for (int i = 0; i < vint.size(); i++) {
			System.out.println(vint.get(i));
		}
		vint.add(1, 5);
		System.out.println(vint);
		vint.remove(1);
		System.out.println(vint);
	}

}
