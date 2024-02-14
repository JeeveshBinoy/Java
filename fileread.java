import java.io.*;
import java.util.*;

class fileread{
public static void main(String args[]){
try{
File obj=new File("/home/jeeveshbinoy/Java/filewrite.txt");
Scanner reader=new Scanner(obj);
while(reader.hasNextLine()){
String data=reader.nextLine();
System.out.println(data);
}

}
catch(IOException e){
System.out.println("Error occurred");
}
}
}
