public class Dog {

    // fields
    String name;
    String breed;
    String color;
    int age;


    // constructor
    public Dog(String name, String breed, String color, int age) {
        this.name = name;
        this.breed = breed;
        this.color = color;
        this.age = age;
    }


    // method
    public void woof() {
        System.out.println(name + " is a " + color + " " + breed + ". They're " + age + " years old!");
    }

}
