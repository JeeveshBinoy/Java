import java.util.*;

class Employee{
    String name;
    int age;
    String phone;
    String address;
    int salary;
    
    void printSalary(){
    System.out.println("Salary : Rs"+salary);
   }
}

class Officer extends Employee{
String department;

void details(String n,int a,String p,String add,int s,String dep){
name=n;
age=a;
phone=p;
address=add;
salary=s;
department=dep;

System.out.println("\nName : "+name+"\nAge : "+age+"\nPhone : "+phone+
"\nAddress : "+address+"\nDepartment : "+department);
}
}

class inheritance{
public static void main(String args[]){
Officer o=new Officer();
o.details("Jeevesh",20,9873586872,"Kerala",200000,"Software");
o.printSalary();
}
}

