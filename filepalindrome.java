import java.util.*;
import java.io.*;
class filepalindrome{
public static void main(String args[]){
int flag=0;
int count=0;
boolean palin=true;
Scanner sc=new Scanner(System.in);
try{
FileWriter fw= new FileWriter("test.txt");
String str;
System.out.println("Enter the string : ");
str=sc.nextLine();
fw.write(str);
fw.close();

FileReader fr= new FileReader("test.txt");
int c;

do{
c=fr.read();
System.out.print((char)c);
}while(c!=-1);

for(int i=0;i<=str.length()/2;i++){
if(str.charAt(i)!=str.charAt(str.length()-i-1)){
flag=1;
break;
}
}
if(flag==1){
System.out.println("\nNot Palindrome");
palin=false;
}
else{
System.out.println("\nPalindrome");
palin=true;
}
if(palin){
for(int i=0;i<str.length();i++){
if(str.charAt(i)=='a'||str.charAt(i)=='A'||str.charAt(i)=='e'||str.charAt(i)=='E'||str.charAt(i)=='i'||str.charAt(i)=='I'||str.charAt(i)=='o'||str.charAt(i)=='O'||str.charAt(i)=='u'||str.charAt(i)=='U'){
count++;
}
}
System.out.println("No of vowels: "+count);
}
if(!palin){
char ch;
System.out.println("Enter the character : ");
ch=sc.next().charAt(0);
for(int i=0;i<str.length();i++){
if(str.charAt(i)==ch){
count++;
}
}
System.out.println("Count : "+count);
}
}

catch(IOException e){
System.out.println(e);}
}
}
