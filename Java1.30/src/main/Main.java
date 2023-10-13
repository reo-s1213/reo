package main;

public class Main {
    public static void main(String[] args) {
        person person1 = new person("鈴木太郎", 20, 1.7, 60.0);
        person person2 = new person("山田花子", 25, 1.6, 55.0);
   
        person1.print();
        person2.print();
        
        System.out.println("合計" + person.getTotalCount() + "人です");
    }
}
