import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int X=sc.nextInt(),Y=sc.nextInt(),A=sc.nextInt(),B=sc.nextInt(),N=sc.nextInt();
        if(((X-A)+(Y-B))>N){
            if(X>A&&Y>B){
                while(X>A||Y>B){
                    X--;Y--;
                }
                System.out.println(Math.abs(X-Y));
            }
            else{
                System.out.println(Math.abs(X-Y));
            }
        }
        else{
            System.out.println("Condition not satified");
        }
    }
}
