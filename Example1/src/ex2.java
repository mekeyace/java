
public class ex2 {

	public static void main(String[] args) {
		String a = "홍길동";
		abc ab = new abc();
		ab.name(a);
	}

}

class abc{
		public void name(String aa) {
			String result = this.def(aa);
			System.out.println(result);
		}
		public String def(String names) {
			String msg = names + " 환영합니다.";
			return msg;
		}
}