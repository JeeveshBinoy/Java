import java.util.*;

class numberpalindrome{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number : ");
int n=sc.nextInt();
int temp=n;
int result=0,r;

while(n!=0){
r=n%10;
result=(result*10)+r;
n=n/10;
}

if(temp==result){
System.out.println("Palindrome");
}
else{
System.out.println("Not Palindrome");
}
}
}


