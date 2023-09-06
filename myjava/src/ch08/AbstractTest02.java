package ch08;

abstract class Animal{
	abstract void speak();
	
	void listen() {
		System.out.println("listen!");
	}
}

public class AbstractTest02 extends Animal{
	
	@Override
	void speak() {
		System.out.println("talk!");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractTest02 abs = new AbstractTest02();
		abs.speak();
		abs.listen();

	}

}
// 흠.. 쉽게 말하면.. 몸체가 없기에.. 추상클래스 상속.. 
// 추상클래스에서 추상메서드는 오버라이딩하여 사용..