public class Main {
    public static void main(String[] args) {

        String[] cars = {"Ford", "Chevy", "Jeep", "Dodge"};
        System.out.println("\nMy favorite car is the " + cars[3] + ".");

        System.out.println("\nPrinting all listed \"cars\" in the Array.");
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }


        System.out.println("\nPrinting every other \"car(s)\" in the Array.");
        for (int x = 0; x < cars.length; x += 2) {
            System.out.println(cars[x]);
        }


    }
}