package testDemoExample;

public class PrimeNumber {
	
	public String isPrime(int n) {
		
		if(n <= 1) return "Number should be greater than 1";
		else {
			for(int i = 2; i < n; i++) {
				if(n % i == 0) return "Number is not Prime";	
			}
			return "Number is a Prime";
		}
		
	}

}
