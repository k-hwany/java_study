package ch05;

public class ConstructorTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CstTest02 ct1 = new CstTest02("누구");
		ct1.use();	
		
		CstTest02 ct2 = new CstTest02(10000);
		ct2.use();		
		
		CstTest02 ct3 = new CstTest02("누구", 10000);
		ct3.use();
	}

}


class CstTest02{
	String name;
	int money;
	public CstTest02() {
		
	}
	public CstTest02 (String name) {
		this.name = name;
	}
	public CstTest02 (int money) {
		this.money=money;
	}
	public CstTest02 (String name, int money) {
		this.name=name;
		this.money=money;
	}
	void use() {
		System.out.println("name : "+name+"\n"+"money : "+money);
	}
}