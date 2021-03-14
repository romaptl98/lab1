
public class CubeDemo {

	public static void main(String[] args) {
		int sum=cubeNum(123);
		System.out.println("cube sum is: "+sum);
	

	}

	private static int cubeNum(int i) {
		int a=i;
		int rem=0;
		int sum=0;
		while(a!=0) {
			rem=a%10;
			sum=sum+(rem*rem*rem);
			a=a/10;
			
		}
		return sum;
		
	}
}
		
	
