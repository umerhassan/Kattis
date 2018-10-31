//This is incomplete

import java.util.Scanner;

public class DRMMessages {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int l = s.length();
		StringBuilder part1 = new StringBuilder(s.substring(0, l/2));
		StringBuilder part2 = new StringBuilder(s.substring(l/2, l));
	//	String part2 = s.substring(l/2, l);
	
		int rotation1 = 0,rotation2=0;
		for(int i = 0; i < part1.length();i++)
			rotation1 = rotation1 + (int)part1.charAt(i) - 65;
	
		sys
		//for(int i = 0; i < part2.length();i++)
		//	rotation2 = rotation2 + (int)part2.charAt(i) - 65;
		
		for(int i = 0; i < part1.length();i++) {
			char x = (char) (part1.charAt(i)+rotation1-65);
			System.out.println(x);
			part1.setCharAt(i, x);
			if((int)part1.charAt(i) > 90) {
				int diff =  ((int)part1.charAt(i) - 90);
				char newX = (char)('A'+diff);
				part1.setCharAt(i, newX);
			}
		}
			
		
		
		System.out.println(part1);
		System.out.println("\n");
		System.out.println(part2);
	
	}

}
