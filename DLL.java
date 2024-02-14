import java.util.*;

class Node{
    int data;
    Node prev;
    Node next;

    Node(int data){
        this.data=data;
        this.prev=null;
        this.next=null;
    }
}

class DLL{
    static Node head=null;
    static Node tail=null;

    public static void Addfront(int data){
        Node temp=new Node(data);
        if(head==null){
            head=temp;
            tail=temp;
        }
        else{
            temp.next=head;
            head.prev=temp;
            head=temp;
        }
    }

    public static void addrear(int data){
        Node temp=new Node(data);
        if(head==null){
            head=temp;
            tail=temp;
        }
        else{
            temp.prev=tail;
            tail.next=temp;
            tail=temp;
        }
    }

    public static void deletefront(){
        if(head==null){
            return;
        }
        else if(head==tail){
            head=null;
            tail=null;
            return;
        }
        else{
            Node temp=head;
            head=head.next;
            head.prev=null;
            temp.next=null;
        }
    }

     public static void deleterear(){
        if(tail==null){
            return;
        }
        else if(head==tail){
            head=null;
            tail=null;
            return;
        }
        else{
            Node temp=tail;
            tail=tail.prev;
            tail.next=null;
            temp.prev=null;
        }
    }

    public static void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int choice;
        while(true){
        System.out.println("\n1-add front\n2-add rear\n3-delete front\n4-delete rear\n5-display\n6-exit\n");
        System.out.println("Enter choice");
        choice=sc.nextInt();
        switch(choice){
            case 1:
            System.out.println("Enter data : ");
            int data=sc.nextInt();
            Addfront(data);
            break; 

            case 2:
             System.out.println("Enter data : ");
            data=sc.nextInt();
            addrear(data);
            break; 

            case 3:
            deletefront();
            break;

            case 4:
             deleterear();
            break;

            case 5:
             display(head);
            break;

            case 6:
             System.exit(0);
            break; 
        }

        }
    }
}
