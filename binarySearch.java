import java.util.*;

class binarySearch{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter the size of the array : ");
        int size=sc.nextInt();
        
        int A[]=new int[size];
        
        System.out.print("Enter the elements of the array in ascending order : ");
        for(int i=0;i<size;i++){
            A[i]=sc.nextInt();
        }

        
        System.out.print("Enter the element to be searched : ");
        int searchKey=sc.nextInt();
        
        int flag=0;
        int low=0;
        int high=size-1;
        int mid=(low+high)/2;
        
        while(low<=high){
            mid=(low+high)/2;
            
            if(A[mid]==searchKey){
                flag=1;
                break;
            }
            else if(A[mid]>searchKey){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        
        if(flag==1){
            System.out.print("Element found at index "+mid);
        }
        
        else{
            System.out.print("Element not found");
        }
    }
}
       
            
