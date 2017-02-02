import java.util.ArrayList;
import java.util.List;

public class Eu010_SummationOfPrimes {

public static void main(String[] args) {
// TODO Auto-generated method stub

	long answer = 2;
	int i = 0;
	long n = 3;
	List<Long> primes = new ArrayList<Long>();
	primes.add(2L);
	while(n <= 2000000){
		if(i == 0){
			answer += n;
			primes.add(n);
			//System.out.println(n);	//Debug code
			i = primes.size()-1;
			n += 2;
		}
		else if(n % primes.get(i) != 0){
			i += -1;
		}
		else if(n % primes.get(i) == 0){
			n += 2;
		}
	}
	System.out.print("The answer is " + answer);
}
}


