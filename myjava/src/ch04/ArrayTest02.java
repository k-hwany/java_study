package ch04;

public class ArrayTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[] = new int[3];
		num[0]=0;
		num[1]=1;
		num[2]=2;
		
		ArrayTest02 arr = new ArrayTest02();  // 객체 생성
		arr.use(num);                 // 메서드에서 배열에 저장
		System.out.println(num[0]);   // 배열의 값이 메서드에서 변경 되었기 때문에 변경된 값 출력
		System.out.println(num[1]);
		System.out.println(num[2]);
	}
	void use(int[] num) {   //메서드 생성
		num[0]=num[0] + 10;
		num[1]=num[1] + 10;
		num[2]=num[2] + 10;
		System.out.println(num[0]);
		System.out.println(num[1]);
		System.out.println(num[2]);
	}

}
