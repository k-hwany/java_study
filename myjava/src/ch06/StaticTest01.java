package ch06;

public class StaticTest01 {
	static int num;  // 정적 변수
	int count;   // 전역 변수

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// count = 1 <- 오류
		
		StaticTest01 st1 = new StaticTest01();
		st1.count=1;
		
		num=1;
		
		System.out.println("객체 생성 couint : "+st1.count);
		System.out.println("static num : "+num);

	}

}
