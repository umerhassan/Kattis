//this one is incomente too
import java.util.Scanner;

public class Statistics {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int min=1000;
		int max=-10000;
		int range=0;
		int c = 1;
		int N = sc.nextInt();
		while(sc.hasNextInt()) {
			for(int i = 0;i<N;i++) {
				int data = sc.nextInt();
				if(data<min) min = data;
				if(data>max) max = data;
			}
			
			range = max-min;
			System.out.printf("Case %d: %d %d %d\n" ,c,min,max,range);
			c++;
			N = sc.nextInt();
			System.out.printf("N: %d\n" ,N);
		}
		
		

	}

}
