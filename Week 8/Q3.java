//Rituraj Gupta CSE L 2023
import java.util.Scanner;
public class Q3 {
    public static int diff(int X,int Y,int A, int B, int N){
        int n = X-A; 
        X=X-Math.min(N,n); 
        N=N-Math.min(N,n); 
        Y=Y-Math.min(N,(Y-B)); 
        int diff=Math.abs(X-Y); 
        return diff;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int X=sc.nextInt(),Y=sc.nextInt(),A=sc.nextInt(),B=sc.nextInt(),N=sc.nextInt();
        int diff =diff(X,Y,A,B,N) ;
        int c = X;
	    X=Y;
        Y=c;
        int d=A;
	    A=B;
        B=d;
        System.out.println(Math.max(diff, diff(X,Y,A,B,N)));
    }
}
