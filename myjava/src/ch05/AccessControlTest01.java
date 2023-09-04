package ch05;

public class AccessControlTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrivateTest01 pv = new PrivateTest01();
		String id =pv.getId();
		System.err.println("ID : "+id);

	}

}

class PrivateTest01{
	String id;
	private void myIdPw() {  // 현재 클래스에서만 사용 가능
		String pw;
		this.id = "abcd";
		pw = "1234";
	}
	public String getId() {  // String 타입 반환, public 으로 다른 패키지에서도 사용 가능
		myIdPw();
		return id;
	}
}