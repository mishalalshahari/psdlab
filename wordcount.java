import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string: ");
		String s=sc.nextLine();
		int l=s.length(),wcount=0;
		s=s+" ";
		for(int i=0;i<l;i++){
		    String x=String.valueOf(s.charAt(i));
		    String y="";
		    if(i<(s.length()-1)) y=String.valueOf(s.charAt(i+1)); 
		    if(x.equals(" ")&&!y.equals(" ")){
		        wcount++;
		    }
		}
		System.out.println("There are "+(wcount+1)+" words in the string.");
	}
}
