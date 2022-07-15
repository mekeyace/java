
public class ex2 {

	public static void main(String[] args) {
		String a = "홍길동";
		abc ab = new abc();
		ab.name(a);
	}

}

class abc{
		public void name(String aa) {
			System.out.println(aa);
		}

}