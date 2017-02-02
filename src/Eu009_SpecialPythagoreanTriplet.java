
public class Eu009_SpecialPythagoreanTriplet {

public static void main(String[] args) {
	// TODO Auto-generated method stub

	double a = 1;
	double b = 1;
	while(a < 1000){
		while(b < 1000){
			double c = Math.sqrt(a*a + b*b);
			//System.out.println(a+b+c);
			if(a+b+c==1000.0){
				System.out.println(a);
				System.out.println(b);
				System.out.println(c);
				System.out.println(a*b*c);}
			b += 1;
		}
	a += 1;
	b = a;
	}
	
}

}
