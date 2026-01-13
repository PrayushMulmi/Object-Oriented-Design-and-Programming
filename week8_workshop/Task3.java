package week8_workshop;

import java.awt.EventQueue;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;

public class Task3 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField celsiusInput;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Task3 frame = new Task3();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Task3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel celsiusToFahrenheitLabel = new JLabel("Celsius To Fahrenheit Converter");
		celsiusToFahrenheitLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		celsiusToFahrenheitLabel.setBounds(85, 33, 259, 26);
		contentPane.add(celsiusToFahrenheitLabel);
		
		JLabel celsiusLabel = new JLabel("Temperature (Celsius) : ");
		celsiusLabel.setBounds(69, 85, 149, 16);
		contentPane.add(celsiusLabel);
		
		celsiusInput = new JTextField();
		celsiusInput.setBounds(230, 80, 130, 26);
		contentPane.add(celsiusInput);
		celsiusInput.setColumns(10);
		
		JLabel fahrenheit = new JLabel("");
		fahrenheit.setBounds(103, 176, 217, 50);
		contentPane.add(fahrenheit);
		
		JButton submitBtn = new JButton("Calculate");
		submitBtn.setBounds(240, 118, 117, 29);
		contentPane.add(submitBtn);
		
		submitBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				double celsius = Double.parseDouble(celsiusInput.getText());
				double result = celsius * 1.8 + 32;
				
				fahrenheit.setText(celsius + " Celsius = " + result + " Fahrenheit");
				}
				catch(NumberFormatException ex) {
					System.out.println(ex.getMessage());
				}
				
			}
			
		});
	}

}
