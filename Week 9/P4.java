import java.util.*;

public class P4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of column");
		int n = sc.nextInt(), num = 2, a = n / 2;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= a; j++) {
				System.out.print(" ");
			}
			int ilp = (num / 2);
			for (int k = 1; k <= num - 1; k++) {
				System.out.print(ilp);
				if (k <= (num / 2) - 1) {
					ilp--;
				} else {
					ilp++;
				}
			}
			if (i <= n / 2) {
				--a;
				num += 2;
			} else {
				++a;
				num -= 2;
			}
			System.out.println();
		}
	}
}