import java.util.Scanner;

public class Above_Average {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCases=sc.nextInt();
		//System.out.printf("Testcases: %d\n",testCases);
		
		for(int i=0;i<testCases;i++) {
			int N = sc.nextInt();
			//System.out.printf("N: %d\n",N);
			double average=0;
			int count=0;
			int array[] = new int[100];
			for(int i1 = 0;i1<N;i1++) {
				int a = sc.nextInt();

				//System.out.printf("a: %d\n",a);
				array[i1]=a;
				average=average+a;
		}
			//System.out.printf("Avg before: %f\n",average);
			average=average/N;
			//System.out.printf("Avg after: %f\n",average);
		for(int i1 = 0;i1<N;i1++) {
			//System.out.printf("Average is: %f and array[",count);
				if(array[i1]>average) count++;
		}
			//System.out.printf("%d count\n",count);
			System.out.printf("%.3f%%\n",(count/(double)N)*100);
			
		}
		
		

	}

}
