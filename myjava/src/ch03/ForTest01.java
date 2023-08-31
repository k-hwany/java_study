package ch03;

public class ForTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1; i<10; i+=10) {
			System.out.println(i);
		}
		
		int j;
		for(j=1;j<10;j++) {
			System.out.print(j+" ");  // print 는 한줄에 쓰기
		}
		System.out.println();  // 한줄 띄우기 
		
		System.out.println("for문이 끝난 뒤 i 의 값 : "+j);
		for (int i=1;i<10;++i) {
			System.out.print(i+" ");
		}

	}

}
