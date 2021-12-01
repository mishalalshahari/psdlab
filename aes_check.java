import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string: ");
		String s=sc.nextLine();
		int l=s.length(),flag=0;
		for(int i=1;i<l-1;i++){
		    String e=String.valueOf(s.charAt(i));
		    String a=String.valueOf(s.charAt(i-1));
		    String ns=String.valueOf(s.charAt(i+1));
		    if(e.equals("e") && a.equals("a") && !ns.equals("s")){
		        flag=1;
		        break;
		    }
		}
		if(flag==1) System.out.println("\nAvailable");
		else System.out.println("\nNot Available");
	}
}
