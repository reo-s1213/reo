package main;

import java.util.Scanner;

import processing.Processing;

public class Main {
	public static void main(String[] args) {
//		コンソールからの入力を受け付けるためのスキャナーを作成
		Scanner scanner = new Scanner(System.in);
		System.out.println("名前を入力してください。");
		String name = scanner.nextLine();
//		
		scanner.close();
//		入力された名前でキャラのインスタンスを作成
		Processing processing = new Processing(name);
//		キャラの情報を表示
		processing.displayInfo();
	}

}
