import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class swing implements ActionListener{

JFrame jf;
JRadioButton b1;
JRadioButton b2;
TextField t1;
JButton b3;

swing(){
jf = new JFrame("Swing");
jf.setSize(500,500);
jf.setLayout(null);
jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

b1=new JRadioButton("bit 1");
b2=new JRadioButton("bit 0");
b1.setBounds(100,100,100,50);
b2.setBounds(200,100,100,50);
b1.addActionListener(this);
b2.addActionListener(this);


t1=new TextField();
t1.setBounds(100,150,350,50);
t1.setText("0");


jf.add(b1);
jf.add(b2);
jf.add(t1);
jf.setVisible(true);
}

public static void main(String args[]){
swing s=new swing();
}

public void actionPerformed(ActionEvent e){
if(b1.isSelected() && b2.isSelected()){
t1.setText("3");
}
else if(b1.isSelected()){
t1.setText("2");
}
else if(b2.isSelected()){
t1.setText("1");
}
else{
t1.setText("0");
}

}
}
