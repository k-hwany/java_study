package ch07;

class Animal {
	public void move() {
		System.out.println("move!!");
	}
}

class Bird extends Animal{
	private String name = "bird";
	public void move() {
		System.out.println(name+"fly");
	}
}

class Fish extends Animal{
	private String name = "fish";
	public void move() {
		System.out.println(name+"move");
	}
}

class Dog extends Animal{
	private String name = "dog";
	public void move() {
		System.out.println(name+"run");
	}
}

public class PolymorphismEx01 {
	static Animal[] animal;   // 동물을 담아둘 배열을 변수로 선언
	// static 은 메인에서 사용해야 하므로 같이 static 변수 사용
	
	public static void createAnimal(int num) {
		animal = new Animal[num];  // num 만큼 담아둘 배열 생성
		
		for (int i=0;i<animal.length;i++) { // 동물 개수만큼 반복
			if ((i%3)==0) {
				animal[i]=new Bird();
			}else if((i%3)==1) {
				animal[i]=new Fish();
			}else {
				animal[i]= new Dog();
			}
		}
		
		System.out.println(num+"마리의 동물이 생성 되었습니다.");
		System.out.println("===========================");
		
		
	}
	
	public static void moveAnimal() {
		System.out.println(animal.length+"마리의 동물을 이동시킵니다.");
		System.out.println("===========================");
		 
		try {
			Thread.sleep(1000); // 1초 기다림
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		for (int i = 0;i<animal.length;i++) {
			animal[i].move();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		createAnimal(5);
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		moveAnimal();
		

	}

}
