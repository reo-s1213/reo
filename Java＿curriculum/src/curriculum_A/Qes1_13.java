package curriculum_A;

public class Qes1_13 {

	public static void main(String[] args) {
		
		/*
		 * Qes1
		 */
		
		//バイト型
		byte num;
		//単整数型
		short b;
		//整数型
		int c;
		//長整数型
		long d;
		//単精度浮動整数型
		float e;
		//長精度浮動整数型
		double f;
		//文字型
		char ch;
		//文字列型
		String str;
		//ブーリアン型
		boolean data;
		
		/*
		 * Qes2
		 */
		
		//それぞれの変数を初期化する
		num = 0;
		b = 0;
		c = 0;
		d = 0L;
		e =  0.0f;
		f = 0.0d;
		ch = 0;
		str = null;
		data = false;
		
		/*
		 * Qes3
		 */
		
		//それぞれの変数に代入する
		num = 10;
		b = 100;
		c = 1000;
		d = 10000;
		e = 9.5f;
		f = 10.5d;
		ch = 'a';
		str = "ハロー";
		data = true;
		
		/*
		 * Qes4
		 */
		
		//11110を出力
		System.out.print(num + b + c + d);
		System.out.println(num + b + c + d);
		//20を出力
		System.out.print(num * 2);
		System.out.println(num * 2);
		//a ハロー trueを出力
		System.out.print(ch + str + data);
		System.out.println(ch + str + data);
		//11130を出力
		System.out.print(num + b + c + d + e + f);
		System.out.println(num + b + c + d + e + f);
		//小数点以外の数字を全てかける
		System.out.print(num * b * c * d);
		System.out.println(num * b * c * d);
		//10.5割る100をする
		System.out.print(f / b);
		System.out.println(f / b);
		//10引く100をする
		System.out.print(num - b);
		System.out.println(num - b);
		
		/*
		 * Qes5
		 */
		
		//『山田太郎 18歳 170.5cm 62.2kg 寿司』を出力
		str = "山田太郎";
		num = 18;
		f = 170.5d;
		e = 62.2f;
		System.out.println("初めまして"+str+"です");
		System.out.println("年齢は"+num+"歳です");
		System.out.println("身長は"+f+"cmです");
		System.out.println("体重は"+e+"kgです");
		str = "寿司";
		System.out.println("好きな食べ物は"+str+"です");
		
		/*
		 * Qes6
		 */
		
		//BMIをs出力
		System.out.println("BMIは"+e/(f*f)*10000+"です");
		
		/*
		 * Qes8
		 */
		
		//コンソールに出力
		str = "鈴木一郎";
		num = 24;
		f = 168.5d;
		e = 64.2f;
		System.out.println("初めまして"+str+"です");
		System.out.println("年齢は"+num+"歳です");
		System.out.println("身長は"+f+"cmです");
		System.out.println("体重は"+e+"kgです");
		str = "オムライス";
		System.out.println("好きな食べ物は"+str+"です");
		System.out.println("BMIは"+e/(f*f)*10000+"です");
		
		/*
		 * Qes9
		 */
		
		//コンソールに出力
		str = "鈴木一郎";
		num = 48;
		f = 337.0d;
		e = 128.4f;
		System.out.println("初めまして"+str+"です");
		System.out.println("年齢は"+num+"歳です");
		System.out.println("身長は"+f+"cmです");
		System.out.println("体重は"+e+"kgです");
		str = "オムライス";
		System.out.println("好きな食べ物は"+str+"です");
		System.out.println("BMIは"+e/(f*f)*10000+"です");
		
		/*
		 * Qes10
		 */
		
		//8で使用した年齢が25歳以上ならtrueが出力されるようにしてください。ただしif文は使いません
		num = 24;
		data = false;
		System.out.println(num > 25);
		
		/*
		 * Qes11
		 */
		
		//8で使用した【年齢・身長・体重】を文字列型に型変換し繋げて出力してください
		f = 168.5d;
		e = 64.2f;
		String str1 = Integer.toString(num);
		String str2 = String.valueOf(f);
		String str3 = Float.toString(e);
		String str4 = String.join(str1, str2, str3);
		System.out.println(str4);
		System.out.println(str2);
		
		
		/*
		 * Qes12
		 */
		
		//11で変換した【年齢・身長】を整数型に変換して出力してください
		int num1 = Integer.parseInt(str1);
		int num2 = (int)168.5;
		System.out.println("年齢=" + num1);
		System.out.println("身長=" + num2);
		
		
		/*
		 * Qes13
		 */
		
		//12で変換した【年齢・身長】で【年齢が25もしくは身長が160以上】であればtrueを出力してください
		System.out.println(num1 == 25 || num2 > 160);
		
	}

}
