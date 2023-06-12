package curriculum_A;

public class Qes1_13 {

	public static void main(String[] args) {
		
		/*
		 *  Qes1　下記9個をローカル変数として宣言のみしてください
		 *  バイト型・短整数型・整数型・長整数型
		 *  単精度浮動小数点数型・倍精度浮動小数点数型
		 *  文字型・文字列型
		 *  ブーリアン型
		 */
		
		// バイト型
		byte num;
		// 単整数型
		short b;
		// 整数型
		int c;
		// 長整数型
		long d;
		// 単精度浮動整数型
		float e;
		// 長精度浮動整数型
		double f;
		// 文字型
		char ch;
		// 文字列型
		String str;
		// ブーリアン型
		boolean data;
		
		/*
		 * Qes2　それぞれのローカル変数をローカル内でそれぞれの初期値を代入し初期化してください
		 */
		
		// それぞれの変数を初期化する
		num = 0;
		b = 0;
		c = 0;
		d = 0L;
		e =  0.0f;
		f = 0.0d;
		ch = '\u0000';
		str = null;
		data = false;
		
		/*
		 * Qes3 初期化をしたそれぞれの変数に下記の値を代入してください
		 */
		
		// それぞれの変数に代入する
		num = 10;
		b = 100;
		c = 1000;
		d = 10000L;
		e = 9.5f;
		f = 10.5d;
		ch = 'a';
		str = "ハロー";
		data = true;
		
		/*
		 * Qes4 下記の通りにコンソール出力されるようにしてください
		 *      上記で作成した変数を必ず使用すること
		 */
		
		// 11110を出力
		System.out.println( num + b + c + d );
		// 20を出力
		System.out.println( num * 2 );
		// a ハロー trueを出力
		System.out.println( ch + str + data );
		// 11130を出力
		System.out.println( num + b + c + d + e + f );
		// 小数点以外の数字を全てかける
		System.out.println( num * b * c * d );
		// 10.5割る100をする
		System.out.println( f / b );
		// 10引く100をする
		System.out.println( num - b );
		
		/*
		 * Qes5  次のプログラムを実行すると「ハローJAVA2023」という結果が表示されます。
		 *      「ハローJAVA43」と表示とさせたいのですが、意図通りに動きません。正しく動作するように修正してください。
		 */
		
		// 「ハローJAVA43」と出力する
		int number= 20 ;
		int number1= 23 ;
		System.out.println( "ハローJAVA" + ( number + number1 ));
		
		/*
		 * Qes6 『』で囲われた人の情報を変数にして、formatの通りコンソールに出力してください
		 *       ローカル変数に代入し○○に入れてください
		 *      『山田太郎 18歳 170.5cm 62.2kg 寿司』
		 */
		
		// 『山田太郎 18歳 170.5cm 62.2kg 寿司』を出力
		String name = "山田太郎";
		int age = 18;
		double height = 170.5d;
		float weight = 62.2f;
		System.out.println( "初めまして"+ name + "です" );
		System.out.println( "年齢は"+ age + "歳です" );
		System.out.println( "身長は"+ height + "cmです" );
		System.out.println( "体重は"+ weight + "kgです" );
		String food = "寿司";
		System.out.println( "好きな食べ物は" + food + "です" );
		
		/*
		 *  Qes7 6で作成した自己紹介に続いてBMIが出力されるようにしてください
		 *  「BMIは○○です」
		 *  ただし計算は数値を直書きせず、全て変数を使ってすること
		 */
		
		// BMIをs出力
		double bm = weight / ( height * height ) * 10000;
		String bmi = String.format( "%.1f", bm );
		System.out.println( "BMIは" + bmi + "です" );
		
		/*
		 *  Qes8 6で宣言した変数に再代入し下記の通りコンソールに出力してください
		 */
		
		// コンソールに出力
		name = "鈴木一郎";
		age = 24;
		height = 168.5d;
		weight = 64.2f;
		System.out.println( "初めまして" + name + "です" );
		System.out.println( "年齢は" + age + "歳です" );
		System.out.println( "身長は" + height + "cmです" );
		System.out.println( "体重は" + weight + "kgです" );
		food = "オムライス";
		System.out.println( "好きな食べ物は" + food + "です" );
		double bm1 = weight / ( height * height ) * 10000;
		String bmi1 = String.format( "%.1f", bm1 );
		System.out.println( "BMIは" + bmi1 + "です" );
		
		/*
		 *  Qes9 8で使用した変数【年齢・身長・体重】の数値を和算で自己代入し、下記の通りコンソールに出力してください
		 */
		
		// コンソールに出力
		name = "鈴木一郎";
		age = 48;
		height = 337.0d;
		weight = 128.4f;
		System.out.println( "初めまして" + name + "です" );
		System.out.println( "年齢は" + age + "歳です" );
		System.out.println( "身長は" + height + "cmです" );
		System.out.println( "体重は" + weight + "kgです" );
		food = "オムライス";
		System.out.println( "好きな食べ物は" + food + "です" );
		double bm2 = weight / ( height * height ) * 10000;
		String bmi2 = String.format( "%.1f", bm2 );
		System.out.println( "BMIは" + bmi2 + "です" );
		
		/*
		 *  Qes10 8で使用した年齢が25歳以上ならtrueが出力されるようにしてください。ただしif文は使いません
		 */
		
		// 8で使用した年齢が25歳以上ならtrueが出力されるようにしてください。ただしif文は使いません
		age = 24;
		data = false;
		System.out.println( age > 25 );
		
		/*
		 *  Qes11 8で使用した【年齢・身長・体重】を文字列型に型変換し繋げて出力してください
		 */
		
		// 8で使用した【年齢・身長・体重】を文字列型に型変換し繋げて出力してください
		height = 168.5d;
		weight = 64.2f;
		String str1 = Integer.toString( age );
		String str2 = String.valueOf( height );
		String str3 = Float.toString( weight );
		String str4 = String.join( str1, str2, str3 );
		System.out.println( str4 );
		
		
		/*
		 *  Qes12 11で変換した【年齢・身長】を整数型に変換して出力してください
		 */
		
		// 11で変換した【年齢・身長】を整数型に変換して出力してください
		int num1 = Integer.parseInt( str1 );
		int num2 = (int)Double.parseDouble( str2 );
		System.out.println( "年齢=" + num1 + "歳" );
		System.out.println( "身長=" + num2 + "cm" );
		
		
		/*
		 *  Qes13 12で変換した【年齢・身長】で【年齢が25もしくは身長が160以上】であればtrueを出力してください
		 *  ただしif文は使わないでください
		 */
		
		// 12で変換した【年齢・身長】で【年齢が25もしくは身長が160以上】であればtrueを出力してください
		System.out.println( num1 == 25 || num2 > 160 );
		
	}

}
