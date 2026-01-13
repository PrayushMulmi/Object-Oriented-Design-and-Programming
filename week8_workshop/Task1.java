package week8_workshop;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Task1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField fullNameField;
	private JTextField emailAddressField;
	private JTextField dateOfBirthField;
	private JTextField genderField;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Task1 frame = new Task1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Task1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel formRegistration = new JLabel("User Form Registration");
		formRegistration.setBounds(144, 6, 144, 16);
		contentPane.add(formRegistration);
		
		JLabel fullName = new JLabel("Full Name : ");
		fullName.setBounds(21, 36, 75, 16);
		contentPane.add(fullName);
		
		JLabel emailAddress = new JLabel("Email Address : ");
		emailAddress.setBounds(21, 83, 101, 16);
		contentPane.add(emailAddress);
		
		JLabel dateOfBirth = new JLabel("Date of Birth :");
		dateOfBirth.setBounds(21, 128, 101, 16);
		contentPane.add(dateOfBirth);
		
		JLabel gender = new JLabel("Gender : ");
		gender.setBounds(21, 172, 101, 16);
		contentPane.add(gender);
		
		fullNameField = new JTextField();
		fullNameField.setBounds(158, 31, 130, 26);
		contentPane.add(fullNameField);
		fullNameField.setColumns(10);
		
		emailAddressField = new JTextField();
		emailAddressField.setColumns(10);
		emailAddressField.setBounds(158, 78, 130, 26);
		contentPane.add(emailAddressField);
		
		dateOfBirthField = new JTextField();
		dateOfBirthField.setColumns(10);
		dateOfBirthField.setBounds(158, 123, 130, 26);
		contentPane.add(dateOfBirthField);
		
		genderField = new JTextField();
		genderField.setColumns(10);
		genderField.setBounds(158, 167, 130, 26);
		contentPane.add(genderField);
		
		JButton submitButton = new JButton("Submit");
		submitButton.setBounds(171, 224, 117, 29);
		contentPane.add(submitButton);
	}
}
