import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Vector;

public class ELogin {
	public boolean authenticate(String userId, String password) {
		BufferedReader br_id = null;
		BufferedReader br_pw = null;
		Vector<String> vec_id = new Vector<String>();
		Vector<String> vec_pw = new Vector<String>();
		try {
			String st_id, st_pw;
			File id = new File("data/id");
			File pw = new File("data/password");
			br_id = new BufferedReader(new FileReader(id));
			br_pw  = new BufferedReader(new FileReader(pw));

			// 더이상 읽어들일게 없을 때까지 읽어들이게 합니다.
			while ((st_id = br_id.readLine()) != null) {vec_id.add(st_id);}
			while ((st_pw = br_pw.readLine()) != null) {vec_pw.add(st_pw.toString());}
		} catch (IOException e) {e.printStackTrace();
		} finally {
			try {
				if (br_id != null) {br_id.close();}
				if (br_pw != null) {br_pw.close();}
			}catch (IOException e) {e.printStackTrace();}
		}
		
			if (vec_id.contains(userId)) {
				if (vec_pw.elementAt(vec_id.indexOf(userId)).equals(password)) {
					System.out.println("로그인 되었습니다.");
				}else {
					System.out.println("비밀번호를 잘못 입력하셨습니다.");
				}
			}else {
				System.out.println("ID를 잘못 입력 하셨습니다.");
			}
		System.out.println("--------회원 정보--------");
		for (int i = 0; i < vec_id.size(); i++) {
			System.out.println("ID : " + vec_id.elementAt(i) + "\t" +"PASSWORD: " + vec_pw.elementAt(i));
		}
		return false;
	}
}
