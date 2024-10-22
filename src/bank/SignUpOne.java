package bank;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.Random;
import com.toedter.calendar.JDateChooser;

public class SignUpOne extends JFrame implements ActionListener {

    long random;
    ButtonGroup genderButtonGroup, marriageGroupButton;
    JLabel formNoLabel, nameLabel, addressLabel, phoneLabel, fatherNameLabel, pageLabel, genderLabel, emailLabel, maritalStatusLabel, dobLabel, cityLabel, stateLabel, pinLabel;
    JTextField nameField, addressField, phoneField, fatherField, emailField, cityField, stateField, pinField;
    JRadioButton male, female, other, single, married;
    JDateChooser dateChooser;
    JButton next;

    SignUpOne() {
        setTitle("Sign Up");
        setLayout(null);

        Random ran = new Random();
        random = Math.abs((ran.nextLong() % 9000L) + 1000L);

        formNoLabel = new JLabel("Application Form No: " + random);
        formNoLabel.setBounds(200, 10, 600, 70);
        formNoLabel.setFont(new Font("Raleway", Font.BOLD, 40));
        add(formNoLabel);

        pageLabel = new JLabel("PAGE 1: Personal Details");
        pageLabel.setBounds(600, 110, 400, 35);
        pageLabel.setFont(new Font("Raleway", Font.PLAIN, 16));
        add(pageLabel);

        nameLabel = new JLabel("Name:");
        nameLabel.setBounds(170, 200, 100, 30);
        nameLabel.setFont(new Font("Raleway", Font.ITALIC, 18));
        add(nameLabel);

        nameField = new JTextField();
        nameField.setBounds(350, 200, 300, 30);
        nameField.setFont(new Font("Arial", Font.BOLD, 18));
        add(nameField);

        fatherNameLabel = new JLabel("Father's Name:");
        fatherNameLabel.setBounds(170, 240, 150, 30);
        fatherNameLabel.setFont(new Font("Raleway", Font.ITALIC, 18));
        add(fatherNameLabel);

        fatherField = new JTextField();
        fatherField.setBounds(350, 240, 300, 30);
        fatherField.setFont(new Font("Arial", Font.BOLD, 18));
        add(fatherField);

        dobLabel = new JLabel("Date of Birth:");
        dobLabel.setBounds(170, 280, 150, 30);
        dobLabel.setFont(new Font("Raleway", Font.ITALIC, 18));
        add(dobLabel);

        dateChooser = new JDateChooser();
        dateChooser.setBounds(350, 280, 300, 30);
        add(dateChooser);

        dateChooser.addPropertyChangeListener("date", new PropertyChangeListener() {
            @Override
            public void propertyChange(PropertyChangeEvent evt) {
                if (evt.getNewValue() != null) {
                    dobLabel.setText(dateChooser.getDate().toString());
                }
            }
        });

        genderLabel = new JLabel("Gender:");
        genderLabel.setBounds(170, 320, 150, 30);
        genderLabel.setFont(new Font("Raleway", Font.ITALIC, 18));
        add(genderLabel);

        male = new JRadioButton("Male");
        male.setBounds(350, 320, 80, 30);
        add(male);

        female = new JRadioButton("Female");
        female.setBounds(430, 320, 80, 30);
        add(female);

        other = new JRadioButton("Other");
        other.setBounds(510, 320, 80, 30);
        add(other);

        genderButtonGroup = new ButtonGroup();
        genderButtonGroup.add(male);
        genderButtonGroup.add(female);
        genderButtonGroup.add(other);

        emailLabel = new JLabel("Email Address:");
        emailLabel.setBounds(170, 360, 150, 30);
        emailLabel.setFont(new Font("Raleway", Font.ITALIC, 18));
        add(emailLabel);

        emailField = new JTextField();
        emailField.setBounds(350, 360, 300, 30);
        emailField.setFont(new Font("Arial", Font.BOLD, 18));
        add(emailField);

        maritalStatusLabel = new JLabel("Marital Status:");
        maritalStatusLabel.setBounds(170, 400, 150, 30);
        maritalStatusLabel.setFont(new Font("Raleway", Font.ITALIC, 18));
        add(maritalStatusLabel);

        single = new JRadioButton("Single");
        single.setBounds(350, 400, 80, 30);
        add(single);

        married = new JRadioButton("Married");
        married.setBounds(430, 400, 80, 30);
        add(married);

        marriageGroupButton = new ButtonGroup();
        marriageGroupButton.add(single);
        marriageGroupButton.add(married);

        addressLabel = new JLabel("Address:");
        addressLabel.setBounds(170, 440, 150, 30);
        addressLabel.setFont(new Font("Raleway", Font.ITALIC, 18));
        add(addressLabel);

        addressField = new JTextField();
        addressField.setBounds(350, 440, 300, 30);
        addressField.setFont(new Font("Arial", Font.BOLD, 18));
        add(addressField);

        cityLabel = new JLabel("City:");
        cityLabel.setBounds(170, 480, 150, 30);
        cityLabel.setFont(new Font("Raleway", Font.ITALIC, 18));
        add(cityLabel);

        cityField = new JTextField();
        cityField.setBounds(350, 480, 300, 30);
        cityField.setFont(new Font("Arial", Font.BOLD, 18));
        add(cityField);

        stateLabel = new JLabel("State:");
        stateLabel.setBounds(170, 520, 150, 30);
        stateLabel.setFont(new Font("Raleway", Font.ITALIC, 18));
        add(stateLabel);

        stateField = new JTextField();
        stateField.setBounds(350, 520, 300, 30);
        stateField.setFont(new Font("Arial", Font.BOLD, 18));
        add(stateField);

        pinLabel = new JLabel("PIN:");
        pinLabel.setBounds(170, 560, 150, 30);
        pinLabel.setFont(new Font("Raleway", Font.ITALIC, 18));
        add(pinLabel);

        pinField = new JTextField();
        pinField.setBounds(350, 560, 300, 30);
        pinField.setFont(new Font("Arial", Font.BOLD, 18));
        add(pinField);

        next = new JButton("Next");
        next.setBounds(550, 650, 100, 30);
        next.setBackground(Color.WHITE);
        next.setForeground(Color.BLACK);
        next.addActionListener(this);
        add(next);

        getContentPane().setBackground(Color.LIGHT_GRAY);
        setSize(850, 800);
        setLocation(300, 100);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        String formNo = String.valueOf(random);
        String name = nameField.getText();
        String fatherName = fatherField.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = male.isSelected() ? "Male" : female.isSelected() ? "Female" : "Other";
        String email = emailField.getText();
        String maritalStatus = single.isSelected() ? "Single" : "Married";
        String address = addressField.getText();
        String city = cityField.getText();
        String state = stateField.getText();
        String pin = pinField.getText();

        try {
            if (name.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Name is required!");
            } else if (fatherName.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Father's Name is required!");
            } else if (dob.isEmpty() || dateChooser.getDate() == null) {
    JOptionPane.showMessageDialog(null, "Date of Birth is required!");
}
            else if (!male.isSelected() && !female.isSelected() && !other.isSelected()) {
                JOptionPane.showMessageDialog(null, "Gender is required!");
            }
            else if (email.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Email is required!");
            }
            else if (!single.isSelected() && !married.isSelected()) {
    JOptionPane.showMessageDialog(null, "Marital status is required!");
}
            else if (address.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Address is required!");
            }
            else if (city.isEmpty()) {
                JOptionPane.showMessageDialog(null, "City is required!");
            }
            else if (state.isEmpty()) {
                JOptionPane.showMessageDialog(null, "State is required!");
            }
            else if (pin.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Date of Birth is required!");
            }

            else {
                conn c = new conn();
                String query = "INSERT INTO signup (formno, Name, address, Father_name, gender, email, marital_status, state, dob, city, pin) VALUES ('" +
                        formNo + "', '" + name + "', '" + address + "', '" + fatherName + "', '" + gender + "', '" + email + "', '" +
                        maritalStatus + "', '" + state + "', '" + dob + "', '" + city + "', '" + pin + "')";
                c.s.executeUpdate(query);
                c.close();
                JOptionPane.showMessageDialog(null, "Details Submitted Successfully");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new SignUpOne();
    }
}