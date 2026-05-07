import java.util.Scanner;

public class ArrayOps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        int sum = 0;

        System.out.println("Enter elements:");
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        int max = arr[0], min = arr[0];

        for(int i=0; i<n; i++) {
            if(arr[i] > max) max = arr[i];
            if(arr[i] < min) min = arr[i];
        }

        System.out.println("Elements:");
        for(int i=0; i<n; i++)
            System.out.print(arr[i] + " ");

        System.out.println("\nMax = " + max);
        System.out.println("Min = " + min);
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + (sum/(double)n));

        sc.close();
    }
}
