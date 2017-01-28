
public class LargestPrimeFactor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long number = 600851475143L;
		
		long i = 1L;
		long s = 2L;
		while(i <= number){
			if(number % i == 0){
				while(s <= i){
					if (i == s){
						System.out.println(i);
						number = number / i;
						break;
					}else if (i % s == 0){
						s = 2;
						break;}
				s += 1;
				}
			}else{}
		i += 2;
		}
	}

}
