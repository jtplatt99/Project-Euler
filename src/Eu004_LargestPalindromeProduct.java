
public class LargestPalindromeProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		double dsredgt = 7;
		double number = 1204958;
		System.out.print((number % Math.pow(10, (dsredgt + 1)) - number % Math.pow(10, dsredgt))/Math.pow(10, dsredgt));
		*/
		double answer = 0;
		double i = 400;
		double j = 400;
		while(i < 1000){
			while(j < 1000){
				double number = i * j;
				double dsredgt = 0;
				double a = (number % Math.pow(10, (dsredgt + 1)) - number % Math.pow(10, dsredgt))/Math.pow(10, dsredgt);
				dsredgt = 1;
				double b = (number % Math.pow(10, (dsredgt + 1)) - number % Math.pow(10, dsredgt))/Math.pow(10, dsredgt);
				dsredgt = 2;
				double c = (number % Math.pow(10, (dsredgt + 1)) - number % Math.pow(10, dsredgt))/Math.pow(10, dsredgt);
				dsredgt = 3;
				double d = (number % Math.pow(10, (dsredgt + 1)) - number % Math.pow(10, dsredgt))/Math.pow(10, dsredgt);
				dsredgt = 4;
				double e = (number % Math.pow(10, (dsredgt + 1)) - number % Math.pow(10, dsredgt))/Math.pow(10, dsredgt);
				dsredgt = 5;
				double f = (number % Math.pow(10, (dsredgt + 1)) - number % Math.pow(10, dsredgt))/Math.pow(10, dsredgt);
				if(a == f && b == e && c == d){
					
					if(number > answer){
						answer = number;
						System.out.print(answer+System.lineSeparator());
					}
				}
				j += 1;
			}
		i += 1;
		j = 400;
		}
	}
		
}
