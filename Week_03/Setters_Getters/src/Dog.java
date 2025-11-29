public class Dog {

    // private fields
    private String name;
    private String breed;
    private String color;
    private int age;

    // constructor
    public Dog(String name, String breed, String color, int age) {
        this.name   = name;
        this.breed  = breed;
        this.color  = color;
        this.age    = age;
    }

    // getters
    public String getName() { return name; }
    public String getBreed() { return breed; }
    public String getColor() { return color; }
    public int getAge() { return age; }

    // setters
    public void setName(String name) {
        if (name != null && !name.isBlank()) this.name = name;
    }

    public void setBreed(String breed) {
        if (breed != null && !breed.isBlank()) this.breed = breed;
    }

    public void setColor(String color) {
        if (color != null && !color.isBlank()) this.color = color;
    }

    public void setAge(int age) {
        if (age >= 0 && age <= 30) this.age = age; // dogs don't live past ~30
    }

    // method
    public void woof() {
        System.out.println(name + " is a " + color + " " + breed + ". They're " + age + " years old!");
    }
}
