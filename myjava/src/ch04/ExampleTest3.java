package ch04;

public class ExampleTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a,b;
		a=10;
		b=20;
		ArrayTest01 arr = new ArrayTest01();
		//arr.use( , ); ??
		
		arr.use(a, b);
		System.out.println("메인 a : "+ a);
		System.out.println("메인 b : "+b);

	}
	
	void use(int a, int b) {
		a = a+5;
		b = b+5;
		System.out.println("메서드 a : "+ a);
		System.out.println("메서드 b : "+b);
	}

}

// 출력은 메서드 a 15, 메서드 b 25
//    메인 a 10 ,  메인 b 20 이 출력 된다.
