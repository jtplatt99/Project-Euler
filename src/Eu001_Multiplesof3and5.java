
public class Multiplesof3and5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int j = 0;
		int i = 0;
		while (i <= 1000){
			if (i % 3 == 0) {
				j += i;
				System.out.println(i);
			}else if (i % 5 == 0){
				j += i;
				System.out.println(i);}
			i += 1;
		}
		System.out.println(j);
	}
}