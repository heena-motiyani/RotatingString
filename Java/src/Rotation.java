import java.util.Scanner;

public class Rotation {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String str = s+s;
		char ch = sc.nextLine().charAt(0);
	
		int c = sc.nextInt();
		sc.close();
		
		
		
		
		if(ch=='L') {
		   String sa = str.substring(2, s.length()+2);
			System.out.println(sa);}
		
		else if(ch=='R')
		{
			String sa = str.substring(str.length()-c-s.length(),str.length()-c);
			System.out.println(sa);
		}
		else
			System.out.println("invalid input");
		
			
	}

}
