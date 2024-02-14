import java.io.*;

class filewrite{
public static void main(String args[]){
try{
File obj=new File("/home/jeeveshbinoy/Java/filewrite.txt");
FileWriter writer=new FileWriter("/home/jeeveshbinoy/Java/filewrite.txt");
writer.write("Welcome to java programming.Enjoy your coding.........");
writer.close();
System.out.println("Successfully written");
}
catch(IOException e){
System.out.println("Error occurred");
}
}
}
