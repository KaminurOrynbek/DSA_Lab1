package week2Laboratory1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        averageValue();
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


}




