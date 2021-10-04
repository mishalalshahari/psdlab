import java.util.Scanner;
public class Main
{
    int rev(int num){
        int rev=0,rem=0;
        while(num>0){
            rem=num%10;
            num/=10;
            rev=rev*10+rem;
        }
        return rev;
    }
    
    int sum(int num){
        int s=0,rem=0;
        while(num>0){
            rem=num%10;
            num/=10;
            s=s+rem;
        }
        return s;
    }
    
    void pal(int num){
        int rev=0,rem=0,backup=num;
        while(num>0){
            rem=num%10;
            num/=10;
            rev=rev*10+rem;
        }
        if(backup==rev)System.out.println("Palindrome");
        else System.out.println("Not a Palindrome");
    }
    
	public static void main(String[] args) {
		Main m=new Main();
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int rev=m.rev(num);
		System.out.println("\nReverse: "+rev);
		m.pal(num);
		int sum=m.sum(num);
		System.out.println("Sum of digits: "+sum);
		
	}
}
