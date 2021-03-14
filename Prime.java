import java.util.Scanner;

public class Prime {

	private static Scanner sc;

	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		int i=0; //to count till n
		int num=0;//for division
		String primenumber="";//no. of terms
		System.out.println("enter number :");
		int n=sc.nextInt();
		for(i=1;i<=n;i++) {
			int count=0;//count no of term
			for(num=i;num>=1;num--) {
				if(i%num==0) {
					count+=count;
					
				}
			}
			if(count==2) {
				primenumber=primenumber+i+" ";
				
			}
			
		}
		System.out.println(primenumber);

	}

}
