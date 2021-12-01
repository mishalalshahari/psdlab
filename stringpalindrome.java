import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string: ");
		String s=sc.nextLine();
		int l=s.length(),flag=0;
		for(int i=0,j=l-1;i<=j;i++,j--){
		    String start=String.valueOf(s.charAt(i));
		    String end=String.valueOf(s.charAt(j));
		    if(start.equalsIgnoreCase(end)){
		        flag=1;
		    }
		    else{
		        flag=0;
		        break;
		    }
		}
		if(flag==1) System.out.println("\nPalindrome");
		else if(flag==0) System.out.println("\nNot a Palindrome");
	}
}
