package ch04;

public class ClassTest02 {
	String hand;
	String leg;
	String head;
	String eyes;
	String runSpeed;
	String hasWeapon;
	String height;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassTest02 character = new ClassTest02(); // 객체 생성 
		character.hand = "크다";  // 참조 변수 찾
		
		System.out.println(character.hand);  
		
		// 동일한 클래스가 아닌 다른 클래스에서도 ClassTest02 객체를 생성할 수 있습니다.
		
		// 레퍼런스 변수란?
		// 객체를 생성할 때 character 를 레퍼런스 변수이며, 참조변수라고도 부릅니다.
	}

}
