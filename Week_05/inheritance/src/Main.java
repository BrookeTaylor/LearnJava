public class Main {

    public static void main(String[] args) {

        Dog otto = new Dog();
        otto.name = "Otto";

        Cat bandit = new Cat();
        bandit.name = "Bandit";

        System.out.println(otto.name + " says " + otto.bark());
        System.out.println(bandit.name + " says " + bandit.meow());


    }
}