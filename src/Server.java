import java.util.Scanner;

public class Server {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tasks=sc.nextInt();
		int totalTime=sc.nextInt();
		int currentTime=0;
		int count = 0;
		for(int i=0;i<tasks;i++) {
			int N = sc.nextInt();
			currentTime+=N;
			if(currentTime<=totalTime) count++;
		}
		
		System.out.println(count);

	}

}
