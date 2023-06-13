package curriculum_B;

public class Qes4 {

	public static void main(String[] args) {
		
		/* Qes4
		 * for文を使用して下記の通りに出力してください
		 */
		
		//九九の段を作る
		for ( int i = 1; i <= 9; i++ ) {
		    for ( int j = 1; j <= 9; j++ ) {
		        int result = i * j;
		        System.out.printf( "%02d * %02d = %02d", i, j, result );
		        if ( j < 9 ) {
		            System.out.print( " || " );
		        }
		    }
		    System.out.println();
		}

	}

}
