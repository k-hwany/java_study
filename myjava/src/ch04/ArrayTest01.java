package ch04;

public class ArrayTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		a=10;
		b=20;
		ArrayTest01 arr = new ArrayTest01();  // 객체 생성
		arr.use(a, b);
		System.out.println("메인 a : "+a);
		System.out.println("메인 b : "+b);
		

	}
	void use(int a, int b) {   // 메서드 생성
		a=a+5;
		b=b+5;
		System.out.println("메서드 a : "+a);
		System.out.println("메서드 b : "+b);
	}

}
