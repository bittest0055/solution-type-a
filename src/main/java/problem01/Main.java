package problem01;

public class Main {

	public static void main(String[] args) {
		for( int i = 1; i <= 100; i++ ) {
			int count = countClap(i);

			if( count == 0 ) {
				continue;
			}
			
			System.out.print( i + " " );
			
			for( int j = 0; j < count; j++ ) {
				System.out.print( "짝" );
			}
			
			System.out.println( "" );			
		}
	}
	
	public static int countClap(int number) {
		 	int n=1;
			if(number%3 == 0) {
				
				return 1; //number로 들어온 수를 나누었을 때, 0이면 3의 배수 이다. -> 박수 짝! 한번 숫자 1 반환
			} 
			
		
		
		return 0;  // 3의 배수가 아닐때
	}// countClap
}