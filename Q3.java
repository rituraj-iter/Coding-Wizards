public class Q3 {
    public static void main(String[] args) {
        long p_num;
        long p_num_len=0;
        long startingNumber=0;
    for (long i = 2; i<=1000000;i++) {
        long len=1;
        p_num=i;
    while (p_num!= 1) {
        if ((p_num % 2)==0) {
            p_num=p_num/2;
        } else {
            p_num=p_num*3+1;
        }
        len++;
    }
    if (len>p_num_len) {
        p_num_len = len;
        startingNumber = i;
    }
}
System.out.println(startingNumber);
    }
}
