import java.util.*;

class sum{
      public static void main(String args[]){
             int sum=0;
             Scanner sc=new Scanner(System.in);
             System.out.println("Enter the number to which the sum is to be found : ");
             int num=sc.nextInt();
             for(int i=0;i<=num;i++){
                 sum=sum+i;
                 }
             System.out.println("Sum: "+sum);
             }
}
