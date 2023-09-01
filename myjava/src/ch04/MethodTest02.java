package ch04;

public class MethodTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodTest02 mt = new MethodTest02(); // 객체 생성
		mt.morningTest();     // 메서드 호출
		System.out.println("2줄");
		mt.morningTest();
	}
	
	public void morningTest() {         // 메서드 생성
		System.out.println("안녕");
	}
	
	

}
