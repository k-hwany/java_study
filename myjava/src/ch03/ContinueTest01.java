package ch03;

public class ContinueTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=1;i<=5;i++) {
			if(i==3) {
				continue;  // 반복문 끝으로 이동하여 반복문 다시 실행 ( 중간 생략)
			}
			
			System.out.println(i);
		}

	}

}
