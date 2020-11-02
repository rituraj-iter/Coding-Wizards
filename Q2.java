import java.util.*;
public class Q2{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int comp, player;
    int point = 1, pointCom = 0, pointPlayer = 0;
    ArrayList<Character> al = new ArrayList<Character>();
    al.add('S');
    al.add('R');
    al.add('P');
    int round=1;
    while(round<=3){
        System.out.println("Enter User Choice");
        char ch = sc.next().charAt(0);
        player = 1 + al.indexOf(ch);
        comp = (1 + (int)(Math.random() * 3));
        if ((comp == 1) && (player == 3)){
            System.out.println("User lose the round.");
            pointCom += point;}
        else if ((comp == 2) && (player == 1)){
            System.out.println("User lose the round.");
            pointCom += point;}
        else if ((comp == 3) && (player == 2)){
            System.out.println("User lose the round.");
            pointCom += point;}
        else if ((comp == 1) && (player == 2)){
            System.out.println("User won the round.");
            pointPlayer += point;}
        else if ((comp == 2) && (player == 3)){
            System.out.println("User won the round.");
            pointPlayer += point;}
        else if ((comp == 3) && (player== 1)){
            System.out.println("User won the round.");
            pointPlayer += point;}
 else if ((comp == 1) && (player == 1)){
            System.out.println("Tie of round.");}
        else if ((comp == 2) && (player == 2)){
            System.out.println("Tie of round.");}
        else if ((comp == 3) && (player == 3)){
            System.out.println("Tie of round.");}
    round++;
        }
    if (pointCom >=2)
        System.out.println("3 Rounds over, Computer scored ,"+ pointCom+ "Computer won the game.");
    else if (pointPlayer >= 2)
        System.out.println("3 Rounds over, User scored ,"+ pointPlayer+ "User won the game.");
        else
        System.out.println("Match Tied");
}
}       
