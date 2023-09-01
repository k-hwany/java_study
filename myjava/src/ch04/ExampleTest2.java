package ch04;

public class ExampleTest2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TestClass03 ad = new TestClass03();
		
		ad.name = "소나타";
		ad.speed = 120;
		
		System.out.println(ad.name+"의 속력은"+ad.speed+"km 입니다.                                                                                                                                                                                                        ");
	}

}

class TestClass03{
	String name;
	int speed;
}

// 출력은 : 소나타의 현재 속력은 120km 입니다. 
