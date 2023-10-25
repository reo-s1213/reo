package main;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("鈴木太郎", 20, 1.7, 60.0);
        Person person2 = new Person("山田花子", 25, 1.6, 55.0);
   
        person1.print();
        person2.print();
        
        System.out.println("合計" + Person.getTotalCount() + "人です");
    }
}
