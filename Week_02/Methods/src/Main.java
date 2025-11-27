public class Main {

    public int addNumb(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args) {

        int numb1 = 25;
        int numb2 = 15;

        Main obj = new Main();

        int result = obj.addNumb(numb1, numb2);
        System.out.println("Sum is: " + result);
    }
}