package ch05;

public class ExampleTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		private02 pr = new private02();
		pr.goPrivate01();

	}

}

class private01{
	private String name;  // 현재 클래스에서만 사용
	protected int number;  // 자식클래스에서 사용 가능, 02에서 사용 가능
	
	public String getName() { 
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}

class private02 extends private01{  // 02가 자식클래스 , 01이 부모 클래스
	String getName;
	
	void goPrivate01() {
		number = 10;
		System.out.println(number);
		setName("자바");
		
		// getName = ??
		getName = getName();
		
		System.out.println(getName);
	}
}

// 출력

// 자바
// 10

// 이 출력 됩니다.