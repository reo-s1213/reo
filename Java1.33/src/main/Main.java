package main;

class Main {
	public static void main(String[] args) {

		// Personクラスを使って2つの人物データを生成し、表示

		Person person1 = new Person("鈴木", "太郎", 20, 1.7, 60);
		person1.print();
		Person person2 = new Person("山田", "花子", 22, 1.5, 40);
		person2.print();

		//Personクラスの静的メソッドを呼び出して、生成されたインスタンスの合計数を表示
		Person.printCount();

		// CarクラスとBicycleクラスのインスタンスを生成
		Car car = new Car();
		Bicycle bicycle = new Bicycle();

		//ownerを設定
		car.setOwner(person1.fullName());
		bicycle.setOwner(person2.fullName());

		System.out.println(car.getOwner());
		System.out.println(bicycle.getOwner());

		// 乗り物を購入
		person1.buy(car);
		person2.buy(bicycle);
	}

}