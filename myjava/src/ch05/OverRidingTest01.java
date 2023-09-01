package ch05;

public class OverRidingTest01 extends Over{  // extends(상속) 을 통해 Over 클래스를 상속 받은 Over가 부모 클래스가 됨.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OverRidingTest01 ov = new OverRidingTest01();  // 객체 생성
		ov.use();                                    // 
	}
	
	@Override      // 부모클래스로부터 상속받은 메서드의 내용을 변경
	void use() {  // 메서드 생성
		super.use(); //super 생성자 / 
	}

}

class Over{   // 부모 클래스
	void use() {  //부모 클래스 메서드
		System.out.println("부모입니다.");
	}
}