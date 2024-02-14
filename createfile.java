import java.io.*;
import java.util.*;
import java.io.IOException;

public class createfile{
public static void main(String args[]){
try{
File obj=new File("/home/jeeveshbinoy/Java/newfile.txt");
if(obj.createNewFile()){
System.out.println("File created successfully "+obj.getName());
}
else{
System.out.println("File already exists");
}
}
catch(IOException e){
System.out.println("An error occurred");
e.printStackTrace();
}
}
}


