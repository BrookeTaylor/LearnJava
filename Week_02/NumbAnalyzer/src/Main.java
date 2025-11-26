public class Main {


    public static int findMax(int[] nums) {

        int max = nums[0];

        for (int num: nums) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static int findMin(int [] nums) {

        int min = nums[0];

        for (int num: nums) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    public static double findAverage(int[] nums) {

        int sum = 0;

        for (int num: nums) {
            sum += num;
        }
        return (double) sum / nums.length;
    }



    public static void main(String[] args) {

        int[] numbers = {4, 9, 2, 17, 6, 10};


        System.out.println("Max: " + findMax(numbers));
        System.out.println("Min: " + findMin(numbers));
        System.out.println("Avg: " + findAverage(numbers));


    }
}