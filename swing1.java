import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class swing1 implements ActionListener{
JFrame jf;
TextField t1;
JButton print;

swing1(){
jf=new JFrame("swing");
jf.setSize(500,500);
jf.setLayout(null);
jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

t1=new TextField();
t1.setBounds(100,100,300,50);

print =new JButton("PRINT");
print.setBounds(100,200,100,50);
print.addActionListener(this);

jf.add(t1);
jf.add(print);
jf.setVisible(true);
}



public static void main(String args[]){
swing1 s=new swing1();

}

public void actionPerformed(ActionEvent e){
if(e.getSource() == print){
int n = Integer.parseInt(t1.getText());
Thread1 t1=new Thread1(n);
Thread2 t2=new Thread2(n);
t1.start();
t2.start();
}
}
class Thread1 extends Thread{
int n;
Thread1(int n){
this.n=n;
}
public void run(){
for(int i=0;i<n;i++){
System.out.println("Thrikkakara");
}
}
}

class Thread2 extends Thread{
int n;
Thread2(int n){
this.n=n;
}
public void run(){
for(int i=0;i<n;i++){
System.out.println("Kochi");
}
}
}
}
