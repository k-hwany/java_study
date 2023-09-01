package ch03;

public class PassWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 반복문을 사용하여 PW 해킹 코
	
		int pw = 1324;
		for (int i=0;i<1000000;i++) {
			if (i==pw) {
				System.out.println("PW는 "+i);
			}
		}

	}

}
