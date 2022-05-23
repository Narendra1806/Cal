import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class Calculator {

	private JFrame frame;
	private JTextField textField;
	private JTextField txtDesignedByNarendra;
	
	double first;
	double second;
	double result;
	String operations;
	String answer;
	private final ButtonGroup buttonGroup = new ButtonGroup();

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
		frame.setTitle("  ");
		frame.setBounds(100, 100, 403, 692);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SCIENTIFIC CALCULATOR");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel.setBounds(32, 13, 323, 37);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 35));
		textField.setBounds(12, 52, 359, 56);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		final JButton btnNewButton = new JButton("1/x");
		btnNewButton.setEnabled(false);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = 1/(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnNewButton.setFont(new Font("Verdana", Font.PLAIN, 20));
		btnNewButton.setBounds(12, 224, 69, 62);
		frame.getContentPane().add(btnNewButton);
		
		final JButton btnLog = new JButton("Log");
		btnLog.setEnabled(false);
		btnLog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.log(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnLog.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnLog.setBounds(85, 224, 69, 62);
		frame.getContentPane().add(btnLog);
		
		final JButton btnPercent = new JButton("%");
		btnPercent.setEnabled(false);
		btnPercent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operations="%";
			}
		});
		btnPercent.setFont(new Font("Stencil", Font.BOLD, 40));
		btnPercent.setBounds(85, 291, 69, 62);
		frame.getContentPane().add(btnPercent);
		
		final JButton btnClear = new JButton("C");
		btnClear.setEnabled(false);
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnClear.setFont(new Font("Stencil", Font.BOLD, 40));
		btnClear.setBounds(158, 291, 69, 62);
		frame.getContentPane().add(btnClear);
		
		final JButton btnBack = new JButton("<-");
		btnBack.setEnabled(false);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backSpace=null;
				if(textField.getText().length()>0);{
				StringBuilder str = new StringBuilder(textField.getText());
				str.deleteCharAt(textField.getText().length()-1);
				backSpace = str.toString();
				textField.setText(backSpace);
				}
			}
		});
		btnBack.setFont(new Font("Wide Latin", Font.BOLD, 27));
		btnBack.setBounds(231, 291, 69, 62);
		frame.getContentPane().add(btnBack);
		
		final JButton btnPlus = new JButton("+");
		btnPlus.setEnabled(false);
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operations="+";
			}
		});
		btnPlus.setFont(new Font("Stencil", Font.BOLD, 40));
		btnPlus.setBounds(302, 291, 69, 62);
		frame.getContentPane().add(btnPlus);
		
		final JButton btn7 = new JButton("7");
		btn7.setEnabled(false);
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn7.getText();
				textField.setText(number);
			}
		});
		btn7.setFont(new Font("Stencil", Font.BOLD, 40));
		btn7.setBounds(85, 358, 69, 62);
		frame.getContentPane().add(btn7);
		
		final JButton btn8 = new JButton("8");
		btn8.setEnabled(false);
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn8.getText();
				textField.setText(number);
			}
		});
		btn8.setFont(new Font("Stencil", Font.BOLD, 40));
		btn8.setBounds(158, 358, 69, 62);
		frame.getContentPane().add(btn8);
		
		final JButton btn9 = new JButton("9");
		btn9.setEnabled(false);
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn9.getText();
				textField.setText(number);
			}
		});
		btn9.setFont(new Font("Stencil", Font.BOLD, 40));
		btn9.setBounds(231, 358, 69, 62);
		frame.getContentPane().add(btn9);
		
		final JButton btnMinus = new JButton("-");
		btnMinus.setEnabled(false);
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operations="-";
			}
		});
		btnMinus.setFont(new Font("Stencil", Font.BOLD, 40));
		btnMinus.setBounds(302, 358, 69, 62);
		frame.getContentPane().add(btnMinus);
		
		final JButton btnX = new JButton("X^2");
		btnX.setEnabled(false);
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = (Double.parseDouble(textField.getText()));
				a = a*a;
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnX.setFont(new Font("Yu Gothic", Font.BOLD, 18));
		btnX.setBounds(12, 425, 69, 62);
		frame.getContentPane().add(btnX);
		
		final JButton btn4 = new JButton("4");
		btn4.setEnabled(false);
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn4.getText();
				textField.setText(number);
			}
		});
		btn4.setFont(new Font("Stencil", Font.BOLD, 40));
		btn4.setBounds(85, 425, 69, 62);
		frame.getContentPane().add(btn4);
		
		final JButton btn5 = new JButton("5");
		btn5.setEnabled(false);
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn5.getText();
				textField.setText(number);
			}
		});
		btn5.setFont(new Font("Stencil", Font.BOLD, 40));
		btn5.setBounds(158, 425, 69, 62);
		frame.getContentPane().add(btn5);
		
		final JButton btn6 = new JButton("6");
		btn6.setEnabled(false);
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn6.getText();
				textField.setText(number);
			}
		});
		btn6.setFont(new Font("Stencil", Font.BOLD, 40));
		btn6.setBounds(231, 425, 69, 62);
		frame.getContentPane().add(btn6);
		
		final JButton btnStar = new JButton("*");
		btnStar.setEnabled(false);
		btnStar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operations="*";
			}
		});
		btnStar.setFont(new Font("Stencil", Font.BOLD, 40));
		btnStar.setBounds(302, 425, 69, 62);
		frame.getContentPane().add(btnStar);
		
		final JButton btn = new JButton("n!");
		btn.setEnabled(false);
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Double.parseDouble(textField.getText());
				double fact = 1;
				while(a!=0) {
					fact = fact*a;
					a--;
				}
				textField.setText("");
				textField.setText(textField.getText()+fact);
			}
		});
		btn.setFont(new Font("Sylfaen", Font.BOLD, 30));
		btn.setBounds(12, 491, 69, 62);
		frame.getContentPane().add(btn);
		
		final JButton btn1 = new JButton("1");
		btn1.setEnabled(false);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn1.getText();
				textField.setText(number);
			}
		});
		btn1.setFont(new Font("Stencil", Font.BOLD, 40));
		btn1.setBounds(85, 491, 69, 62);
		frame.getContentPane().add(btn1);
		
		final JButton btn2 = new JButton("2");
		btn2.setEnabled(false);
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn2.getText();
				textField.setText(number);
			}
		});
		btn2.setFont(new Font("Stencil", Font.BOLD, 40));
		btn2.setBounds(158, 491, 69, 62);
		frame.getContentPane().add(btn2);
		
		final JButton btn3 = new JButton("3");
		btn3.setEnabled(false);
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn3.getText();
				textField.setText(number);
			}
		});
		btn3.setFont(new Font("Stencil", Font.BOLD, 40));
		btn3.setBounds(231, 491, 69, 62);
		frame.getContentPane().add(btn3);
		
		final JButton btnDiv = new JButton("/");
		btnDiv.setEnabled(false);
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operations="/";
			}
		});
		btnDiv.setFont(new Font("Stencil", Font.BOLD, 40));
		btnDiv.setBounds(302, 491, 69, 62);
		frame.getContentPane().add(btnDiv);
		
		final JButton btnPlusMinus = new JButton("+/-");
		btnPlusMinus.setEnabled(false);
		btnPlusMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Double.parseDouble(String.valueOf(textField.getText()));
				a = a*(-1);
				textField.setText(String.valueOf(a));
			}
		});
		btnPlusMinus.setFont(new Font("Sitka Text", Font.BOLD, 18));
		btnPlusMinus.setBounds(12, 558, 69, 62);
		frame.getContentPane().add(btnPlusMinus);
		
		final JButton button_25 = new JButton("0");
		button_25.setEnabled(false);
		button_25.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+button_25.getText();
				textField.setText(number);
			}
		});
		button_25.setFont(new Font("Stencil", Font.BOLD, 40));
		button_25.setBounds(85, 558, 142, 62);
		frame.getContentPane().add(button_25);
		
		final JButton btnDot = new JButton(".");
		btnDot.setEnabled(false);
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btnDot.getText();
				textField.setText(number);
			}
		});
		btnDot.setFont(new Font("Stencil", Font.BOLD, 40));
		btnDot.setBounds(231, 558, 69, 62);
		frame.getContentPane().add(btnDot);
		
		final JButton btnEqual = new JButton("=");
		btnEqual.setEnabled(false);
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				second = Double.parseDouble(textField.getText());
				if(operations == "+") {
					result = first + second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
//				second = Double.parseDouble(textField.getText());
				else if(operations == "-") {
					result = first - second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
//				second = Double.parseDouble(textField.getText());
				else if(operations == "%") {
					result = first % second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
//				second = Double.parseDouble(textField.getText());
				else if(operations == "*") {
					result = first * second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operations == "/") {
					result = first / second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operations == "X^Y") {
					double resultt = 1;
					for(int i = 0; i < second; i++) {
						resultt= first*resultt;
					}
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				
			}
		});
		btnEqual.setFont(new Font("Stencil", Font.BOLD, 40));
		btnEqual.setBounds(302, 558, 69, 62);
		frame.getContentPane().add(btnEqual);
		
		txtDesignedByNarendra = new JTextField();
		txtDesignedByNarendra.setEditable(false);
		txtDesignedByNarendra.setBackground(UIManager.getColor("Button.background"));
		txtDesignedByNarendra.setFont(new Font("Segoe Print", Font.PLAIN, 13));
		txtDesignedByNarendra.setText("- Designed by Narendra More");
		txtDesignedByNarendra.setBounds(168, 623, 205, 22);
		frame.getContentPane().add(txtDesignedByNarendra);
		txtDesignedByNarendra.setColumns(10);
		
		final JButton btnX_1 = new JButton("X^3");
		btnX_1.setEnabled(false);
		btnX_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = (Double.parseDouble(textField.getText()));
				a = a*a*a;
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnX_1.setFont(new Font("Yu Gothic", Font.BOLD, 18));
		btnX_1.setBounds(12, 358, 69, 62);
		frame.getContentPane().add(btnX_1);
		
		final JButton btnXy = new JButton("X^Y");
		btnXy.setEnabled(false);
		btnXy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operations="X^Y";
			}
		});
		btnXy.setFont(new Font("Yu Gothic", Font.BOLD, 18));
		btnXy.setBounds(12, 291, 69, 62);
		frame.getContentPane().add(btnXy);
		
		final JButton btnRoot = new JButton("\u221A");
		btnRoot.setEnabled(false);
		btnRoot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.sqrt(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			
			}
		});
		btnRoot.setFont(new Font("Stencil", Font.BOLD, 40));
		btnRoot.setBounds(12, 159, 69, 62);
		frame.getContentPane().add(btnRoot);
		
		final JButton btnEx = new JButton("e^x");
		btnEx.setEnabled(false);
		btnEx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.exp(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnEx.setFont(new Font("Sylfaen", Font.PLAIN, 20));
		btnEx.setBounds(85, 159, 69, 62);
		frame.getContentPane().add(btnEx);
		
		final JButton btnSin = new JButton("Sin");
		btnSin.setEnabled(false);
		btnSin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.sin(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnSin.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnSin.setBounds(158, 159, 69, 62);
		frame.getContentPane().add(btnSin);
		
		final JButton btnSinh = new JButton("Sinh");
		btnSinh.setEnabled(false);
		btnSinh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.sinh(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnSinh.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnSinh.setBounds(158, 224, 69, 62);
		frame.getContentPane().add(btnSinh);
		
		final JButton btnCosh = new JButton("Cosh");
		btnCosh.setEnabled(false);
		btnCosh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.cosh(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnCosh.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnCosh.setBounds(231, 224, 69, 62);
		frame.getContentPane().add(btnCosh);
		
		final JButton btnTanh_1 = new JButton("Tanh");
		btnTanh_1.setEnabled(false);
		btnTanh_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.sinh(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnTanh_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnTanh_1.setBounds(302, 224, 69, 62);
		frame.getContentPane().add(btnTanh_1);
		
		final JButton btnCos = new JButton("Cos");
		btnCos.setEnabled(false);
		btnCos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.cos(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnCos.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btnCos.setBounds(231, 159, 69, 62);
		frame.getContentPane().add(btnCos);
		
		final JButton btnTan = new JButton("Tan");
		btnTan.setEnabled(false);
		btnTan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.tan(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnTan.setFont(new Font("Tahoma", Font.PLAIN, 21));
		btnTan.setBounds(302, 159, 69, 62);
		frame.getContentPane().add(btnTan);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("ON");
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton.setEnabled(true);
				btnLog.setEnabled(true);
				btnPercent.setEnabled(true);
				btnClear.setEnabled(true);
				btnBack.setEnabled(true);
				btnPlus.setEnabled(true);
				btn7.setEnabled(true);
				btn8.setEnabled(true);
				btn9.setEnabled(true);
				btnX.setEnabled(true);
				btn4.setEnabled(true);
				btn5.setEnabled(true);
				btnStar.setEnabled(true);
				btn6.setEnabled(true);
				btn.setEnabled(true);
				btn1.setEnabled(true);
				btn2.setEnabled(true);
				btn3.setEnabled(true);
				btnDiv.setEnabled(true);
				btnPlusMinus.setEnabled(true);
				btnDot.setEnabled(true);
				btnEqual.setEnabled(true);
				btnX_1.setEnabled(true);
				btnXy.setEnabled(true);
				btnRoot.setEnabled(true);
				btnEx.setEnabled(true);
				btnSin.setEnabled(true);
				btnCos.setEnabled(true);
				btnTan.setEnabled(true);
				btnTanh_1.setEnabled(true);
				btnCosh.setEnabled(true);
				btnSinh.setEnabled(true);
				button_25.setEnabled(true);
				btnMinus.setEnabled(true);
				textField.setEnabled(true);

			}
		});
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		rdbtnNewRadioButton.setBounds(12, 117, 53, 33);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnOff = new JRadioButton("OFF");
		rdbtnOff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton.setEnabled(false);
				btnLog.setEnabled(false);
				btnPercent.setEnabled(false);
				btnClear.setEnabled(false);
				btnBack.setEnabled(false);
				btnPlus.setEnabled(false);
				btn7.setEnabled(false);
				btn8.setEnabled(false);
				btn9.setEnabled(false);
				btnX.setEnabled(false);
				btn4.setEnabled(false);
				btn5.setEnabled(false);
				btnStar.setEnabled(false);
				btn6.setEnabled(false);
				btn.setEnabled(false);
				btn1.setEnabled(false);
				btn2.setEnabled(false);
				btn3.setEnabled(false);
				btnDiv.setEnabled(false);
				btnPlusMinus.setEnabled(false);
				btnDot.setEnabled(false);
				btnEqual.setEnabled(false);
				btnX_1.setEnabled(false);
				btnXy.setEnabled(false);
				btnRoot.setEnabled(false);
				btnEx.setEnabled(false);
				btnSin.setEnabled(false);
				btnCos.setEnabled(false);
				btnTan.setEnabled(false);
				btnTanh_1.setEnabled(false);
				btnCosh.setEnabled(false);
				btnSinh.setEnabled(false);
				button_25.setEnabled(false);
				btnMinus.setEnabled(false);
				textField.setEnabled(false);
			}
		});
		buttonGroup.add(rdbtnOff);
		rdbtnOff.setFont(new Font("Tahoma", Font.PLAIN, 18));
		rdbtnOff.setBounds(69, 117, 59, 33);
		frame.getContentPane().add(rdbtnOff);
	}
}
