public class Main {
    public static int countEvenNum(int[] arr, int size) { // Creates a method (aka a function) called countEvenNum that returns an integer
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (arr[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] x) { // Necessary for some reason
        int n = 5;
        int[] foo = {0, 1, 2, 3, 4};

        int m = 100; // Makes a variable with value of 100
        int[] renamed = new int[m]; // Makes an empty array of size n
        for (int i = 0; i < m; i++) {
            renamed[i] = i;
        } // A for loop, which assigns values from 0-99 in the array renamed[]

        System.out.println("The total number of even numbers in foo are: " + countEvenNum(foo, n)); // Prints the return value of countEvenNum
        System.out.println("The total number of even numbers in renamed are: " + countEvenNum(renamed, m));
        // Is there another way to use the print function?
    }
}
