package ch03;

public class IfTest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 논리 연산자 ! (부정) , ^ (XOR)교차부정 두 피연산자를 비교하여 나온 결과 부정
		// ||(OR) 둘 중 하나만 만족하면 참 , &&(AND)  둘 다 만족하면 참
		int x=10;
		int y=2;
		if ((x>y) || (x==9)) {
			System.out.println("참");
		} else {
			System.out.println("거짓");
		}
		
		if ((x>y) && (x==9)) {
			System.out.println("참");
		} else {
			System.out.println("거짓");
		}

	}

}
