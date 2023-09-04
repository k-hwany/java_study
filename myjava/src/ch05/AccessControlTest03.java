package ch05;

public class AccessControlTest03 extends ProtectedTest01{ // extends를 통해 자식클래스가 됨

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessControlTest03 ac = new AccessControlTest03();
		ac.Child();
		

	}

}

class ProtectedTest01{   // 부모 클래스
	protected void Child() {
		System.err.println("자식에서만 실행 가능");
	}
}