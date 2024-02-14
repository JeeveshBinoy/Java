import java.util.*;

class reversestring{
public static void main(String args[]){

Scanner sc=new Scanner(System.in);
System.out.println("Enter the string: ");
String str=sc.nextLine();
String s="   ";


int len=str.length();
for(int i=len-1;i>=0;i--){
s=s+str.charAt(i);
}
System.out.println(s);
}
}

