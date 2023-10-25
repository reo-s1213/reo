package main;

//人物データを表現するクラス
class Person {
	public static int count = 0;
	public String firstName;
	public String lastName;
	public int age;
	public double height, weight;

	//	姓、名、年齢、身長、体重を指定して初期化
	Person(String firstName, String lastName, int age, double height, double weight) {
		Person.count++;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}

	// フルネームを生成するメソッド
	public String fullName() {
		return this.firstName + this.lastName;
	}

	// データを表示するメソッド
	public void print() {
		System.out.println("名前は" + this.fullName() + "です");
		System.out.println("年は" + this.age + "です");
	}

	// BMI（Body Mass Index）を計算するメソッド
	public double bmi() {
		return this.weight / this.height / this.height;
	}

	//	生成されたインスタンスの合計数を表示
	public static void printCount() {
		System.out.println("合計" + Person.count + "人です");

	}

	// インスタンスメソッドbuyを定義
	public void buy(Car car) {
		car.setOwner(this.fullName());
		System.out.println(car.getOwner() + "が購入しました");
	}

	//	インスタンスメソッド buy を定義
	public void buy(Bicycle bicycle) {
		bicycle.setOwner(this.fullName());
		System.out.println(bicycle.getOwner() + "が購入しました");
	}
}
