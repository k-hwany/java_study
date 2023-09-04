package ch07;

class Vehicle{   // 부모 클래스 Vehicle 생성
	void move() {
		System.out.println("move!");   
	}
}

class Airplan extends Vehicle{      // Ve의 자식클래스, fly메서드 생성
	void fly() {
		System.out.println("fly");
	}
}

class car extends Vehicle{          // Ve의 자식클래스, drive메서드 생성
	void drive() {
		System.out.println("drive");
	}
}

public class CastingEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		moveVehicle(new Airplan());
		moveVehicle(new car());

	}
	
	static void moveVehicle(Vehicle vehicle) {
		if(vehicle instanceof Airplan) {   // A instanceof B -> A와 B가 같다면 true 반환
			Airplan ap = (Airplan) vehicle;
			ap.fly();
		}else if (vehicle instanceof car) {
			car car = (car) vehicle;
			car.drive();
		}
	}
}
