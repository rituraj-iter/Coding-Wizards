public class Q6 {
	public static boolean checkprime(int n) {
		for(int i=3;i<=Math.sqrt(n);i+=2) {
			if(n%i==0)
				return false;
		}
		return true;
	}
	public static void main(String args[]) {
		int n=2;
		int prime=3;
		int pnext=3;
		while(n<=10001) {
			if(checkprime(prime)) {
				n++;
			}
			pnext=prime;
			prime+=2;
		}
		System.out.println(pnext);
	}
}