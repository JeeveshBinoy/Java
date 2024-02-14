import java.util.*;

class x{
int y;
}

class Garbagecollection{
public static void main(String args[]){

Runtime r= Runtime.getRuntime();

System.out.println("Total : "+r.totalMemory());
System.out.println("Free : "+r.freeMemory());
Scanner sc=new Scanner(System.in);
int A[]=new int [5];
for(int i=0;i<5;i++){
A[i]=sc.nextInt();
}
System.out.println("Free : "+r.freeMemory());

r.gc();
System.out.println("Free : "+r.freeMemory());
}
}
