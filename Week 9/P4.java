import java.util.*;

public class P4 {
	public static void printvalue(int n) {
		int a = (n / 2);
		for (int i = 1; i <= n - 1; i++) {
			System.out.print(a);
			if (i <= (n / 2) - 1) {
				a--;
			} else {
				a++;
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of column odd only");
		int n = sc.nextInt(), a = 2, b = n / 2;
		if (n % 2 != 0) {
			for (int i = 1; i <= n; i++) {
				for (int j = 1; j <= b; j++) {
					System.out.print(" ");
				}
				printvalue(a);
				if (i <= n / 2) {
					--b;
					a += 2;
				} else {
					++b;
					a -= 2;
				}
				System.out.println();
			}
		} else {
			System.out.println("Even numbers of colums are enterd");
		}
	}
}
