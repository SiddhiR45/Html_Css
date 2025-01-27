import java.util.Scanner;

public class palindrom {
    public static void main(String args[]){
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter a number:");
         int n=sc.nextInt();
         int rev=0;
         int temp=n;
         while(n>0)
         {
            int digit=n%10;
            rev=rev*10+digit;
            n=n/10;
         }
         System.out.println(rev);
         if(rev==temp){
            System.out.println("It is a palindrome");
         }
         else
         {
            System.out.println("It is not a palindrome");
         }
    }
    
}

