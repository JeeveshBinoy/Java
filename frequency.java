import java.util.*;

class frequency{
public static void main(String args[]){
int count =0;
String str;
char ch;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the string : ");
str=sc.nextLine();
System.out.println("Enter the character : ");
ch=sc.next().charAt(0);
for(int i=0;i<str.length();i++){
if(str.charAt(i)==ch){
count++;
}
}
System.out.println("Frequency  : " +count);
}
}


