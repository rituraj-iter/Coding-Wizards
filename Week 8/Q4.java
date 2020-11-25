//Rituraj Gupta CSE L 2023
import java.util.Scanner;
public class Q4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[][]=new int[n][n];
        for(int i=0;i<n;i++){
            arr[i][i]=1;
        }
        for(int i=0;i<n;i++){
            arr[i][n-i-1]=1;
        }
        if(n%2!=0){
            arr[n/2][0]=1;
            arr[0][n/2]=1;
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
