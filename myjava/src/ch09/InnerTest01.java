package ch09;




class outer01 { //외부 클래스
	int i =22;
	void p() {   // 외부 클래스 메서드
		System.out.println("i : "+i);
	}
	
	class Inner01{   // 내부클래스 선언
		int j=23;    // 내부클래스의 필드 선언
		void m() {   // 내부클래스 메서드 선언
			System.out.println("i+j : "+(i+j));
			p();  // 외부클래스 메서드 호출
		}
	}
}


public class InnerTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		outer01 out = new outer01();  // 외부클래스 객체 생성
		
		outer01.Inner01 inner = out.new Inner01();  // 내부클래스 객체 생성
		
		inner.m();  // 내부크래스의 m() 메서드 호출

	}

}
