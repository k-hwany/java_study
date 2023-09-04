package ch05;

// 다음 소스는 동적바인딩을 사용한 소스 / 결과 예측

public class ExampleTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bind01 b1 = new bind02();
		b1.play();

	}

}

class bind01 {
	void play() {
		System.out.println("bind01");
	}
}

class bind02 extends bind01{
	@Override
	void play() {
		System.out.println("bind02");
	}
}

// 예상 출력 : bind02 
// 이유 : 오버라이딩을 통해 자식클래스가 재정의
// 답 - 다형성을 이용하여 객체를 생성하여 메서드를 실행할 때, 부모클래스의 메서드를 자식이
//     가지고 있으면, 동적 바인딩이 되어, 자식메서드가 실행