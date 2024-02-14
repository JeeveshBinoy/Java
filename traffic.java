import javax.swing.*;

import java.awt.*;

import java.awt.event.*;





class traffic implements ActionListener{

    JFrame jf;



    JRadioButton redb;

    JRadioButton yellowb;

    JRadioButton greenb;



    JButton red;

    JButton green;

    JButton yellow;





    public traffic(){

        jf=new JFrame("TRAFFIC SIGNAL");

        jf.setSize(800,800);

        jf.setLayout(null);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        

        redb=new JRadioButton("Red");

        redb.setBounds(50,250,300,20);

        yellowb=new JRadioButton("Yellow");

        yellowb.setBounds(50,300,300,20);

        greenb=new JRadioButton("Green");

        greenb.setBounds(50,350,300,20);
        greenb.setFocusable(false);

    

    

        ButtonGroup bg=new ButtonGroup();

        bg.add(redb);

        bg.add(greenb);

        bg.add(yellowb);

    

        red=new JButton();

        red.setBounds(50,50,50,50);

        

        yellow=new JButton();

        yellow.setBounds(50,100,50,50);

        

        green=new JButton();

        green.setBounds(50,150,50,50);

        

        redb.addActionListener(this);

        greenb.addActionListener(this);

        yellowb.addActionListener(this);

        

        jf.add(redb);

        jf.add(greenb);

        jf.add(yellowb);

        jf.add(red);

        jf.add(yellow);

        jf.add(green);

        jf.setVisible(true);    

    }

    

    public void actionPerformed(ActionEvent e){

        

        if(redb.isSelected()){

            red.setBackground(Color.RED);

            yellow.setBackground(Color.WHITE);

            green.setBackground(Color.WHITE);

        }

        else if(yellowb.isSelected()){

            red.setBackground(Color.WHITE);

            yellow.setBackground(Color.YELLOW);

            green.setBackground(Color.WHITE);    

        }

        else if(greenb.isSelected()){

            red.setBackground(Color.WHITE);

            yellow.setBackground(Color.WHITE);

            green.setBackground(Color.GREEN);

        }

        

    }

    

    public static void main(String args[]){

        new traffic();

    }

    

}



    






