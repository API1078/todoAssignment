package testDemoExample;

public class EvenOrOdd {
	
	public String isEvenOrOdd(int n) {
		if(n == 0) return "Zero is neither Even nor Odd";
		else {
			if(n % 2 == 0) return "Number is Even";
			else return "Number is Odd";
		}
	}

}
