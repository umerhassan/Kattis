import java.util.Scanner;

public class SevenWonders {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int output = 0;
		int T=0,C=0,G=0;
		for(int i = 0;i<s.length();i++) {
			if( s.charAt(i) == 'T') T++;
			else if(s.charAt(i) == 'C') C++;
			else if(s.charAt(i) == 'G') G++;
		}
		
		if(G>=1 && C>=1 && T>=1) {
			int min=Math.min(G, C);
			int min2=Math.min(min, T);
			output=(G*G)+(C*C)+(T*T)+(7*min2);
			System.out.println(output);
		} else {
			output=(G*G)+(C*C)+(T*T);
			System.out.println(output);
		}
		
	
	}

}
