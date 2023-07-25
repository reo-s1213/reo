package curriculum_New_question;

import java.util.Random;

public class Curriculum_New_1_18 {

	// Q1：引数に文字列型と整数型をいれてコンソールに「Hello JavaSE 11」と出力するメソッドを作成してください。

	public static void toPrintMessage(String message, int number) {
		//出力する
		System.out.println(message + " " + number);
	}

	// Q2：引数に整数を渡すと渡した値同士を乗算しコンソールに出力するメソッドを作成してください

	public static int multiply(int a, int b) {

		return a * b;

	}

	// Q3：引数として整数の配列を渡すと、受け取った値を順番にコンソールに出力するメソッドを作成してください

	public static void printArray(int[] array) {
		//配列の要素を取り出す
		for (int num : array) {
			//出力する
			System.out.println(num);
		}
	}

	// Q4：Q2をオーバーロードして引数を小数2つに変更し、引数同士を和算しコンソールに出力してください。

	public static double add(double a, double b) {

		return a + b;

	}

	// Q5：引数に整数を渡すと、1～100までのランダムな数字を引数の回数分格納して
	// 格納した値を順番にコンソールで出力後、格納した値を返すメソッドを作成してください。
	// ※0は出力＆格納しないようにしてください。

	public static int[] generateRandomNumbers(int count) {
		int[] numbers = new int[count];
		Random random = new Random();

		for (int i = 0; i < count; i++) {
			//1から100までランダムな数字を生成する
			numbers[i] = random.nextInt(100) + 1;
			//格納した値をコンソールに出力する
			System.out.println(numbers[i]);
		}

		return numbers;
	}

	// Q6：引数にQ5で作成したメソッドの返り値を受け取り、受け取った配列の要素の平均値をコンソールに出力するメソッドを作成してください。
	// ※小数点以下も表示されるようにしてください。

	public static double calculateAverage(int[] numbers) {
		int sum = 0;
		for (int num : numbers) {
			//要素の値を合計する
			sum += num;
		}

		return  (double) sum / numbers.length;
	
		
	}

	// Q7：引数にQ6で作成したメソッドの返り値を受け取り、受け取った値が50以上ならばtrueそれ以外はfalseを返しコンソールに出力してください

	public static boolean isCheckAverage(double average) {
		return average >= 50;
	}

	public static void main(String[] args) {
		// 作成したメソッドをここで呼び出してください

		// Q1

		// メソッド呼び出し
		toPrintMessage("Hello JavaSE", 11);

		// Q2

		// メソッド呼び出し
		System.out.println(multiply(5, 6));

		// Q3

		// メソッド呼び出し
		int[] numbers = { 1, 2, 3, 4, 5 };
		printArray(numbers);

		// Q4

		// メソッド呼び出し
		System.out.println(add(3.14, 2.71));

		// Q5

		// メソッド呼び出し
		int[] randomNumbers = generateRandomNumbers(5);

		//Q6

		// メソッド呼び出し
		double average = calculateAverage(randomNumbers);
        System.out.println("平均値：" + average);

		//Q7

		// メソッド呼び出し
        boolean isAbove50 = isCheckAverage(average);
        System.out.println("平均値が50以上：" + isAbove50);

	}
}