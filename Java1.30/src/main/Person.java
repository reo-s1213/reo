package main;

//personクラス
class Person {
	String name;
	int age;
	double height;
	double weight;

	private static int totalCount = 0;

	//	名前、年齢、身長、体重を指定して初期化
	Person(String name, int age, double height, double weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		totalCount++;
	}

	//	BMIを計算するメソッド
	double bmi() {
		double calculatedBMI = weight / (height * height);
		return Math.floor(calculatedBMI);
	}

	//	データを表示するメソッド
	void print() {
		System.out.println(this.name);
		System.out.println(this.age);
		System.out.println(this.height);

		System.out.println("名前は" + this.name + "です");
		System.out.println("年は" + this.age + "才です");
		System.out.println("BMIは" + this.bmi() + "です");
	}

	//	インスタンス数を取得
	public static int getTotalCount() {
		return totalCount;
	}
}