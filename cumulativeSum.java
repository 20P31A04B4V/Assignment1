import java.util.Arrays;
import java.util.Scanner;

public class cumulativeSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

      
        System.out.println("Enter array elements: ");
        for (int i = 0; i < n; ++i) {
            arr[i] = sc.nextInt();
        }
        int cumulativesum[] = cumulativesum(arr);
        System.out.println("Cumulative sum : " + Arrays.toString(cumulativesum));
        sc.close();
    }

    
    public static int[] cumulativesum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];  
            arr[i] = sum; 
        }

        return arr;
    }
}