import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator1 implements ActionListener{
JFrame jf;
TextField t1;
TextField t2;
JButton add;
JButton sub;
JButton mul;
JButton div;
JButton clr;
JLabel l;

Calculator1(){
jf= new JFrame("Calculator");
jf.setSize(800,800);
jf.setLayout(null);
jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

l=new JLabel();
l.setBounds(100,400,100,100);

t1=new TextField();
t1.setBounds(100,100,350,50);

t2=new TextField();
t2.setBounds(100,200,350,50);

add=new JButton("+");
add.setBounds(100,300,80,80);
add.addActionListener(this);

sub=new JButton("-");
sub.setBounds(180,300,80,80);
sub.addActionListener(this);

mul=new JButton("*");
mul.setBounds(260,300,80,80);
mul.addActionListener(this);

div=new JButton("/");
div.setBounds(340,300,80,80);
div.addActionListener(this);

clr=new JButton("clear");
clr.setBounds(420,300,80,80);
clr.addActionListener(this);




jf.add(t1);
jf.add(t2);
jf.add(add);
jf.add(sub);
jf.add(mul);
jf.add(div);
jf.add(clr);
jf.add(l);
jf.setVisible(true);
}



public static void main(String args[]){
Calculator1 calculator = new Calculator1();
}

public void actionPerformed(ActionEvent e){

if(e.getSource() == add){
int a=Integer.parseInt(t1.getText());
int b=Integer.parseInt(t2.getText());
int r=a+b;
l.setText("Result : "+r+" ");
}

else if(e.getSource() == sub){
int a=Integer.parseInt(t1.getText());
int b=Integer.parseInt(t2.getText());
int r=a-b;
l.setText("Result : "+r+" ");
}

else if(e.getSource() == mul){
int a=Integer.parseInt(t1.getText());
int b=Integer.parseInt(t2.getText());
int r=a*b;
l.setText("Result : "+r+" ");
}

else if(e.getSource() == div){
int a=Integer.parseInt(t1.getText());
int b=Integer.parseInt(t2.getText());
int r=a/b;
l.setText("Result : "+r+" ");
}

else if(e.getSource() == clr){
t1.setText("");
t2.setText("");
l.setText("");
}

}

}
