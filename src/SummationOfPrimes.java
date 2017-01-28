public class SummationOfPrimes {

public static void main(String[] args) {
// TODO Auto-generated method stub

	long n = 5;
	long c = ((n + 1)/2);
	long answer = 5;
	while(n <= 1000000){
		if(c == 1){
			answer += n;
			n += 2;
			c = ((n + 1)/2);
			c += 1 + (c % 2);
		}
		else if(n % c != 0){
			c += -2;
		}
		else if(n % c == 0){
			n += 2;
			c = ((n + 1)/2);
			c += 1 + (c % 2);
		}
	}
	System.out.print(answer);
	
}
}


