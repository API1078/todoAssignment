package testDemoExample;

public class Divisible {
	public String isDivisible(int n) {
		if(n % 3 == 0 && n % 5 == 0 && n % 7 == 0) return n + " is divisible by 3,5 and 7";
		else if(n % 3 == 0 && n % 5 == 0) return n + " is divisible by 3 and 5";
		else if(n % 3 == 0 && n % 7 == 0) return n + " is divisible by 3 and 7";
		else if(n % 5 == 0 && n % 7 == 0) return n + " is divisible by 5 and 7";
		else if(n % 3 == 0) return n + " is divisible by 3";
		else if(n % 5 == 0) return n + " is divisible by 5";
		else if(n % 7 == 0) return n + " is divisible by 7";
		else return "Not Divisible bt 3,5 or 7";
	}
}
