public class Main {

    public static void main(String[] args) {

        Dog otto = new Dog("Otto", 11, Breed.BOXER);
        Dog ollie = new Dog("Ollie", 3, Breed.BOXER);
        Dog luna = new Dog("Luna", 6, Breed.HUSKEY);

        System.out.println(otto);
        System.out.println(ollie);
        System.out.println(luna);


        System.out.println("\n--- Adoption Flow ---");

        otto.adopt();
        otto.finalizeAdoption();

        System.out.println("\n--- After Adoption ---");
        System.out.println(otto);


        System.out.println("\n--- Status Switch Example ---");
        switch (ollie.getStatus()) {
            case AVAILABLE:
                System.out.println(ollie + " is ready to be adopted at anytime!");
                break;
            case PENDING:
                System.out.println(ollie + " has someone interested!");
                break;
            case ADOPTED:
                System.out.println(ollie + " is living in a new home");
                break;
        }


    }
}