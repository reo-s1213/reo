package curriculum_B;

public class Qes5 {

	public static void main(String[] args) {
		
		/* Qes5
		 * 九九の段を縦に作る
		 */
		//横に1-9まで追加する
		for ( int i = 1; i <= 9; i++ ) {
			//縦に1-9まで追加する
		    for ( int j = 1; j <= 9; j++ ) {
		        int result = i * j;
		        System.out.printf( "%02d * %02d = %02d", j, i, result );
		        //9以下の場合 || を出力する
		        if ( j < 9 ) {
		            System.out.print( " || " );
		        }
		    }
		    System.out.println();
		}

	}

}
