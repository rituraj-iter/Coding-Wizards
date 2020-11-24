import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String s="";
        int i, len=str.length();
        char c, ch;
        for(i = 0; i < len; i++) {
         c = str.charAt(i);
         switch(c) {
            case 'a':
            case 'A':
            case 'e':
            case 'E':
            case 'i':
            case 'I':
            case 'o':
            case 'O':
            case 'u':
            case 'U':
               break;
            default:
               s=s+c;
         }
      }
      if(str.equals(s)){
          System.out.println("The string consists of no vowels.");
      }
      else{
        System.out.println(s);
      }
    }
}