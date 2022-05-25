import java.util.Scanner;

public class Scan7 {

	public static void main(String[] args) {
		int sc = 220524;
		
		Scanner h = new Scanner(System.in);
		System.out.println("Q.인증받은 번호를 입력하세요?");
		int user = h.nextInt();
		
		if(sc == user) {
			System.out.println("인증확인 되셨습니다.");
		}
		else {
			System.out.println("인증번호가 틀립니다.");
		}
		h.close();

	}

}
