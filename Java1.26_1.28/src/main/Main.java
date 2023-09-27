package main;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		//		コンソールからの入力を受け付けるためのScanner
		Scanner scanner = new Scanner(System.in);
		System.out.println("コンソールに文字を入力してください");
		String input = scanner.nextLine();
		//		入力文字列をカンマで区切り動物の情報を含む配列に格納
		String[] animalData = input.split(",");
		//		各動物の情報を処理
		for (String data : animalData) {
			//			各動物の情報をコロンで分け名前、体重、速度に分ける
			String[] animalInfo = data.split(":");
			String name = animalInfo[0];
			double length = Double.parseDouble(animalInfo[1]);
			int speed = Integer.parseInt(animalInfo[2]);
			//			動物の情報を表示
			System.out.println("動物名:" + name);
			System.out.println("体長:" + length + "m");
			System.out.println("速度:" + speed + "km/h");
			//			動物の学名を取得して表示
			String animalName = getAnimalName(name);
			System.out.println("学名:" + animalName);
		}
		//		Scannerを閉じる
		scanner.close();

	}

	//	動物名から学名を取得するメソッド
	private static String getAnimalName(String animalName) {
		switch (animalName) {
		case "ライオン":
			return "パンテラ レオ";
		case "ゾウ":
			return "ロキソドンタ・サイクロティス";
		case "パンダ":
			return "アイルロポダ・メラノレウカ";
		case "チンパンジー":
			return "パン・トゥログロディテス";
		case "シマウマ":
			return "チャップマンシマウマ";
		case "インコ":
			return "不明";
		default:
			return "不明";
		}
	}
}