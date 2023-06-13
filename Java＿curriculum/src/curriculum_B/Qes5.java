package curriculum_B;

public class Qes5 {

	public static void main(String[] args) {
		
		/* Qes5
		 * 九九の段を縦に作る
		 */
		
		for ( int i = 1; i <= 9; i++ ) {
		    for ( int j = 1; j <= 9; j++ ) {
		        int result = i * j;
		        System.out.printf( "%02d * %02d = %02d", j, i, result );
		        if ( j < 9 ) {
		            System.out.print( " || " );
		        }
		    }
		    System.out.println();
		}

	}

}
