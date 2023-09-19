package main;

import processing.Processing;

public class Main {
	public static void main(String[] args) {

		//		Processingクラスのインスタンスを作成し、ライオンの情報を設定
		Processing lion = new Processing();
		//		ライオンの名前を設定
		lion.setName("ライオン");
		//		ライオンの速さを設定
		lion.setLength(2.1);
		//		ライオンの体重を設定
		lion.setSpeed(80);

		//		ライオンの情報を表示
		System.out.println("動物名:" + lion.getName());
		System.out.println("体調:" + lion.getLength() + "m");
		System.out.println("速度:" + lion.getSpeed() + "km/h");

	}

}
