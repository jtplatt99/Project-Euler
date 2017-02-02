
public class Eu007_10001stPrime {

public static void main(String[] args) {
// TODO Auto-generated method stub
	
	long n = 5;
	long c = n - 2;
	long i = 3;
	while(i <= 10001){
		if(c == 1){
			System.out.println(n);
			i +=1;
			n += 2;
			c = n - 2;
		}
		else if(n % c != 0){
			c += -2;
		}
		else if(n % c == 0){
			n += 2;
			c = n - 2;
		}
	}
	
}
}