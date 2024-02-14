import java.util.*;
class Thread1 extends Thread{
public void run(){
for(int i=0;i<5;i++){
Random r=new Random();
int n=r.nextInt(10);
System.out.println("Number : "+n);
if(n%2==0){
Thread2 t2=new Thread2(n);
t2.start();
}
else{
Thread3 t3=new Thread3(n);
t3.start();
}
try{
Thread.sleep(1000);
}
catch(InterruptedException e){
System.out.println(e);
}
}
}
}

class Thread2 extends Thread{
int number;
Thread2(int num){
number=num;
}
public void run(){
System.out.println("Square : "+(number*number));
}
}

class Thread3 extends Thread{
int number;
Thread3(int num){
number=num;
}
public void run(){
System.out.println("Cube : "+(number*number*number));
}
}

class Multithreading{
public static void main(String args[]){
Thread1 t1=new Thread1();
t1.start();
}
}
