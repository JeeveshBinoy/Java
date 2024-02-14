import java.util.*;

class Armstrong{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number : ");
int n=sc.nextInt();

int temp=n;
int r;
int sum=0;

while(n>0){
r=n%10;
n=n/10;
sum=sum+(r*r*r);
}

if(temp==sum)
System.out.println(temp+" is an armstrong number");
else
System.out.println(temp+" is not an armstrong number");
}
}
