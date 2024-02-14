import java.util.*;

public class MergeSort{
       public static void MergeSort(int arr[],int l,int r){
       
       if(l<r){
          int mid=(l+r)/2;
          MergeSort(arr,l,mid);
          MergeSort(arr,mid+1,r);
          
          Merge(arr,l,mid,r);
          }
      }
         
       public static void Merge(int arr[],int l,int mid, int r){
       
       int n1=mid-l+1;
       int n2=r-mid;
       
       int Larr[]=new int[n1];
       int Rarr[]=new int[n2];
       
       for(int x=0;x<n1;x++){
          Larr[x]=arr[l+x];
          }
          
       for(int x=0;x<n2;x++){
          Rarr[x]=arr[mid+1+x];
          }
          
         
          
       
       int i=0;
       int j=0;
       int k=l;
       
       while(i<n1 && j<n2){
       
           if(Larr[i]<=Rarr[j]){
              arr[k]=Larr[i];
              i++;
              }
              
           else{
              arr[k]=Rarr[j];
              j++;
              }
              
           k++;
           
              }
              
       while(i<n1){
       
            arr[k]=Larr[i];
            i++;
            k++;
            
            }
            
       while(j<n2){
       
            arr[k]=Rarr[j];
            j++;
            k++;
            
            }
            
      }
      
    public static void main(String args[]){
    
           Scanner sc=new Scanner(System.in);
           
           System.out.print("Enter the size of the array : ");
           int n=sc.nextInt();
           
           int arr[]=new int[n];
           
           
           System.out.println("Enter the elements of the array : ");
           for(int y=0;y<n;y++){
           arr[y]=sc.nextInt();
           }
           
           System.out.println("Array before Merge sort");
           for(int y=0;y<n;y++){
           System.out.print(arr[y]+"  ");
           }           
           System.out.print("\n");
           
           MergeSort(arr,0,arr.length-1);
           
           System.out.println("Array after Merge sort");
           for(int y=0;y<n;y++){
           System.out.print(arr[y]+"  ");
           }   
           
           }
     }
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
       
