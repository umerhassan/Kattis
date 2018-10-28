import java.util.Scanner;

public class ABC {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=100;
		int b=0;
		int c=-100;
		
		for(int i = 0; i < 3 ; i ++ ) {
			int temp = sc.nextInt();
			if(temp > c) {
				b=c;
				c= temp;
			}
			else if( temp > b) {
				b=temp;
			}
			
			if(temp < a) {
				a=temp;
			}
			
		}
		String Sequence = sc.next();
		for(int i = 0;i<Sequence.length();i++) {
		 if(Sequence.charAt(i)=='A')  System.out.printf("%d ",a);
		 else if(Sequence.charAt(i)=='B')  System.out.printf("%d ",b);
		 else if(Sequence.charAt(i)=='C')  System.out.printf("%d ",c);
		}

		

	}

}
