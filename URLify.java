import java.util.Scanner;

public class URLify {
	String blank = " ";
	String replace = "%20";
	public String replace(String s, int length)
	{
		String re = "";
		char[] all = s.toCharArray();
		for (int i = 0; i < length; i++)
		{
			if (all[i] != blank.charAt(0))
			{
				re += all[i];
			}
			else 
			{
				re += replace;
			}
		}
		return re;
	}
	
	public static void main(String[] args) {
		URLify ur = new URLify();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input a string: ");
		String result = sc.nextLine();
		System.out.println("length: ");
		int length = sc.nextInt();
		String finalr = ur.replace(result, length);
		System.out.println(finalr);
	}

}
