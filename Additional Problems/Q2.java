import java.util.Scanner;
public class Q2 {
    static void pos(String finalexp) { 
        int c1 = 0, c2 = 0, c3 = 0, c4 = 0;
        finalexp=finalexp.toLowerCase();  
        String arr[]=finalexp.split("\\s");
        for (String str:arr) { 
            if (str.equals("north"))
                c1++; 
            else if (str.equals("south")) 
                c2++;    
            else if (str.equals("west")) 
                c3++;  
            else if (str.equals("east")) 
                c4++; 
        } 
        int x =c4 - c3;
        int y=c1 - c2; 
        if(x==0&&y==0){
            System.out.println("Travelling wasted");
        }
        else{
            System.out.println(Math.abs(x)+Math.abs(y));
        }
    } 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String finalexp="";
        for(int i=1;i<=4;i++){
            String str=sc.next();
            finalexp+=str+" ";
        }
        pos(finalexp);
    }
}
