package Miniräknare;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.UIManager;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Kalk {

	private JFrame frame;
	private JTextField textField;
	private JTextField textOutput;
	
	double firstNum;
	double secondNum;
	double result;
	String operations;
	String answer;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Kalk window = new Kalk();
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
	public Kalk() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.getContentPane().setBackground(Color.BLACK);
		frame.getContentPane().setFont(new Font("Tahoma", Font.BOLD, 20));
		frame.setBounds(100, 100, 286, 497);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				
				if (e.getKeyChar() >= '0' && e.getKeyChar() <= '9') {
	            	textField.setEditable(true);
	            } else {
	            	textField.setEditable(false);
	            }
				
			}
		});
		textField.setBorder(null);
		textField.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(12, 53, 256, 62);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		textField.setEditable(false);
		
		
		
		textOutput = new JTextField();
		textOutput.setBorder(null);
		textOutput.setForeground(Color.LIGHT_GRAY);
		textOutput.setBackground(UIManager.getColor("Button.light"));
		textOutput.setHorizontalAlignment(SwingConstants.RIGHT);
		textOutput.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textOutput.setColumns(10);
		textOutput.setEditable(false);
		textOutput.setBounds(12, 13, 256, 48);
		frame.getContentPane().add(textOutput);
		
		
		JButton btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText(null);
			}
		});
		btnClear.setForeground(new Color(255, 255, 255));
		btnClear.setBackground(new Color(0, 0, 0));
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnClear.setBounds(12, 128, 122, 55);
		frame.getContentPane().add(btnClear);
		
		JButton btn7 = new JButton("7");
		btn7.setForeground(new Color(255, 250, 250));
		btn7.setBackground(new Color(25, 25, 112));
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNum = textField.getText() + btn7.getText();
				textField.setText(EnterNum);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn7.setBounds(12, 196, 55, 55);
		frame.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNum = textField.getText() + btn8.getText();
				textField.setText(EnterNum);
			}
		});
		btn8.setForeground(new Color(255, 250, 250));
		btn8.setBackground(new Color(25, 25, 112));
		btn8.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn8.setBounds(79, 196, 55, 55);
		frame.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNum = textField.getText() + btn9.getText();
				textField.setText(EnterNum);
			}
		});
		btn9.setForeground(new Color(255, 250, 250));
		btn9.setBackground(new Color(25, 25, 112));
		btn9.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn9.setBounds(146, 196, 55, 55);
		frame.getContentPane().add(btn9);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNum = textField.getText() + btn4.getText();
				textField.setText(EnterNum);
			}
		});
		btn4.setForeground(new Color(255, 250, 250));
		btn4.setBackground(new Color(25, 25, 112));
		btn4.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn4.setBounds(12, 264, 55, 55);
		frame.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNum = textField.getText() + btn5.getText();
				textField.setText(EnterNum);
			}
		});
		btn5.setForeground(new Color(255, 250, 250));
		btn5.setBackground(new Color(25, 25, 112));
		btn5.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn5.setBounds(79, 264, 55, 55);
		frame.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNum = textField.getText() + btn6.getText();
				textField.setText(EnterNum);
			}
		});
		btn6.setForeground(new Color(255, 250, 250));
		btn6.setBackground(new Color(25, 25, 112));
		btn6.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn6.setBounds(146, 264, 55, 55);
		frame.getContentPane().add(btn6);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNum = textField.getText() + btn1.getText();
				textField.setText(EnterNum);
			}
		});
		btn1.setForeground(new Color(255, 250, 250));
		btn1.setBackground(new Color(25, 25, 112));
		btn1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn1.setBounds(12, 332, 55, 55);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNum = textField.getText() + btn2.getText();
				textField.setText(EnterNum);
			}
		});
		btn2.setForeground(new Color(255, 250, 250));
		btn2.setBackground(new Color(25, 25, 112));
		btn2.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn2.setBounds(79, 332, 55, 55);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNum = textField.getText() + btn3.getText();
				textField.setText(EnterNum);
			}
		});
		btn3.setForeground(new Color(255, 250, 250));
		btn3.setBackground(new Color(25, 25, 112));
		btn3.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn3.setBounds(146, 332, 55, 55);
		frame.getContentPane().add(btn3);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNum = textField.getText() + btn0.getText();
				textField.setText(EnterNum);
			}
		});
		btn0.setForeground(new Color(255, 250, 250));
		btn0.setBackground(new Color(25, 25, 112));
		btn0.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn0.setBounds(12, 395, 123, 55);
		frame.getContentPane().add(btn0);
		
		JButton btnDec = new JButton(",");
		btnDec.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNum = textField.getText() + btnDec.getText();
				textField.setText(EnterNum);
				
			}
		});
		btnDec.setForeground(Color.WHITE);
		btnDec.setBackground(Color.BLACK);
		btnDec.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnDec.setBounds(146, 395, 55, 55);
		frame.getContentPane().add(btnDec);
		
		JButton btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstNum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "/";
			}
		});
		btnDiv.setForeground(new Color(255, 255, 255));
		btnDiv.setBackground(new Color(0, 0, 0));
		btnDiv.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnDiv.setBounds(146, 128, 55, 55);
		frame.getContentPane().add(btnDiv);
		
		JButton btnMulti = new JButton("*");
		btnMulti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstNum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "*";
			}
		});
		btnMulti.setForeground(new Color(255, 255, 255));
		btnMulti.setBackground(new Color(0, 0, 0));
		btnMulti.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnMulti.setBounds(213, 128, 55, 55);
		frame.getContentPane().add(btnMulti);
		
		JButton btnSub = new JButton("-");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstNum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "-";
			}
		});
		btnSub.setForeground(new Color(255, 255, 255));
		btnSub.setBackground(new Color(0, 0, 0));
		btnSub.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnSub.setBounds(213, 196, 55, 55);
		frame.getContentPane().add(btnSub);
		
		JButton btnAdd = new JButton("+");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstNum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "+";
				
			}
		});
		btnAdd.setForeground(new Color(255, 255, 255));
		btnAdd.setBackground(new Color(0, 0, 0));
		btnAdd.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnAdd.setBounds(213, 264, 55, 55);
		frame.getContentPane().add(btnAdd);
		
		JButton btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				secondNum = Double.parseDouble(textField.getText());
				
				if (operations == "+") {
					
					result = firstNum + secondNum;
					answer = String.valueOf(result);
					textField.setText(answer);
				}
				
				else if (operations == "-") {
					
					result = firstNum - secondNum;
					answer = String.valueOf(result);
					textField.setText(answer);
				}
				
				else if (operations == "*") {
					
					result = firstNum * secondNum;
					answer = String.valueOf(result);
					textField.setText(answer);
				}
				
				else if (operations == "/") {
					
					result = firstNum / secondNum;
					answer = String.valueOf(result);
					textField.setText(answer);
				}
				
			}
		});
		btnEqual.setForeground(new Color(255, 255, 255));
		btnEqual.setBackground(new Color(0, 0, 0));
		btnEqual.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnEqual.setBounds(213, 327, 55, 123);
		frame.getContentPane().add(btnEqual);
		
		
	}
}
