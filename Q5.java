public class Q5 {
    public static int pali(){
		int pro=0;
		for (int i=999;i>900;i--) {
			for (int j=i;j>900;j--) {
				pro=i*j;
				if(check(pro)) {
					return pro;
				}
			}
		}
		return -1;
	}
		public static int rev(int pro) {
			int r=0;
			int d;
			while(pro>0) {
				d=pro%10;
				r=r*10+d;
				pro/=10;
			}
			return r;
		}
		public static boolean check(int pro) {
			if(rev(pro)==pro) {
				return true;
			}
			return false;
		}
	
	public static void main(String[] args){
		System.out.println(pali());
	}
}
