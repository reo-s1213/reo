package main;

class person {
    String name;
    int age;
    double height;
    double weight;
    
    person(String name, int age, double height, double weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }
    
    double bmi() {
        return weight / (height * height);
    }
    
    void print() {
        System.out.println("名前は" + this.name + "です");
        System.out.println("年は" + this.age + "です");
        System.out.println("BMIは" + this.bmi() + "です");
    }

    private static int totalCount = 0;

    void Person(String name, int age, double height, double weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        totalCount++;
    }

    public static int getTotalCount() {
        return totalCount;
    }
}

