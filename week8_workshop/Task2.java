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

public class Task2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField firstNumberInput;
	private JTextField operatorInput;
	private JTextField secondNumberInput;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Task2 frame = new Task2();
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
	public Task2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel calculatorLabel = new JLabel("Simple Calculator");
		calculatorLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		calculatorLabel.setBounds(133, 19, 157, 16);
		contentPane.add(calculatorLabel);
		
		JLabel firstNumber = new JLabel("First Number : ");
		firstNumber.setBounds(36, 57, 100, 16);
		contentPane.add(firstNumber);
		
		JLabel operator = new JLabel("Operator(+, -, * , /) : ");
		operator.setBounds(36, 98, 134, 16);
		contentPane.add(operator);
		
		JLabel secondNumber = new JLabel("Second Number : ");
		secondNumber.setBounds(36, 140, 111, 16);
		contentPane.add(secondNumber);
		
		firstNumberInput = new JTextField();
		firstNumberInput.setBounds(211, 52, 130, 26);
		contentPane.add(firstNumberInput);
		firstNumberInput.setColumns(10);
		
		operatorInput = new JTextField();
		operatorInput.setColumns(10);
		operatorInput.setBounds(211, 93, 130, 26);
		contentPane.add(operatorInput);
		
		secondNumberInput = new JTextField();
		secondNumberInput.setColumns(10);
		secondNumberInput.setBounds(211, 135, 130, 26);
		contentPane.add(secondNumberInput);
		
		JButton submitBtn = new JButton("Calculate");
		submitBtn.setBounds(221, 183, 117, 29);
		contentPane.add(submitBtn);
		
		JLabel result = new JLabel("");
		result.setBounds(55, 224, 222, 27);
		contentPane.add(result);
		
		submitBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					// 1. Read inputs
					double num1 = Double.parseDouble(firstNumberInput.getText());
					double num2 = Double.parseDouble(secondNumberInput.getText());
					String operator = operatorInput.getText();

					double answer = 0;

					// 2. Perform calculation
					switch (operator) {
						case "+":
							answer = num1 + num2;
							break;
						case "-":
							answer = num1 - num2;
							break;
						case "*":
							answer = num1 * num2;
							break;
						case "/":
							if (num2 == 0) {
								result.setText("Error: Division by zero");
								return;
							}
							answer = num1 / num2;
							break;
						default:
							result.setText("Invalid operator");
							return;
					}

					// 3. Display result
					result.setText("Result: " + answer);

				} catch (NumberFormatException ex) {
					result.setText("Please enter valid numbers");
				}
			}
		});
		
	}

}
