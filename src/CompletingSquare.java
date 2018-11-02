//this one is incomente too. complete this
import java.util.Scanner;

public class CompletingSquare {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
			double x1 = sc.nextFloat();
			double y1 = sc.nextFloat();
			double x2 = sc.nextFloat();
			double y2 = sc.nextFloat();
			double x3 = sc.nextFloat();
			double y3 = sc.nextFloat();
			
			double d1=calculateDistance(x1,x2,y1,y2); // 1 and 2
			double d2=calculateDistance(x1,x3,y1,y3);// 1 and 3
			double d3=calculateDistance(x3,x2,y3,y2); //2 and 3
			
			double m = Math.max(Math.max(d1, d2), d3);
			double x4=0;
			double y4=0;
			if(m==d1) {
				double tempX = (x1+x2)/2;
				double tempY = (y1+y2)/2;
				 x4= (2*tempX)-x3;
				 y4= (2*tempY)-y3;
			}
			
			else if(m==d2) {
				double tempX = (x1+x3)/2;
				double tempY = (y1+y3)/2;
				 x4= (2*tempX)-x2;
				 y4= (2*tempY)-y2;
			}
			
			else if(m==d3) {
				double tempX = (x3+x2)/2;
				double tempY = (y3+y2)/2;
				 x4= (2*tempX)-x1;
				 y4= (2*tempY)-y1;
			}
			//System.out.println(m);
			System.out.printf("%d %d",(int)x4,(int)y4);
	}
	
	static double calculateDistance(double x1,double x2,double y1,double y2) {
		return Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
	}

}
