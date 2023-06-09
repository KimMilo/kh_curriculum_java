package kr.co.exam03;

public class Exam07 {

	public static void main(String[] args) {
		/* 문제 A
		 * 다음과 같은 모양의 출력을 만들어보세요.
		 * 
		 * 1    2    3    4    5
		 * 6    7    8    9    10
		 * 11   12   13   14   15 
		 * 16   17   18   19   20
		 * 21   22   23   24   25
		 * 
		 * 숫자 사이의 공백은 Space가 아닌 Tab(\t)로 만드세요.
		 * (반드시 중첩 반복문이 아니여도 됨) 
		 */
		
		System.out.println("======= 문제 A(1) =======");
		
		for(int i = 1; i <= 25; i++) {
			System.out.printf("%d\t", i);
			if(i % 5 == 0) {
				System.out.print("\n");
			}
		}
		System.out.println("======= 문제 A(2) =======");
		int n = 0;
		for(int i = 1; i <= 5; i++){
			for(int j = 1; j <= 5; j++) {
				n++;
				System.out.printf("%d\t", n);
			}
			System.out.print("\n");
		}
		
		/* 문제 B
		 * 1 ~ 31 까지의 숫자를 달력 형태처럼 출력하세요.
		 * 1   2   3   4   5   6   7
		 * 8   9   10  11  12  13  14
		 * 15  16  17  18  19  20  21
		 * 22  23  24  25  26  27  28
		 * 29  30  31
		 * 
		 * 숫자 사이의 공백은 space가 아닌 Tab(\t)로 만든세요.
		 * (반드시 중첩 반목문이 아니여도 됨)
 		 */

		System.out.println("======= 문제 B(1) =======");
		for(int i = 1; i <= 31; i++) {
			System.out.printf("%d\t", i);
			if(i % 7 == 0) {
				System.out.print("\n");
			}
		}
		System.out.println();
		System.out.println("======= 문제 B(2) =======");
		int m = 0;
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= 7; j++) {
				m++;
				System.out.printf("%d\t", m);
				if(m >= 31) {
					break;
				}
			}
			System.out.print("\n");
			if(m >= 31) {
				break;
			}
		}
	}
}
