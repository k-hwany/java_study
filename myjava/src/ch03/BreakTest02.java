package ch03;

public class BreakTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1;
		exit_for:   // 이중 반복문 선언 
		for (int i=1;i<10;i++) {
			for(int j=1;j<10;j++) {
				System.out.println(n);
				if(i==1 && j==3) {
					break exit_for;  // 이중 반복문 탈출 
				}
				n++;
			}
		}

	}

}
