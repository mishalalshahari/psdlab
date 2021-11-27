import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string: ");
		String s=sc.nextLine();
		System.out.println("Enter the Character to count frequency: ");
		String c=sc.nextLine();
		int l=s.length(),fcount=0,wcount=0;
		for(int i=0;i<l;i++){
		    String x=String.valueOf(s.charAt(i));
		    if(c.equals(x)) fcount++;
		}
		System.out.println("Frequency of "+c+" is "+fcount+".");
		char ch=32;
		for(int i=0;i<l;i++){
		    if(s.charAt(i)==ch) wcount++;
		}
		System.out.println("There are "+(wcount+1)+" words in the string.");
	}
}
