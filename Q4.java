import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a date: ");
        int d=sc.nextInt();
        String suff=sc.next();
        String m=sc.next();
        int y=sc.nextInt();
        int d_feb;
        int d_year=d;
        if ((y% 4 == 0 && y % 100 != 0 ) || (y % 400 == 0)){
            d_feb=29;
        }
        else{
            d_feb=28;
        }
        switch(m){
        case "February":
            d_year += 31;
            break;
        case "March":
            d_year += 31+d_feb;
            break;
        case "April":
            d_year += 31+d_feb+31;
            break;
        case "May":
            d_year += 31+d_feb+31+30;
            break;
        case "June":
            d_year += 31+d_feb+31+30+31;
            break;
        case "July":
            d_year += 31+d_feb+31+30+31+30;
            break;            
        case "August":
            d_year += 31+d_feb+31+30+31+30+31;
            break;
        case "September":
            d_year += 31+d_feb+31+30+31+30+31+31;
            break;
        case "October":
            d_year += 31+d_feb+31+30+31+30+31+31+30;            
            break;            
        case "November":
            d_year += 31+d_feb+31+30+31+30+31+31+30+31;            
            break;                        
        case "December":
            d_year += 31+d_feb+31+30+31+30+31+31+30+31+30;            
            break;               
        }
        System.out.println(d_year);
    }
}
