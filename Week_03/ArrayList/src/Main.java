import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Dog otto = new Dog("Otto", "boxer", "fawn", 11);
        Dog luna = new Dog("Luna", "huskey", "black & white", 6);
        Dog ollie = new Dog("Ollie", "boxer", "seal", 3);


        ArrayList<Dog> dogs = new ArrayList<>();
        dogs.add(otto);
        dogs.add(luna);
        dogs.add(ollie);

        for (Dog d : dogs) {
            System.out.println(d);
        }

    }
}