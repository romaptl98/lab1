import java.util.Scanner;

public class Traffic {
	
	

	public static void main(String[] args) {
		System.out.println("red --- stop");
		System.out.println("green --- go");
		System.out.println("yellow --- ready");
		System.out.println("----------------");
		System.out.println("1. Red");
		System.out.println("2. Green");
		System.out.println("3. yellow");
		System.out.println("Select the light :");
		Scanner  sc = new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println(num);
		switch(num) {
		case 1:
			System.out.println("stop");
			break;
		case 2:
			System.out.println("go");
			break;
		case 3:
			System.out.println("ready");
			break;
		default:
			System.out.println("invalid operation");
			break;
			
		}
		sc.close();
	}
	
}
		
		
		

	


