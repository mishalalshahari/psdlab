import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string: ");
		String s=sc.nextLine();
		String a="a",e="e",i="i",o="o",u="u";
		int l=s.length(),ac=0,ec=0,ic=0,oc=0,uc=0;
		for(int j=0;j<l;j++){
		    String x=String.valueOf(s.charAt(j));
		    if(a.equalsIgnoreCase(x)) ac++;
		    if(e.equalsIgnoreCase(x)) ec++;
		    if(i.equalsIgnoreCase(x)) ic++;
		    if(o.equalsIgnoreCase(x)) oc++;
		    if(u.equalsIgnoreCase(x)) uc++;
		}
		System.out.println("Frequency of Vowels are:");
		System.out.println("\na="+ac+"\ne="+ec+"\ni="+ic+"\no="+oc+"\nu="+uc);
	}
}
