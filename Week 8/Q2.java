//Rituraj Gupta CSE L 2023
import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int temp=sc.nextInt(),d_open=sc.nextInt(),time_on=sc.nextInt();
        int currpurifed=0;
        int i=0;
        if(temp>=25){
            i=temp-25;
            currpurifed=((40+(i*2))*(time_on))-(d_open*10);
        }
        else{
            i=25-temp;
            System.out.println(i);
            currpurifed=((40-(i*2))*(time_on))-(d_open*10);
        }
        System.out.println("Purifier purifies "+currpurifed+" sq/min with the given conditions");
    }
}
