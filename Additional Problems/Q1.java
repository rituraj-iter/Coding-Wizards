import java.util.Scanner;

public class Q1{
    public static int fact(int n){
        int f=1;  
        for(int i=1;i<=n;i++){    
            f=f*i;    
        }   
        return f; 
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println(fact(i)+"/ "+i*i);
        }
    }
}