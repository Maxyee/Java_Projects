package currency;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CurreConverter {
    public static void converter(){

        //--------------------------Frame------------------------------------
        // frame box with height 300 and width 400
        JFrame con = new JFrame("CONVERTER");

        //--------------------------labels------------------------------------
        // creating two labels inside the frame
        JLabel label1, label2;

        // naming the labels
        label1 = new JLabel("Taka");
        label2 = new JLabel("Dollars");

        // the bounds for those labels
        label1.setBounds(20,40,60,30);
        label2.setBounds(170,40,60,30);

        //--------------------------text field------------------------------------
        // creating two text field for the labels
        JTextField text1, text2;

        // initializing the text field and setting the bound for that
        text1 = new JTextField("0");
        text2 = new JTextField("0");
        text1.setBounds(80,40,50,30);
        text2.setBounds(240,40,50,30);

        //--------------------------Buttons------------------------------------
        // creating three buttons
        JButton button1, button2, button3;

        // initializing the buttons with Taka, Dollar and close
        // also setting the bound or the position into the Frame
        button1 = new JButton("BDT");
        button1.setBounds(50,80,60,15);
        button2 = new JButton("USD");
        button2.setBounds(190,80,60,15);
        button3 = new JButton("Close");
        button3.setBounds(150,150,60,30);

        //--------------------------Action Listener to Button---------------------
        button1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                double givenBDT = Double.parseDouble(text1.getText());
                double dollarResult = ( givenBDT / 120.5);
                String str1 = String.valueOf(dollarResult);
                text2.setText(str1);
            }
        });

        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                double givenDollar = Double.parseDouble(text2.getText());
                double bdtResult = (givenDollar*120.5);
                String str2 = String.valueOf(bdtResult);
                text1.setText(str2);
            }
        });

        button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                con.dispose();
            }
        });

        //--------------------------Window Listener to Button---------------------

        con.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        //--------------------------Adding all the objects------------------------
        // Adding the labels objects to the form
        con.add(label1);
        con.add(label2);

        // Adding the text objects to the form
        con.add(text1);
        con.add(text2);

        // Adding all three button objects to the form
        con.add(button1);
        con.add(button2);
        con.add(button3);

        con.setLayout(null);
        con.setSize(400,300);
        con.setVisible(true);
    }
    public static void main(String[] args){
        converter();
    }
}
