
public class Fibo {

	public static void main(String[] args) {
		generateFibonachi(7);

	}

	private static void generateFibonachi(int i) {
		int fib0=0;
		int fib1=1;
		int count=0;
		while(count<i) {
			System.out.println(fib0 +" ");
			int fib=fib0+fib1;
			fib0=fib1;
			fib1=fib;
			count=count+1;
		}
	
		
	}

}
