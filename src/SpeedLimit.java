import java.util.Scanner;

public class SpeedLimit {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int samples=sc.nextInt();
		
		while(samples!=-1) {
			
			int initialSpeed=sc.nextInt();
			int initialTime=sc.nextInt();
			//System.out.printf("Initialspeed = %d , InitialTime = %d \n",initialSpeed,initialTime);
			int distance = initialSpeed*initialTime;
			for(int i=0;i<samples-1;i++) {
				int newSpeed = sc.nextInt();
				int newTime= sc.nextInt();
				//System.out.printf("Newspeed = %d , NewTime = %d \n",newSpeed,newTime);
				distance = distance + (newSpeed*(newTime-initialTime));
				initialTime=newTime;
			}
		
			System.out.printf("%d miles\n",distance);
			samples=sc.nextInt();

		}
		
	}

}
