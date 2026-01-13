package week8_workshop;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Task5 extends JFrame {

    JTextField nameField;
    JButton fetchBtn;
    JLabel resultLbl;

    public Task5() {
        setTitle("Fetch User");
        setSize(300, 200);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JLabel nameLbl = new JLabel("Enter Name:");
        nameLbl.setBounds(20, 30, 100, 25);
        add(nameLbl);

        nameField = new JTextField();
        nameField.setBounds(120, 30, 130, 25);
        add(nameField);

        fetchBtn = new JButton("Fetch");
        fetchBtn.setBounds(90, 70, 100, 30);
        add(fetchBtn);

        resultLbl = new JLabel("");
        resultLbl.setBounds(20, 120, 250, 25);
        add(resultLbl);

        fetchBtn.addActionListener(e -> fetchUser());

        setVisible(true);
    }

    void fetchUser() {
        try {
            Connection con = DBConnection.getConnection();
            String sql = "SELECT username FROM users WHERE name=?";
            PreparedStatement pst = con.prepareStatement(sql);

            pst.setString(1, nameField.getText());
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                resultLbl.setText("Username: " + rs.getString("username"));
            } else {
                resultLbl.setText("No user found");
            }

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Task5();
    }
}
