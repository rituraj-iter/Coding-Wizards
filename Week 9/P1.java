import java.util.*;

public class P1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elemets");
        int arr[] = new int[sc.nextInt()];
        System.out.println("Enter the elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the sum");
        int sum = sc.nextInt();
        Arrays.sort(arr);
        for (int i = 0; i <= arr.length - 3; i++) {
            int j = sum - arr[i];
            int m = i + 1;
            int n = arr.length - 1;
            while (m < n) {
                if (arr[m] + arr[n] < j) {
                    m++;
                } else if (arr[m] + arr[n] > j) {
                    n--;
                } else {
                    System.out.println(arr[i] + ", " + arr[m] + ", " + arr[n]);
                    m++;
                    n--;
                }
            }
        }
    }
}