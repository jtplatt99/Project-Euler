
public class Eu005_SmallestMultiple {

public static void main(String[] args) {
		// TODO Auto-generated method stub

	int n = 1;
	int c = 0;
	Outer:
	while(true){
		int i = 4;
		c = 0;
		while(c == 0){
			c = n % i;
			i += -1;
			//System.out.println(i);
			if(i == 0){
				break Outer;
			}
		}
	n +=1;
	//System.out.println(n);
	}
	System.out.println(n);
}

}
