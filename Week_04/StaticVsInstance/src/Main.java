public class Main {

    public static void main(String[] args) {

        Dog otto = new Dog("Otto", "Boxer", 11);
        Dog luna = new Dog("Luna", "Husky", 6);
        Dog bear = new Dog("Bear", "Pomeranian Mix", 12);
        Dog ollie = new Dog("Ollie", "Boxer", 3);
        Dog teddy = new Dog("Teddy", "Poodle", 2);

        otto.bark(); // instance call

        System.out.println("Total dogs created: " + Dog.getTotalDogs());

    }
}