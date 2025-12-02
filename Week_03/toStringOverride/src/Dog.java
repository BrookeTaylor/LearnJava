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



    // toString Override
    @Override
    public String toString() {
        return "Dog{name = '" + name + "', breed = '" + breed + "', age = " + age + " }";
    }

}