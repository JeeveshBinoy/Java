import java.util.*;
class Identitymatrix{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
boolean flag=true;
System.out.println("Enter the rows and columns : ");
int r=sc.nextInt();
int c=sc.nextInt();
int a[][]=new int[r][c];
System.out.println("Enter the elements : ");
for(int i=0;i<r;i++){
for(int j=0;j<c;j++){
a[i][j]=sc.nextInt();
}
}

for(int i=0;i<r;i++){
for(int j=0;j<c;j++){
if(i==j && a[i][j]!=1){
flag=false;
break;
}
if(i!=j && a[i][j]!=0){
flag=false;
break;
}
}
}
if(flag)
System.out.println("Identity matrix");
else
System.out.println("Not an Identity matrix");
}
}
