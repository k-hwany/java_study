package ch_memo;

public class ch06_memo {

}

/* 

static이란?
-> static 변수는 메모리 공간을 할당받고 초기화가 이루어지면 프로그램이 종료될 때까지 소멸하지 않음
-> 인스턴스 변수가 아니다
-> 객체를 생성하여 만들어진 변수가 아니기에 heap 영역이 아닌, 메모리에 기억공간이 할됭되며 메모리
   영역에 할당된 static 변수는 몇개의 객체를 생성하던 상관없이 클래스 단위당 한번만 메모리 할당한다
-> 한마디로 변수를 선언할 때 static 을 사용하여 클래스 내의 모든 객체들이 서로 공유하는 변수가 된다.
(example StaticTest01)   
-> 일반 전역변수는 객체생성이 없으면 사용 불가능
-> 정적변수는 class 명만 명시하면 어디에서든 사용 가능
(example StaticTest02)
-> 다른클래스에서 객체의 생성 없이 클래스명만 명시하면 static 변수 사용 가능


static 메서드
-> 메서드에 static을 붙여주면, 생성자 호출문 'new 클래스명()' 쓸 필요없이 '클래스명.static메서드()'로 사용
(example StaticMethod01)


final ? 
변수를 상수화



*/