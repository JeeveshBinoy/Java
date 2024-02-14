import java.io.*;
import java.util.*;

class fileinfo{
public static void main(String args[]){

File obj=new File("/home/jeeveshbinoy/Java/newfile.txt");
if(obj.exists()){
System.out.println("File name : "+obj.getName());
System.out.println("Absolute path : "+obj.getAbsolutePath());
System.out.println("Readable : "+obj.canRead());
System.out.println("Writable : "+obj.canWrite());
System.out.println("Size : "+obj.length());
}

else{
System.out.println("File doesn't exists");
}
}
}
