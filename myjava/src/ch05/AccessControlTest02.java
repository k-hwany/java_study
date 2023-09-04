package ch05;

public class AccessControlTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrivateTest02 pv = new PrivateTest02();
		String id = pv.getId("김경환");
		System.err.println("ID : "+id);

	}

}

class PrivateTest02{
	String id;
	String key;
	
	private void myIdPw() {
		String pw;
		this.id = "abcd";
		pw = "1234";
		if (key == "김경환") {
			System.err.println("PW : "+pw);
		}
	}
	
	public String getId(String key) {
		this.key=key;
		myIdPw();
		return id;
	}
}