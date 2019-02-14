package problem04;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("*** 신나는 야구 게임***");
		int gameNumber =  (int)Math.random();
		System.out.println("숫자 입력 > ");
		int number = sc.nextInt();
		game(number, gameNumber);
	}
	
	
	static void game(int number, int gameNumber) {
		String num = Integer.toString(number);
		String gNum = Integer.toString(gameNumber);
		char[] arrNum = num.toCharArray();
		char[] arrGNum = gNum.toCharArray();
		
		if(arrNum[0]==arrGNum[0] && arrNum[1]==arrGNum[1] && arrNum[2]==arrGNum[2] ) {
			
		}
	}
}