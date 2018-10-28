import java.util.Scanner;

public class Tarifa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int monthly = sc.nextInt();
		int N = sc.nextInt();
		
		int total = monthly*(N+1);
		
		for(int i = 0;i<N;i++) {
			int thisMonth = sc.nextInt();
			total -= thisMonth;
		}
		
		System.out.printf("%d",total);

	}

}
