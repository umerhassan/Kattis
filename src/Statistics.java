//this one is incomente too. complete this
import java.util.Scanner;

public class Statistics {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		
		int c = 0;
		//int N = sc.nextInt();

		
		while(sc.hasNextInt()) {
			int N = sc.nextInt();
			//System.out.printf("N: %d\n" ,N);
			int min=10000000;
			int max=-100000000;
			int range=0;
			for(int i = 0;i<N;i++) {
				int data = sc.nextInt();
				if(data<min) min = data;
				if(data>max) max = data;
			}
			
			range = max-min;
			System.out.printf("Case %d: %d %d %d\n" ,c,min,max,range);
			c++;
		
		}
		
		sc.close();

	}

}
