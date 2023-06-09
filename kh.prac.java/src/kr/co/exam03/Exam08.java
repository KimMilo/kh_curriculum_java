package kr.co.exam03;

public class Exam08 {

	public static void main(String[] args) {
		/*
		 * 다음과 같은 모양의 출력을 만들어 보세요.
		 * 1
		 * 2   3
		 * 4   5   6
		 * 7   8   9   10
		 * 11  12  13  14  15 
		 * 
		 * 
		 */
		
		System.out.println();
		System.out.println("======= Ver.1 =======");
		int colCount = 1;
		int rowCount = 1;
		for(int i = 1; i <= 15; i++, colCount++) {
			System.out.printf("%d\t", i);
			if(colCount == rowCount) {
				System.out.print("\n");
				colCount = 0;
				rowCount++;
			}
		}
		System.out.println();
		System.out.println("======= Ver.2 =======");
		int n = 0;
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= i; j++) {
				n++;
				System.out.printf("%d\t",n);
			}
			System.out.print("\n");
		}
	}
}
