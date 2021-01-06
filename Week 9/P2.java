import java.util.*;

public class P2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first String");
		String str1 = sc.nextLine();
		str1 = str1.toLowerCase();
		System.out.println("Enter the second String");
		String str2 = sc.next();
		char arr[] = new char[256];
		for (int i = 0; i < str2.length(); i++) {
			arr[str2.charAt(i)]++;
		}
		String str = "";
		for (int i = 0; i < str1.length(); i++) {
			if (arr[str1.charAt(i)] == 0) {
				str += str1.charAt(i);
			}
		}
		System.out.println(str.trim());
	}
}