import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // shelter list
        ArrayList<Dog> shelterDogs = new ArrayList<>();


        // dogs in shelter
        shelterDogs.add(new Dog("Mochi", "Corgi", "Tan", 3));
        shelterDogs.add(new Dog("Bailey", "Golden Retriever", "Golden", 5));
        shelterDogs.add(new Dog("Shadow", "German Shepherd", "Black/Tan", 7));
        shelterDogs.add(new Dog("Pepper", "Australian Shepherd", "Merle", 3));
        shelterDogs.add(new Dog("Maple", "Shiba Inu", "Red", 2));
        shelterDogs.add(new Dog("Rex", "Pitbull", "Blue", 4));
        shelterDogs.add(new Dog("Biscuit", "Beagle", "Tri-Color", 6));
        shelterDogs.add(new Dog("Nova", "Border Collie", "Black/White", 1));
        shelterDogs.add(new Dog("Tank", "Rottweiler", "Black/Rust", 8));
        shelterDogs.add(new Dog("Piper", "Dalmatian", "White/Black Spots", 3));
        shelterDogs.add(new Dog("Hazel", "Pomeranian", "Cream", 4));
        shelterDogs.add(new Dog("Goose", "Great Dane", "Harlequin", 5));
        shelterDogs.add(new Dog("Nori", "Akita", "White", 6));



        // print dogs in shelter
        printAllDogs(shelterDogs);


        // find by name : Goose
        System.out.println("\nLooking for Goose");
        Dog found = findDogByName(shelterDogs, "Goose");

        if (found != null) {
            System.out.println("Found: " + found);
        } else {
            System.out.print("Dog not found.");
        }



        // find by oldest
        System.out.println("\nFinding the oldest dog...");
        Dog oldest = findOldestDog(shelterDogs);

        if (oldest != null) {
            System.out.println("Oldest dog: " + oldest);
        }




        // remove dog
        System.out.println("\nRemoving Mochi from the shelter...");
        boolean removed = removeDogByName(shelterDogs, "Mochi");

        if (removed) {
            System.out.println("Mochi was adopted! Updated list:");
        } else {
            System.out.println("Mochi was not found in the shelter.");
        }

        printAllDogs(shelterDogs);



    }


    // print all dogs
    static void printAllDogs(ArrayList<Dog> dogs) {
        for (Dog d : dogs) {
            System.out.println(d);
        }
    }

    // find dog by name
    static Dog findDogByName(ArrayList<Dog> dogs, String name) {
        for (Dog d : dogs) {
            if (d.name.equalsIgnoreCase(name)) {
                return d;
            }
        }
        return null;
    }



    static Dog findOldestDog(ArrayList<Dog> dogs) {
        if (dogs.isEmpty()) {
            return null;
        }

        Dog oldest = dogs.get(0);

        for (Dog d : dogs) {
            if (d.age > oldest.age) {
                oldest = d;
            }
        }

        return oldest;
    }




    static boolean removeDogByName(ArrayList<Dog> dogs, String name) {
        // loop through all dogs
        for (int i = 0; i < dogs.size(); i++) {
            Dog d = dogs.get(i);
            if (d.name.equalsIgnoreCase(name)) {
                dogs.remove(i);
                return true;
            }
        }
        return false;
    }







}