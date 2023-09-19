package processing;

public class Processing {

	//	動物の名前を表すフィールド
	private String name;
	//	動物の長さを表すフィールド
	private double length;
	//	動物の速さを表すフィールド
	private double speed;

	//	名前を設定するメソッド
	public void setName(String name) {
		this.name = name;
	}

	//	長さを設定するメソッド
	public void setLength(double length) {
		this.length = length;
	}

	//	速さを設定するメソッド
	public void setSpeed(double speed) {
		this.speed = speed;
	}

	//	名前を取得するメソッド
	public String getName() {
		return name;
	}

	//	長さを取得するメソッド
	public double getLength() {
		return length;
	}

	//	速さを取得するメソッド
	public double getSpeed() {
		return speed;
	}
}
