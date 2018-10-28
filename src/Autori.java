import java.util.Scanner;

public class Autori {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int output = 1;
		for(int i = 0;i<s.length();i++) {
			if(output == 1 && s.charAt(i) == 'A') output = 2;
			else if(output == 2 && s.charAt(i) == 'A') output = 1;
			if(output == 2 && s.charAt(i) == 'B') output = 3;
			else if(output == 3 && s.charAt(i) == 'B') output = 2;
			if(output == 1 && s.charAt(i) == 'C') output = 3;
			else if(output == 3 && s.charAt(i) == 'C') output = 1;

		}
		System.out.println(output);
	
	}

}
