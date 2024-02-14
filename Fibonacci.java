import java.util.*;
class Fibonacci{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int first=0;
int second=1;
int third;
System.out.println("Enter the number : ");
int n=sc.nextInt();
for(int i=0;i<n;i++){
System.out.print(first+" ");
third=first+second;
first=second;
second=third;
}
}
}
