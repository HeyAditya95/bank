package bank;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;

public class SignUpOne extends JFrame implements ActionListener {

long random;
ButtonGroup genderButtonGroup , marriageGroupButton ;

JLabel formno , Name , address , phoneNum , fatherName , page1 , gender , email , marry , dob , city , state , pin ;
JTextField namefield , addressfield , phonefield , fatherfield , dobfield ,
        genderfield , emailfield , maritalfield , cityfield , statefield , pinfield ;

JRadioButton male , female , single , married , other ;
JDateChooser dateChooser;

JButton next;

    SignUpOne() {
    setTitle("SIGN UP");
    setLayout(null);

    Random ran = new Random();
    random = Math.abs((ran.nextLong() % 9000L) + 1000L);

    formno = new JLabel("Application Form No : " + random );
    formno.setBounds(200 , 10 , 600 , 70);
    formno.setFont(new Font("Raleway" , Font.BOLD , 40));
    add(formno);

    page1 = new JLabel("PAGE 1 : PERSONAL DETAILS");
    page1.setBounds(600 , 110 , 400 , 35);
    page1.setFont(new Font("Raleway" , Font.ROMAN_BASELINE , 16));
    add(page1);

    Name = new JLabel("Name : " );
    Name.setBounds(170 , 200 , 100 , 30);
    Name.setFont(new Font("Raleway" , Font.ITALIC , 18));
    add(Name);

    namefield= new JTextField();
    namefield.setBounds(350 , 200 , 300 , 30);
    namefield.setFont(new Font("Ariel" , Font.BOLD , 18));
    namefield.setForeground(Color.BLACK);
    add(namefield);

    fatherName= new JLabel("Father's Name : " );
    fatherName.setBounds(170 , 240 , 150 , 30);
    fatherName.setFont(new Font("Raleway" , Font.ITALIC , 18));
    add(fatherName);

    fatherfield = new JTextField();
    fatherfield.setBounds(350 , 240 , 300 , 30);
    fatherfield.setFont(new Font("Ariel" , Font.BOLD , 18));
    fatherfield.setForeground(Color.BLACK);
    add(fatherfield);

    dob = new JLabel("Date of Birth : " );
    dob.setBounds(170 , 280 , 150 , 30);
    dob.setFont(new Font("Raleway" , Font.ITALIC , 18));
    add(dob);

    dobfield = new JTextField();
    dobfield.setBounds(350 , 280 , 280 , 30);
    dobfield.setFont(new Font("Ariel" , Font.BOLD , 18));
    dobfield.setForeground(Color.BLACK);
    add(dobfield);

    JDateChooser dateChooser = new JDateChooser();
    dateChooser.setBounds(630 , 280 , 20 , 30 );
    add(dateChooser);
    // Add a PropertyChangeListener to update dobfield when a date is selected
        dateChooser.addPropertyChangeListener("date", new PropertyChangeListener() {
            @Override
            public void propertyChange(PropertyChangeEvent evt) {
                if (evt.getNewValue() != null) {
                    dobfield.setText(dateChooser.getDate().toString()); // Update the dobfield
                }
            }
        });

    gender= new JLabel("Gender : " );
    gender.setBounds(170 , 320 , 150 , 30);
    gender.setFont(new Font("Raleway" , Font.ITALIC , 18));
    add(gender);

    male = new JRadioButton("Male");
    male.setBounds(350 , 320 , 80 , 30);
    add(male);

    female = new JRadioButton("Female");
    female.setBounds(430 , 320 , 80 , 30);
    add(female);

    other = new JRadioButton("Other");
    other.setBounds(530 , 320 , 80 , 30);
    add(other);

    genderButtonGroup = new ButtonGroup();
    genderButtonGroup.add(male);
    genderButtonGroup.add(female);
    genderButtonGroup.add(other);

//    genderfield = new JTextField();
//    genderfield.setBounds(350 , 200 , 300 , 30);
//    genderfield.setFont(new Font("Ariel" , Font.BOLD , 18));
//    genderfield.setForeground(Color.BLACK);
//    add(genderfield);

    email= new JLabel("Email Address : " );
    email.setBounds(170 , 360 , 150 , 30);
    email.setFont(new Font("Raleway" , Font.ITALIC , 18));
    add(email);

    emailfield = new JTextField();
    emailfield.setBounds(350 , 360 , 300 , 30);
    emailfield.setFont(new Font("Ariel" , Font.BOLD , 18));
    emailfield.setForeground(Color.BLACK);
    add(emailfield);

    marry= new JLabel("Marrital Status : " );
    marry.setBounds(170 , 560 , 150 , 30);
    marry.setFont(new Font("Raleway" , Font.ITALIC , 18));
    add(marry);

    single = new JRadioButton("Single");
    single.setBounds(350 , 560 , 80 , 30);
    add(single);

    married = new JRadioButton("Married");
    married.setBounds(530 , 560 , 80 , 30);
    add(married);

    marriageGroupButton = new ButtonGroup();
    marriageGroupButton.add(single);
    marriageGroupButton.add(married);

    address= new JLabel("Address : " );
    address.setBounds(170 , 400 , 150 , 30);
    address.setFont(new Font("Raleway" , Font.ITALIC , 18));
    add(address);

    addressfield = new JTextField();
    addressfield.setBounds(350 , 400 , 300 , 30);
    addressfield.setFont(new Font("Ariel" , Font.BOLD , 18));
    addressfield.setForeground(Color.BLACK);
    add(addressfield);

    city= new JLabel("City : " );
    city.setBounds(170 , 440 , 150 , 30);
    city.setFont(new Font("Raleway" , Font.ITALIC , 18));
    add(city);

    cityfield = new JTextField();
    cityfield.setBounds(350 , 440 , 300 , 30);
    cityfield.setFont(new Font("Ariel" , Font.BOLD , 18));
    cityfield.setForeground(Color.BLACK);
    add(cityfield);

    state= new JLabel("State : " );
    state.setBounds(170 , 480 , 150 , 30);
    state.setFont(new Font("Raleway" , Font.ITALIC , 18));
    add(state);

    statefield = new JTextField();
    statefield.setBounds(350 , 480 , 300 , 30);
    statefield.setFont(new Font("Ariel" , Font.BOLD , 18));
    statefield.setForeground(Color.BLACK);
    add(statefield);

    pin= new JLabel("pin : " );
    pin.setBounds(170 , 520 , 150 , 30);
    pin.setFont(new Font("Raleway" , Font.ITALIC , 18));
    add(pin);

    pinfield = new JTextField();
    pinfield.setBounds(350 , 520 , 300 , 30);
    pinfield.setFont(new Font("Ariel" , Font.BOLD , 18));
    pinfield.setForeground(Color.BLACK);
    add(pinfield);

    next = new JButton("Next");
    next.setBounds(550 , 650 , 100 , 30);
    next.setBackground(Color.white);
    next.setForeground(Color.black);
    next.addActionListener(this);
    add(next);

    getContentPane().setBackground(Color.LIGHT_GRAY);
    setSize(850 , 800);
    setVisible(true);
    setLocation(300 , 100);
    }

    public void actionPerformed (ActionEvent ae){
        String formno = "" + random;
        String Name = namefield.getText();
        String fatherName = fatherfield.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if(male.isSelected()){
            gender = "MALE";
        } else if (female.isSelected()){
            gender = "FEMALE";
        } else if (other.isSelected()) {
            gender = "OTHER";
        }

        String email = emailfield.getText();

        String marital = null;
        if (single.isSelected()){
            marital = "SINGLE";
        } else if (married.isSelected()) {
            marital = "MARRIED";
        }

        String address = addressfield.getText();
        String pin = pinfield.getText();
        String state = statefield.getText();
        String phone = "" + phonefield.getText();

        try {
            if(namefield.equals("")) {
                JOptionPane.showMessageDialog(null , "Name is required !");
            } else if (fatherName.equals("")) {
                JOptionPane.showMessageDialog(null , "Name is required !" );
            }
        } catch (Exception e){
            System.out.println(e);
        }

    }
    public static void main(String[] args)  {
        new SignUpOne();
    }

}
