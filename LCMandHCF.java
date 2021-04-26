package testDemoExample;

public class LCMandHCF {
	public int getLCM(int a, int b, int c) {
		int prod = a * b * c;
		for(int i = 2; i <= prod; i++) {
			if(i % a == 0 && i % b == 0 && i % c == 0) return i;
		}
		return prod;
	}
	public int getHCF(int a, int b, int c) {
		int prod = a * b * c;
		for(int i = 2; i <= prod; i++) {
			if(a % i == 0 && b % i == 0 && c % i == 0) return i;
		}
		return prod;
	}
}
