package ch06;

public class ExampleTest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Final01 f1 = new Final01();
		// fi.num = 12;  <-- 오류 이유 : final 값 변경 불가능

	}

}


final class Final01{
	final int num=10;
}

class Final02{
	final void play() {
		
	}
}
/*
class Final03 extends Final01{ // <-- 오류이유 final 클래스 상속 불가능
	
}

class Final04 extends Final02{
	@Override
	final void play() {  // <-- 오류 이유  final 메서드 재정의 불가능
		
	}
}

*/