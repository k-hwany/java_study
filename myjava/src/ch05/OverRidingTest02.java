package ch05;

public class OverRidingTest02 extends Over2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverRidingTest02 ov = new OverRidingTest02();  // 객체 생성
		ov.use();                                    // 
	}
	
	@Override      // 부모클래스로부터 상속받은 메서드의 내용을 변경
	void use() {  // 메서드 생성
		System.out.println("자식 입니다.");   // super 사용하지 않고 재정의 하였다.
	}

}

class Over2{   // 부모 클래스
	void use() {  //부모 클래스 메서드
		System.out.println("부모입니다.");
	}
}