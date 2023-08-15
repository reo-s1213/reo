package processing;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Processing {
	private String country = "日本";
	private String food = "寿司";
	private String foodType = "和食";
	private Date currentDate = new Date();

	public void printMessage() {
		System.out.println("こんにちは！ここは" + this.country + "です！");
		System.out.println("この" + this.food + "はうまい！");
		System.out.println(this.food + "は" + this.foodType + "です");

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		String formattedDate = sdf.format(this.currentDate);
		System.out.println("今の現在時刻は" + formattedDate + "です");
	}
}
