package curriculum_New_question;

import java.util.Random;

public class Curriculum_New_1_18{
	
	// Q1：引数に文字列型と整数型をいれてコンソールに「Hello JavaSE 11」と出力するメソッドを作成してください。
	public static void printMessage(String message, int number) {
		System.out.println( message + " " + number );
	}
	// Q2：引数に整数を渡すと渡した値同士を乗算しコンソールに出力するメソッドを作成してください
	public static void multiply( int a, int b ) {
		int result = a * b;
		System.out.println(result);
	}
	// Q3：引数として整数の配列を渡すと、受け取った値を順番にコンソールに出力するメソッドを作成してください
	public static void printArray( int[] array ) {
		for( int num : array ) {
			System.out.println( num );
		}
	}
	// Q4：Q2をオーバーロードして引数を小数2つに変更し、引数同士を和算しコンソールに出力してください。
	public static void add( double a, double b ) {
		double result = a + b;
		System.out.println( result );
	}
	// Q5：引数に整数を渡すと、1～100までのランダムな数字を引数の回数分格納して
	// 格納した値を順番にコンソールで出力後、格納した値を返すメソッドを作成してください。
	// ※0は出力＆格納しないようにしてください。
    public static int[] generateRandomNumbers( int count ) {
    	int[] numbers = new int[count];
    	Random random = new Random();
    	
    	for( int i = 0; i < count; i++ ) {
    		numbers[i] = random.nextInt( 100 ) + 1;
    		System.out.println( numbers[i] );
    	}
    	
    	return numbers;
    }
	// Q6：引数にQ5で作成したメソッドの返り値を受け取り、受け取った配列の要素の平均値をコンソールに出力するメソッドを作成してください。
	// ※小数点以下も表示されるようにしてください。
	public static void calculateAverage( int[] array ) {
		int sum = 0;
		for( int num : array ) {
			sum += num;
		}
		
		double average = ( double ) sum / array.length;
		System.out.println( "Average:" + average );
	}
	// Q7：引数にQ6で作成したメソッドの返り値を受け取り、受け取った値が50以上ならばtrueそれ以外はfalseを返しコンソールに出力してください
	public static boolean checkValue( int[] array ) {
		int sum = 0;
		for( int num : array ) {
			sum += num;
		}
		
		double average = ( double ) sum / array.length;
		boolean result = average >= 50;
		System.out.println( result );
		return result;
	}

	public static void main(String[] args) {
    // 作成したメソッドをここで呼び出してください
		
		// Q1
		printMessage( "Hello JavaSE",11 );
		
		// Q2
		multiply( 5,6 );
		
		// Q3
		int[] numbers = { 1,2,3,4,5 };
		printArray( numbers );
		
		// Q4
		add( 3.14, 2.71 );
		
		// Q5
		int[] randomNumbers = generateRandomNumbers( 5 );
		
		//Q6
		calculateAverage( randomNumbers );
		
		//Q7
		checkValue( randomNumbers );
	
	}
}