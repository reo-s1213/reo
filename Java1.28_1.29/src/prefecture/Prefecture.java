package prefecture;

public class Prefecture {
	private String data;

	//    都道府県テータを指定して初期化
	public Prefecture(String data) {
		this.data = data;
	}

	//    都道府県名を取得
	public String getName() {
		return data.split(":")[0];
	}

	//   県庁所在地を取得
	public String getCapital() {
		return data.split(":")[1];
	}

	//    面積を取得
	public double getArea() {
		return Double.parseDouble(data.split(":")[2]);
	}

	@Override
	public String toString() {
		return "都道府県名：" + getName() + "\n県庁所在地：" + getCapital() + "\n面積：" + getArea() + "km2";
	}
}
