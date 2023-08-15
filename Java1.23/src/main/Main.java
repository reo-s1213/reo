package main;

import processing.Processing;

public class Main {
	public static void main(String[]args) {
		
		Processing lion = new Processing();
		lion.setName("ライオン");
		lion.setLength(2.1);
		lion.setSpeed(80);
		
		System.out.println("動物名:" + lion.getName());
		System.out.println("体調:" + lion.getLength());
		System.out.println("速度:" + lion.getSpeed());
		
	}

}
