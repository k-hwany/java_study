package ch08;

//리모콘
public class InterfaceTest03 implements InterfaceTest01, InterfaceTest02{

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("B on!");
		
	}

	@Override
	public void lighton() {
		// TODO Auto-generated method stub
		System.out.println("A on!");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InterfaceTest03 it03 = new InterfaceTest03();
		
		it03.turnOn();
		it03.lighton();

	}

}
