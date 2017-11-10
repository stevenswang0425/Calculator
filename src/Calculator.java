import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculator {

	private JFrame frame;
	private JTextField txtDisplay;
	private JButton btn_7;
	private JButton btn_negative;
	private JButton btn_percentage;
	private JButton btn_0;
	private JButton btn_division;
	private JButton btn_8;
	private JButton btn_9;
	private JButton btn_multiplication;
	private JButton btn_4;
	private JButton btn_5;
	private JButton btn_6;
	private JButton btn_subtraction;
	private JButton btn_1;
	private JButton btn_2;
	private JButton btn_3;
	private JButton btn_addition;
	private JButton btn_dot;
	private JButton btn_equal;
	
	private float firstNum;
	private float secondNum;
	private float result;
	private String operations;
	private String answer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 452, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtDisplay = new JTextField();
		txtDisplay.setFont(new Font("Apple Braille", Font.PLAIN, 40));
		txtDisplay.setHorizontalAlignment(SwingConstants.RIGHT);
		txtDisplay.setBounds(0, 0, 452, 106);
		frame.getContentPane().add(txtDisplay);
		txtDisplay.setColumns(10);
		txtDisplay.setText("0");
		
		
		//______________________ Row 1 ______________________
		
		JButton btn_clear = new JButton("C");
		btn_clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtDisplay.setText("0");
				firstNum = 0;
				secondNum = 0;
				operations = "";
			}
		});
		btn_clear.setFont(new Font("Apple Braille", Font.BOLD, 30));
		btn_clear.setBounds(0, 100, 117, 100);
		frame.getContentPane().add(btn_clear);
		
		btn_negative = new JButton("+/-");
		btn_negative.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float ops = Float.parseFloat(String.valueOf(txtDisplay.getText()));
				ops = ops * (-1);
				String temp = String.valueOf(ops);
				if (temp.substring(temp.length() - 1).equals(String.valueOf("0"))) {
					int i = (int) ops; 
					txtDisplay.setText(String.valueOf(i));
				} else {
					txtDisplay.setText(String.valueOf(ops));
				}
			}
		});
		btn_negative.setFont(new Font("Apple Braille", Font.BOLD, 30));
		btn_negative.setBounds(112, 100, 117, 100);
		frame.getContentPane().add(btn_negative);
		
		
		btn_percentage = new JButton("%");
		btn_percentage.setFont(new Font("Apple Braille", Font.BOLD, 30));
		btn_percentage.setBounds(225, 100, 117, 100);
		frame.getContentPane().add(btn_percentage);
		
		btn_division = new JButton("÷");
		btn_division.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Float.parseFloat(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "/";
			}
		});
		btn_division.setFont(new Font("Apple Braille", Font.BOLD, 30));
		btn_division.setBounds(335, 100, 117, 100);
		frame.getContentPane().add(btn_division);
		
		//______________________ Row 2 ______________________
		
		btn_7 = new JButton("7");
		btn_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txtDisplay.getText().equals("0")) {
					txtDisplay.setText(btn_7.getText());
				} else {
					String EnterNumber = txtDisplay.getText() + btn_7.getText();
					txtDisplay.setText(EnterNumber);
				}
			}
		});
		btn_7.setFont(new Font("Apple Braille", Font.BOLD, 30));
		btn_7.setBounds(0, 194, 117, 100);
		frame.getContentPane().add(btn_7);
		
		btn_8 = new JButton("8");
		btn_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txtDisplay.getText().equals("0")) {
					txtDisplay.setText(btn_8.getText());
				} else {
					String EnterNumber = txtDisplay.getText() + btn_8.getText();
					txtDisplay.setText(EnterNumber);
				}
			}
		});
		btn_8.setFont(new Font("Apple Braille", Font.BOLD, 30));
		btn_8.setBounds(112, 194, 117, 100);
		frame.getContentPane().add(btn_8);
		
		btn_9 = new JButton("9");
		btn_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txtDisplay.getText().equals("0")) {
					txtDisplay.setText(btn_9.getText());
				} else {
					String EnterNumber = txtDisplay.getText() + btn_9.getText();
					txtDisplay.setText(EnterNumber);
				}
			}
		});
		btn_9.setFont(new Font("Apple Braille", Font.BOLD, 30));
		btn_9.setBounds(225, 194, 117, 100);
		frame.getContentPane().add(btn_9);
		
		btn_multiplication = new JButton("×");
		btn_multiplication.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Float.parseFloat(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "*";
			}
		});
		btn_multiplication.setFont(new Font("Apple Braille", Font.BOLD, 30));
		btn_multiplication.setBounds(335, 194, 117, 100);
		frame.getContentPane().add(btn_multiplication);
		
		//______________________ Row 3 ______________________
		
		btn_4 = new JButton("4");
		btn_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txtDisplay.getText().equals("0")) {
					txtDisplay.setText(btn_4.getText());
				} else {
					String EnterNumber = txtDisplay.getText() + btn_4.getText();
					txtDisplay.setText(EnterNumber);
				}
			}
		});
		btn_4.setFont(new Font("Apple Braille", Font.BOLD, 30));
		btn_4.setBounds(0, 288, 117, 100);
		frame.getContentPane().add(btn_4);
		
		btn_5 = new JButton("5");
		btn_5.setFont(new Font("Apple Braille", Font.BOLD, 30));
		btn_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txtDisplay.getText().equals("0")) {
					txtDisplay.setText(btn_5.getText());
				} else {
					String EnterNumber = txtDisplay.getText() + btn_5.getText();
					txtDisplay.setText(EnterNumber);
				}
			}
		});
		btn_5.setBounds(112, 288, 117, 100);
		frame.getContentPane().add(btn_5);
		
		btn_6 = new JButton("6");
		btn_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txtDisplay.getText().equals("0")) {
					txtDisplay.setText(btn_6.getText());
				} else {
					String EnterNumber = txtDisplay.getText() + btn_6.getText();
					txtDisplay.setText(EnterNumber);
				}
			}
		});
		btn_6.setFont(new Font("Apple Braille", Font.BOLD, 30));
		btn_6.setBounds(225, 288, 117, 100);
		frame.getContentPane().add(btn_6);
		
		btn_subtraction = new JButton("−");
		btn_subtraction.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Float.parseFloat(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "-";
			}
		});
		btn_subtraction.setFont(new Font("Apple Braille", Font.BOLD, 30));
		btn_subtraction.setBounds(335, 288, 117, 100);
		frame.getContentPane().add(btn_subtraction);
		
		//______________________ Row 4 ______________________
		
		btn_1 = new JButton("1");
		btn_1.setFont(new Font("Apple Braille", Font.BOLD, 30));
		btn_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txtDisplay.getText().equals("0")) {
					txtDisplay.setText(btn_1.getText());
				} else {
					String EnterNumber = txtDisplay.getText() + btn_1.getText();
					txtDisplay.setText(EnterNumber);
				}
			}
		});
		btn_1.setBounds(0, 382, 117, 100);
		frame.getContentPane().add(btn_1);
		
		btn_2 = new JButton("2");
		btn_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txtDisplay.getText().equals("0")) {
					txtDisplay.setText(btn_2.getText());
				} else {
					String EnterNumber = txtDisplay.getText() + btn_2.getText();
					txtDisplay.setText(EnterNumber);
				}
			}
		});
		btn_2.setFont(new Font("Apple Braille", Font.BOLD, 30));
		btn_2.setBounds(112, 382, 117, 100);
		frame.getContentPane().add(btn_2);
		
		btn_3 = new JButton("3");
		btn_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txtDisplay.getText().equals("0")) {
					txtDisplay.setText(btn_3.getText());
				} else {
					String EnterNumber = txtDisplay.getText() + btn_3.getText();
					txtDisplay.setText(EnterNumber);
				}
			}
		});
		btn_3.setFont(new Font("Apple Braille", Font.BOLD, 30));
		btn_3.setBounds(225, 382, 117, 100);
		frame.getContentPane().add(btn_3);
		
		btn_addition = new JButton("+");
		btn_addition.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				String answer = null;
				firstNum = Float.parseFloat(txtDisplay.getText());
				txtDisplay.setText("");
				
//				if (operations == "") {
//					firstNum = Float.parseFloat(txtDisplay.getText());
//					txtDisplay.setText("");
//				} else if (operations == "+") {
//					secondNum = Float.parseFloat(txtDisplay.getText());
//					result = firstNum + secondNum;
//					answer = Float.toHexString(result);
//					txtDisplay.setText(answer);
//				}
				
				operations = "+";
			}
		});
		btn_addition.setFont(new Font("Apple Braille", Font.BOLD, 30));
		btn_addition.setBounds(335, 382, 117, 100);
		frame.getContentPane().add(btn_addition);
		
		//______________________ Row 5 ______________________
		
		btn_0 = new JButton("0");
		btn_0.setFont(new Font("Apple Braille", Font.BOLD, 30));
		btn_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!txtDisplay.getText().equals("0")) {
					String EnterNumber = txtDisplay.getText() + btn_0.getText();
					txtDisplay.setText(EnterNumber);
				}
			}
		});
		btn_0.setBounds(0, 476, 229, 100);
		frame.getContentPane().add(btn_0);
		
		
		btn_dot = new JButton(".");
		btn_dot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!txtDisplay.getText().contains(".")) {
					String EnterNumber = txtDisplay.getText() + btn_dot.getText();
					txtDisplay.setText(EnterNumber);
				}
			}
		});
		btn_dot.setFont(new Font("Apple Braille", Font.BOLD, 30));
		btn_dot.setBounds(225, 476, 117, 100);
		frame.getContentPane().add(btn_dot);
		
		btn_equal = new JButton("=");
		btn_equal.setFont(new Font("Apple Braille", Font.BOLD, 30));
		btn_equal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String answer = null;
				secondNum = Float.parseFloat(txtDisplay.getText());
				
				if (operations == "+") {
					result = firstNum + secondNum;
					answer = Float.toString(result);
				} 
				else if (operations == "-") {
					result = firstNum - secondNum;
					answer = Float.toString(result);	
				}
				else if (operations == "*") {
					result = firstNum * secondNum;
					answer = Float.toString(result);
				}
				else if (operations == "/") {
					result = firstNum / secondNum;
					answer = Float.toString(result);
				}
				else if (operations == "") {
					answer = Float.toString(secondNum);
				}
				
				if (answer != null && answer.contains(".")) {
					while (answer.substring(answer.length() - 1).equals(String.valueOf("0"))) {
						answer = answer.substring(0, answer.length() - 1); 
					}
					if (answer.substring(answer.length() - 1).equals(String.valueOf("."))) {
						answer = answer.substring(0, answer.length() - 1);
					}
				}
				
				txtDisplay.setText(answer);
				operations = "";
				
			}
		});
		btn_equal.setBounds(335, 476, 117, 100);
		frame.getContentPane().add(btn_equal);
	}
}
