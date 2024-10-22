package bank;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener {

    JButton sign , clear , login ;
    JTextField cardfield  ;
    JPasswordField pinfield;


    Login(){
        setTitle("AUTOMATED TELLER MACHINE");

        setLayout(null); // default layout ko htane k layout ko null krna padega

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100 , 100 , Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(70,10,100 , 100);  //to change label's location

        add(label);

        JLabel text = new JLabel("Welcome to the ATM");
        text.setFont(new Font("Osward" , Font.BOLD, 38));
        text.setBounds(200 , 40 , 400 , 40);
        add(text);

        JLabel cardno = new JLabel("Card No:");
        cardno.setFont(new Font("Raleway" , Font.BOLD, 28));
        cardno.setBounds(120 , 150 , 150 , 30);
        add(cardno);

        cardfield = new JTextField();
        cardfield.setBounds(300 , 150 , 250 , 30);
        cardfield.setFont(new Font ("Arial", Font. BOLD, 14)) ;
        add(cardfield);

        JLabel pin = new JLabel("PIN:");
        pin.setFont(new Font("Raleway" , Font.BOLD, 28));
        pin.setBounds(120 , 220 , 250 , 30);
        add(pin);

        pinfield = new JPasswordField();
        pinfield.setBounds(300 , 220 , 250 , 30);
        pinfield.setFont (new Font ("Arial", Font. BOLD, 14)) ;
        add(pinfield);

        sign = new JButton("SIGN IN");
        sign.setBounds(300 , 300 , 100 , 30);
        sign.setBackground(Color.WHITE);
        sign.setForeground(Color.BLACK);
        sign.addActionListener(this);
        add(sign);

        clear = new JButton("CLEAR");
        clear.setBounds(430 , 300 , 100 , 30);
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.red);
        clear.addActionListener(this);
        add(clear);

        login = new JButton("LOGIN");
        login.setBounds(300,330,230,30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.green);
        login.addActionListener(this);
        add(login);



        getContentPane().setBackground(Color.white);


        setSize(800 , 400);
        setVisible(true);
        setLocation(350,200);
    }

    public void actionPerformed (ActionEvent ae)
    {
        if(ae.getSource() == clear)
        {
        cardfield.setText("");
        pinfield.setText("");
        } else  if (ae.getSource() == sign)
        {
        setVisible(false);
        new SignUpOne().setVisible(true);
        } else if (ae.getSource() == login)
        {

        }
    }


    public static void main(String[] args) {
        new Login();

        }
    }

