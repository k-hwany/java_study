package ch05;

public class ConstructorTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// CstTest01 ct = new CstTest01(); <-- 오류
		CstTest01 ct = new CstTest01("최주호", "010-1234-4321");
		ct.use();
		
		

	}
}

class CstTest01{
	String name;
	String number;
	
	public CstTest01 (String name, String number) { //인자가 있는 생성자 생성
		this.name=name;      // this 는 해당 클래스의 변수를 의미
		this.number=number;
	}
	
	void use() {
		System.out.println("name : "+name+"\n"+"number : "+number);
	}
}
