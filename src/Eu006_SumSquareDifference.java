
public class Eu006_SumSquareDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sqs = 0;
		int sum = 0;
		int i = 0;
		while(i <= 100){
			sqs += i * i;
			sum += i;
			i += 1;
		}
		System.out.println(sqs);			
		int ssq = sum * sum;
		System.out.println(ssq);
		System.out.println(ssq - sqs);
		}
	}