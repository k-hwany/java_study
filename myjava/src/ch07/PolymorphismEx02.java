package ch07;

public class PolymorphismEx02 {
	
	public static void moveAnimal(Animal animal) {
		animal.move();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal[] animal = new Animal[100];
		
		for (int i=0;i<animal.length;i++) { // 동물 개수만큼 반복
			if ((i%3)==0) {
				animal[i]=new Bird();
			}else if((i%3)==1) {
				animal[i]=new Fish();
			}else {
				animal[i]= new Dog();
			}
			moveAnimal(animal[i]);
		}
	}

}
