import java.util.Scanner;

public class DRMMessages {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String output = "";
		String[] arrOfStr = s.split("-", 100); 
		for(int i = 0; i < arrOfStr.length;i++) {
			char x=arrOfStr[i].charAt(0);
			output = output + x;
		}
		System.out.println(output);
	
	}

}
