package processing;

public class Processing {
	private String name;
	private int hp;
	private int mp;
	private int attack;
	private int agility;
	private int defence;
	
	public Processing(String name) {
		this.name = name;
		this.hp = generateRandomValue();
		this.mp = generateRandomValue();
		this.attack = generateRandomValue();
		this.agility = generateRandomValue();
		this.defence = generateRandomValue();
		
	}
	
	private int generateRandomValue() {
		return (int)(Math.random()*1000) + 1;
	}
	
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
