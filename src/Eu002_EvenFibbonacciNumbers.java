
public class Eu002_EvenFibbonacciNumbers{
	public static void main(String[] args) {

	int max = 4000000;
	int f = 1;
	int s = 2;
	int t = 2;
	while(t <= max){
		f += s; 
		if(f % 2 == 0){
			t += f;}
		s += f;
		if(s % 2 == 0){
			t += s;}
	}
	System.out.println(t);
	}
}
