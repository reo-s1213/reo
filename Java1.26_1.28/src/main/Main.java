package main;

import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("コンソールに文字を入力してください");
		String input = scanner.nextLine();
		
		String[] animalData = input.split(",");
		
		for (String data :animalData) {
			String[] animalInfo = data.split(":");
			String name = animalInfo[0];
			double length = Double.parseDouble(animalInfo[1]);
			int speed = Integer.parseInt(animalInfo[2]);
			
			System.out.println("動物名:" + name);
			System.out.println("体長:" + length + "m");
			System.out.println("速度:" + speed + "km/h");
			
			String animalName = getAnimalName(name);
			System.out.println("学名:" + animalName);
		}
		
		scanner.close();
		
	}
	
	private static String getAnimalName(String animalName) {
		switch(animalName) {
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