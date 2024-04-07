package week2Laboratory1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    }

    /* Function finds and prints the minimum element in an array: defines first element
     as minimum, then compares it with each element until finds the minimum
     Time Complexity: O(n)
     */
    public static void minFinder() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int min = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] < min)
                min = arr[i];
            }
        System.out.println(min);
        }

    /* Function finds and prints average of elements in an array: defines sum as 0
    and adds each iteration to each element of array and in the last divides sum to n.
    Time complexity: O(n)
    */
    public static void averageValue() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Double[] arr = new Double[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextDouble();
        }
        Double sum = 0.0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        double average = sum / n;
        System.out.println(average);

    }

    /* Function checks whether the number is prime or not. It checks each iteration
    starting from 2 until number itself is this number divides to the iteration.
    If it is true loop breaks, otherwise this number is prime. Also, we can consider only half of number.
    Because, if the first half isn't composite, the other half too and vice versa.
    Time complexity: 0(n)
    */
    public static void isPrime() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isPrime = true;
        for (int i = 2; i < n/2; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println("Prime");
        } else {
            System.out.println("Composite");
        }
    }

    /* Function uses recursion to find a factorial of given number by multiplying number and subtracting 1 each time
    Time complexity: 0(n)
     */
    public static void factorial() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(factorialPrivate(n));
    }
    // by this private function we can avoid calling parameterized function above when we call it in main method
    private static int factorialPrivate(int n) {
        // Base case: factorial of 0 or 1 is 1
        if (n <= 1) {
            return 1;
        } else {
            // Recursive call to compute factorial of n-1
            return n * factorialPrivate(n - 1);
        }
    }

    /* Function finds n-th elements in Fibonacci sequence by giving number n and this function uses recursion.
    Time complexity: 0(2^n)
    */
    public static void fibonacci() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fibonacciPrivate(n));
    }
    // by this private function we can avoid calling parameterized function above when we call it in main method
    private static int fibonacciPrivate(int n) {
        // base case: the first elements of Fibonacci sequence is 0,1
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        else
            // recursion: addition of previous element and previous element of the previous
            return fibonacciPrivate(n - 1) + fibonacciPrivate(n - 2);
    }

    /* Function returns a^n by giving a and power n using recursion
    Time complexity: 0(n)
    */
    public static void power() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(powerPrivate(a,n));
    }
    // by this private function we can avoid calling parameterized function above when we call it in main method
    private static int powerPrivate(int a, int n) {
        // base case
        if (n == 0) {
            return 1; // Any number raised to the power of 0 is 1
        } else {
            return a * powerPrivate(a, n - 1); // Recursively multiply 'a' by itself 'n' times
        }
    }

    /* The reversed function takes user input to determine the size of the array
     and then calls the reversedPrivate function to print the elements of the array in reverse order.
    The reversedPrivate function recursively prints the elements of the array in reverse order until it
     reaches the base case where n is less than or equal to 1.
     Time complexity: O(n)
    */
    public static void reversed() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        reversedPrivate(n, arr);
    }
    private static void reversedPrivate(int n, int[] arr) {
        if (n <= 0) {
            return;
        }
        System.out.print(arr[n - 1] + " ");
        reversedPrivate(n - 1, arr);
    }

    /* */


}






