package week8_workshop;
import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class Task4 extends JFrame {

    JTextField nameField, userField;
    JPasswordField passField;
    JButton signupBtn;

    public Task4() {
        setTitle("Signup");
        setSize(300, 250);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JLabel nameLbl = new JLabel("Name:");
        nameLbl.setBounds(20, 30, 100, 25);
        add(nameLbl);

        nameField = new JTextField();
        nameField.setBounds(120, 30, 130, 25);
        add(nameField);

        JLabel userLbl = new JLabel("Username:");
        userLbl.setBounds(20, 70, 100, 25);
        add(userLbl);

        userField = new JTextField();
        userField.setBounds(120, 70, 130, 25);
        add(userField);

        JLabel passLbl = new JLabel("Password:");
        passLbl.setBounds(20, 110, 100, 25);
        add(passLbl);

        passField = new JPasswordField();
        passField.setBounds(120, 110, 130, 25);
        add(passField);

        signupBtn = new JButton("Sign Up");
        signupBtn.setBounds(90, 160, 100, 30);
        add(signupBtn);

        signupBtn.addActionListener(e -> signup());

        setVisible(true);
    }

    void signup() {
        try {
            Connection con = DBConnection.getConnection();
            String sql = "INSERT INTO users(name, username, password) VALUES (?, ?, ?)";
            PreparedStatement pst = con.prepareStatement(sql);

            pst.setString(1, nameField.getText());
            pst.setString(2, userField.getText());
            pst.setString(3, new String(passField.getPassword()));

            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Data Stored Successfully");
            
            pst.setString(1, nameField.getText());
            pst.setString(2, userField.getText());
            pst.setString(3, new String(passField.getPassword()));
            
            //Clear the Form
            nameField.setText("");
            userField.setText("");
            passField.setText("");
            
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Task4();
    }
}
