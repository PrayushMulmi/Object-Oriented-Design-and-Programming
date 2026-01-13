package week8_workshop;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Task6 extends JFrame {

    JTextField userField;
    JPasswordField passField;
    JButton loginBtn;

    public Task6() {
        setTitle("Login");
        setSize(300, 200);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JLabel userLbl = new JLabel("Username:");
        userLbl.setBounds(20, 30, 100, 25);
        add(userLbl);

        userField = new JTextField();
        userField.setBounds(120, 30, 130, 25);
        add(userField);

        JLabel passLbl = new JLabel("Password:");
        passLbl.setBounds(20, 70, 100, 25);
        add(passLbl);

        passField = new JPasswordField();
        passField.setBounds(120, 70, 130, 25);
        add(passField);

        loginBtn = new JButton("Login");
        loginBtn.setBounds(90, 120, 100, 30);
        add(loginBtn);

        loginBtn.addActionListener(e -> login());

        setVisible(true);
    }

    void login() {
        try {
            Connection con = DBConnection.getConnection();
            String sql = "SELECT * FROM users WHERE username=? AND password=?";
            PreparedStatement pst = con.prepareStatement(sql);

            pst.setString(1, userField.getText());
            pst.setString(2, new String(passField.getPassword()));

            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                JOptionPane.showMessageDialog(this, "Login Successful");
            } else {
                JOptionPane.showMessageDialog(this, "Invalid Credentials");
            }

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Task6();
    }
}

