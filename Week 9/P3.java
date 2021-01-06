import java.util.*;

public class P3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int decimal[] = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
		String symbols[] = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
		System.out.println("Enter the number");
		int num = sc.nextInt();
		String romannum = "";
		int j = 0;
		for (int i : decimal) {
			while (num >= i) {
				romannum += symbols[j];
				num -= i;
			}
			++j;
		}
		System.out.println(romannum);
	}
}
