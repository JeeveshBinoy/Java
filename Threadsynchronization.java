import java.util.*;

class Table{
public synchronized void print(int n){
int i;
for(i=1;i<11;i++){
System.out.println(n*i);
try{
Thread.sleep(100);
}
catch(InterruptedException e){
System.out.println(e);
}
}
}
}

class Thread1 extends Thread{
Table t;
Thread1(Table t){
this.t=t;
}
public void run(){

t.print(1);
}
}

class Thread2 extends Thread{
Table t;
Thread2(Table t){
this.t=t;
}
public void run(){

t.print(100);
}
}

class Threadsynchronization{
public static void main(String args[]){
Table ob=new Table();
Thread1 t1= new Thread1(ob);
Thread2 t2= new Thread2(ob);
t1.start();
t2.start();
}
}
