package ch03;

public class BreakTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=7;
		
		int i =1;
		while(true) {
			if (i==n) break;   // break 문이 수행되면서 while 문을 빠져나갑니다.
			System.out.println(i);
			i++;
		}
		
	}

}
