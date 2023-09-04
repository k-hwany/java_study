package ch_memo;

public class ch07_memo {

}

/*
* <다형성>
* 
* 다형성 - 메서드를 호출했을 때 상황에 따라 다양한 동작을 하는 것
* 
* 예를 들어, move() 메서드를 호출하면, 새는 날고, 강아지는 달리고, 물고기는 헤엄치고
* 이런식으로 하나의 메서드로 다양한 동작을 함
* (example Poly....Ex01)
* 
* 업 캐스팅 - 자식클래스를 부모클래스타입으로 변환하는 것
* Animal a = new Bird();
* Animal b = new fish();
* Animal c = new dog();
* 
* 다운캐스팅 - 부모클래스를 자식클래스로 변환하는것
* Bird a = (Bird) new Animal;
* fish b = (fish) new Animal;
* dog c = (dog) new Animal;
* 
* (example CastingEx01)
* 
* A클래스객체 instanceof B클래스
* 클래스객체와 클래스타입이 같다면 true 아니면 flase 
* 
* 오토박싱(AutoBoxing) - 자동으로 상향형변환(upcasing)이 되는 것
* 
* 
* 매개변수 다형성 이용
* (example Poly....Ex02)
* 
* 
*/