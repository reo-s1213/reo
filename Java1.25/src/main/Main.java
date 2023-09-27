package main;

import processing.Processing;

public class Main {
	public static void main(String[] args) {
		//		Processingクラスのインスタンスを名前で作成
		Processing processing = new Processing("名前");
		Processing Warrior = new Processing("兵士");
		Processing Wizard = new Processing("魔法使い");
		//		キャラの情報を表示
		processing.displayInfo();
		Warrior.displayInfo();
		Wizard.displayInfo();
		
	}

}
