public class Dog {

    // instance fields
    String name;
    String breed;
    int age;


    // static field
    static int totalDogs = 0;


    // constructor
    public Dog(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        totalDogs++;
    }


    // instance method
    public void bark() {
        System.out.println(name + " says woof!");
    }


    //static method
    public static int getTotalDogs() {
        return totalDogs;
    }

}
