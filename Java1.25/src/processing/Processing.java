package processing;

public class Processing {
	//	キャラの名前を保持するフィールド
	private String name;
	//	キャラのHPを保持するフィールド
	private int hp;
	//	キャラのMPを保持するフィールド
	private int mp;
	//	キャラの攻撃力を保持するフィールド
	private int attack;
	//	キャラの素早さを保持するフィールド
	private int agility;
	//	キャラの防御力を保持するフィールド
	private int defence;

	//	キャラの名前を指定して初期化
	public Processing(String name) {
		this.name = name;
		//		それぞれランダムな値で初期化
		this.hp = generateRandomValue();
		this.mp = generateRandomValue();
		this.attack = generateRandomValue();
		this.agility = generateRandomValue();
		this.defence = generateRandomValue();

	}

	//	ランダムな値を生成するメソッド
	private int generateRandomValue() {
		return (int) (Math.random() * 1000) + 1;
	}

	//	キャラの情報を表示するメソッド
	public void displayInfo() {
		System.out.println("こんにちは" + name + "さん");
		System.out.println("ステータス");
		System.out.println("HP:" + hp);
		System.out.println("MP:" + mp);
		System.out.println("攻撃力" + attack);
		System.out.println("素早さ" + agility);
		System.out.println("防御力" + defence);
		System.out.println("/nさあ冒険に出かけよう!");
	}

}
