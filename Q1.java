import java.util.*;
public class Q1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String dna=sc.nextLine();
        sc.close();
        String comp = "";
 for (int k=0;k<dna.length();k++){
        if (dna.charAt(k) == 'A'){
            comp = comp + 'U';}
        else if (dna.charAt(k) == 'T'){
            comp = comp + 'A';}
        else if (dna.charAt(k) == 'C'){
            comp = comp + 'G';}
        else if (dna.charAt(k) == 'G'){
            comp = comp + 'C';}
        }
        if(dna.length()==comp.length())
            System.out.println(comp);
        else
            System.out.println("Invalid Input");
        }
}
