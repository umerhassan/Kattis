import java.util.Scanner;

public class Special {

	static String function(String s, int K) {
		String x = "";
		String answer = "";
		for(String a:  s.split("-")) {
			x = x + a;
		}
		//System.out.println(x);
		int start = 0;
		int end = K;
		if(x.length()%K == 0) {
			for(int i=0;i<x.length()/K;i++) {
				String sub = x.substring(start, end);
				//System.out.printf("Substring %d: %s",i,sub);
				answer = answer + sub;
				if(end!=x.length()) {
					answer = answer + "-";
				}
				start += K;
				end += K;
			}
			
		}
		else {
			start = 0;
			end = x.length()%K;
			String sub = x.substring(start, end);
			System.out.printf("Substring %d: %s\n",end,sub);
			answer = answer + sub;
			if(end!=x.length()) {
				answer = answer + "-";
			}
			start += end;
			end += K;
			for(int i=0;i<x.length()/K;i++) {
				sub = x.substring(start, end);
				System.out.printf("Substring %d: %s\n",end,sub);
				answer = answer + sub;
				if(end!=x.length()) {
					answer = answer + "-";
				}
				start += K;
				end += K;
			}
		}
		return answer.toUpperCase();
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			String s = sc.next();
			int K=sc.nextInt();
			System.out.println(function(s,K));
		}

	}
	
}
