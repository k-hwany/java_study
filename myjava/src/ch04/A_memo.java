package ch04;

public class A_memo {

	public static void main(String[] args) {  //main 매서드
		// TODO Auto-generated method stub
		
		// 클래스란 특징을 한번 마들어 두면 , 똑같은것을 반복적으로 만들 수있다.
		// 예를 들어 자동차를 생산할때 설계도를 사용하여 반복으로 생산한다. 
		// 이때 사용하는 자동차 설계도를 클래스라고 할 수 있다.
		// 또한 이 클래스(설계도)를 사용하여 만든 것을 객체(자동차) 라고 한다.
		
		// 클래스 구조
		/* 클래스명{
			변수
			상수
			생성자
			{
				
			}
			메서드 --> 특정 조건에 따라 어떠한 작업을 수행하기 위한 호출되는 명령문의 집합
			{       클래스는 이런 메서드를 담아 놓은 공간이며, 클래스 안에서 여러 메서드를 이동하며 실행한다.
				
			}
		}
		
		
		class Animal{         --> 클래스 이름 
			String banana;     --> 멤버 변수 = 클래스 변수 
			int speed;        --> 멤버 변수 = 인스턴스변수 
			
			public Animal (String banana){      --> 생성자 
				this.banana = banana;
			}
			
			public void mySpeed (String speed){  --> 메서드 
				this.speed = speed;
			}
			
			public void mTest(){          -->메서드 
				String stack = "스택";
			}
		*/
		
		//////// 메서드 구조 ///////////////////
		
		/* 1. return 타입 메서드
		 * String mt(){
		 * 		String name = "깨봉";
		 * 		return name;
		 * }
		 * 
		 * 2. void 타입 메서드
		 * void mt(){
		 * 		String name = "깨";
		 * 		System.out.println("name");
		 * }
		 * 
		 * 3.  접근 지정자로 구별되는 메서드
		 * 		public void  --> 모든 패키지에서 해당 메서드 호출 가능
		 * 		private void --> mt 메서드를 가진 클래스에서만 해당 메서드 호출 가능
		 * 		protected void --> 자식 클래스에서만 mt 메서드 호출 가능
		 * 		(없음) void --> 동일 패키지에서만 mt 메서드 호출가능
		 * 
		 * 4. 매개변수(인자)가 있는 메서드
		 * void mt(String name){
		 * 		System.out.println("name");
		 * }
		 * 
		 /////////////////////////////////////////////////////////////
		 * 5. 메서드 오버로딩 (Overloading)
		 * 		메서드가 호출되면 어떤 메서드가 호출되었는지 구분할 수 있어야함
		 * 		이때 구분할 수 있는 요소를 시그너처(signature)라고 함
		 * 		시그너처 종류
		 * 		- 메서드 이름
		 * 		- 메서드의 매개변수 타입(자료형)
		 * 		- 메서드의 매게변수 개수
		 * ex)
		 * class Overload1{
		 * 		public void load(int number)[
		 * 			sysout(number);
		 * 		}
		 * 		public void load( String name){
		 * 			sysout(name);
		 * 		}
		 * 
		 * 위 예제는 이름은 같지만 매개변수의 타입이 다르기에 다른 메서드 이다.
		 * 
		 * 메서드 오버로팅이란?
		 * 		특정 클래스 내부에 이름이 같은 메서드를 정의하는 것
		 * 		단, 구별을 위해 인자의 타입이나 변수를 조정해 주어야 함
		 * ex)
		 * class Overload2{
		 * 		public void load(int number){
		 * 			sysout(number);
		 * 		}
		 * 		public void load (int number, int speed){
		 * 			sysout(number, speed);
		 * 		}
		 * }
		 * 위 예제는 메서드 이름은 같지만 매개변수 개수가 다르기에 다름.
		 *
		 * 
		 * main() 메서드
		 * 
		 *public 공용 이라는 뜻으로 같은 프로젝트하면 어느 패키지에서도 사용 가능
		 *static 정적 이라는 뜻으로, 메모리에서 가장 먼저 실행된다.
		 *	객체와는 다르게 공유할 수 있다. 한 공간을 다른 클래스와 함께 공유하며 사용 가능
		 * 
		 * void 아무것도 없다는 뜻으로 반환형(리턴형)이며, 아무것도 return 안함
		 * 
		 * 
		 *   ////////////////////////////////////////////////////////////////
		 *   
		 *   <배열>
		 *  자료형[] 배열 이름 : short[] sh;
		 *  자료형 배열 이름[] : int a[];
		 *  int num[];   
		 *  int []num;   // 1차원 배열은 [] 하나만 사용
		 *  int[] num;
		 *   
		 *	배열 초기화
		 *  int[5] num = {1,2,3,4,5};
		 *  
		 *  배열 객체를 생성한 뒤 초기화
		 *  int num[] = new int[5];
		 *  num[0]=1;
		 *  num[1]=2;
		 *  num[2]=3;
		 *  num[3]=4;
		 *  num[4]=5;
		 *  
		 *  < 다차원 배열 >
		 *  배열 선언
		 *  int num[][];
		 *  
		 *  배열 초기화
		 *  int num[3][3] = {{1,2,3},{4,5,6},{7,8,9}};
		 *  
		 *  객체 생성 초기화
		 *  int num[][] = [2][3];
		 *  num[0][0]=1;
		 *  num[0][1]=2;
		 *  num[0][2]=3;
		 *  num[1][0]=4;
		 *  num[1][1]=5;
		 *  num[1][2]=6;        
		 *  
		 *  배열 또한 객체와 같다.
		 *  
		 *  
		 * 
		 * 	
		 * 
		 * 
		 * 
		 * 
		 */

	}

}
