package ch_memo;

public class ch08_memo {

}
/*
* [추상클래스와 인터페이스]
* 
* 추상클래스 - 객체 생성 불가능
* 자바에서는 다형성을 사용할 때 상속을 통해 부모의 타입을 앞에 두고,
* 자식의 타입으로 new 를 함으로써 객체를 생성함
* 
* Parent pr = new Child();
* Parent 클래스가 있고, Child 클래스가 상속을 받았다 가정
* 
* Child ch = new Child();
* ch.메서드() -> Child 메서드 실행
* 
* Parent pr = new Parent()
* pr.메서드 -> Parent 메서드 실행
* 
* Child ch = new Parent()
* 불가능 하다 / 부모이기때문에
* 
* Parent pr = new Child()
* pr. 메서드 -> 자식이 부모의 메서드를 오버라이딩 하였기에 자식의 메서드 실행(동적바인딩)
* 
* 추상클래스 - 실체가 없다
* 1.사이다, 2.장동건, 3.운동장, 4.동물 중 4번과 같다.
* 동물은 종류이지 실체가 없는 단어
* 
* 추상클래스 및 메서드 선언
* abstract 클래스명
* (example AbstractTest01)
* abstract 메서드 -> 추상메서드 / 해당메서드는 몸체가 없다.
* 누군가 AbstractTest01 클래스를 상속받게 되면 play 메서드를 반드시 오버라이딩 해야함
* 여러 메서드를 생성하면 복잡하므로 공통적인 분모가 되어야할 때 사용
* 
* 
* 
* 인터페이스 (interface)
* (example InterfaceTest01)
* 
* 
* 
* 
* 
* 
* 
* 
*/