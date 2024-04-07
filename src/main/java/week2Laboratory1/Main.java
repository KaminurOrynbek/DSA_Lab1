package week2Laboratory1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        isPrime();
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
    and each iteration adds each element of array and in the last divides sum to n.
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

}






