import java.util.*;
import java.io.*;

class stringtokenizer{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String str =" ";
try{
FileWriter fw=new FileWriter("File1.txt");

System.out.println("Enter the string : ");
str=sc.nextLine();
fw.write(str);
fw.close();

FileReader fr=new FileReader("File1.txt");
FileWriter fw1=new FileWriter("File2.txt");
int c;
do{
c=fr.read();
if(c!=-1){
fw1.write((char)c);
System.out.print((char)c);

}
}while(c!=-1);
fr.close();
fw1.close();
}
catch(IOException e){
System.out.println(e.getMessage());
}

int sum=0;
StringTokenizer s=new StringTokenizer(str," ");
while(s.hasMoreTokens()){
String st=s.nextToken();
System.out.println(st);
sum=sum+Integer.parseInt(st);
}
System.out.println(sum);

}
}

