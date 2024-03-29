import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;


public class Calculator {
	
	private static int width = 300;
	private static int height = 600;
	static private final JPanel topPanel = new JPanel();
	static JPanel bottomPanel = new JPanel();
	static JTextField field = new JTextField(10);
	static GridLayout gridLayout = new GridLayout(6, 3);
	static char operator;
	static float result;
	
	
	public static void main(String[] args) {										// MAIN
		SwingUtilities.invokeLater(new Runnable() {
        	@Override
            public void run() {
                createAndShowGUI();
            }
        });	
	}
	
	
	public static void createAndShowGUI() {											// creates UI
		
		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame frame = new JFrame("Calculator");
		Panel panelContainer = new Panel();
		BoxLayout boxLayout = new BoxLayout(panelContainer, BoxLayout.Y_AXIS);
		
		int windowsWidth = width;
		int windowsHeight = height;
		frame.setBounds((width - windowsWidth ) / 2, (height - windowsHeight) / 2, windowsWidth, windowsHeight);
        
		frame.setContentPane(panelContainer);
		panelContainer.setLayout(boxLayout);
		panelContainer.add(topPanel);
		panelContainer.add(bottomPanel);
		frame.setVisible(true);
		
		createPanels();		
	}
	
	
	public static void createPanels() {												// lays out the buttons for the user to see
		
		topPanel.add(field);
		bottomPanel.setLayout(gridLayout);
	
		JButton button1 = new JButton("1");
		JButton button2 = new JButton("2");
		JButton button3 = new JButton("3");
		JButton button4 = new JButton("4");
		JButton button5 = new JButton("5");
		JButton button6 = new JButton("6");
		JButton button7 = new JButton("7");
		JButton button8 = new JButton("8");
		JButton button9 = new JButton("9");
		JButton button0 = new JButton("0");
		JButton buttonDec = new JButton(".");
		JButton buttonMult = new JButton("*");
		JButton buttonDiv = new JButton("/");
		JButton buttonPlus = new JButton("+");
		JButton buttonMin = new JButton("-");
		JButton buttonEq = new JButton("=");
		JButton buttonClear = new JButton("C");
		JButton buttonBack = new JButton("<-");

		
		button1.addActionListener(new ActionListener() {							// this section adds action listeners for each of the 14 buttons
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == button1) {
					addNumToField(1);
				}
			}
		});
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == button2) {
					addNumToField(2);
				}
			}
		});
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == button3) {
					addNumToField(3);
				}
			}
		});button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == button4) {
					addNumToField(4);
				}
			}
		});
		button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == button5) {
					addNumToField(5);
				}
			}
		});
		button6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == button6) {
					addNumToField(6);
				}
			}
		});
		button7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == button7) {
					addNumToField(7);
				}
			}
		});
		button8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == button8) {
					addNumToField(8);
				}
			}
		});
		button9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == button9) {
					addNumToField(9);
				}
			}
		});
		button0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == button0) {
					addNumToField(0);
				}
			}
		});
		buttonDec.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == buttonDec) {
					addDecimalPoint();
				}
			}
		});
		buttonMult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == buttonMult) {
					addOperatorToField("*");
				}
			}
		});
		buttonDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == buttonDiv) {
					addOperatorToField("/");
				}
			}
		});
		buttonPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == buttonPlus) {
					addOperatorToField("+");
				}
			}
		});
		buttonMin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == buttonMin) {
					addOperatorToField("-");
				}
			}
		});
		buttonEq.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == buttonEq) {
					calculate(field);
				}
			}
		});
		buttonClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == buttonClear) {
					field.setText("");
				}
			}
		});
		buttonBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == buttonBack) {
					backSpace(field);
				}
			}
		});
		
		bottomPanel.add(button1);												// adds all buttons to bottom panel
		bottomPanel.add(button2);
		bottomPanel.add(button3);
		bottomPanel.add(button4);
		bottomPanel.add(button5);
		bottomPanel.add(button6);
		bottomPanel.add(button7);
		bottomPanel.add(button8);
		bottomPanel.add(button9);
		bottomPanel.add(button0);
		bottomPanel.add(buttonDec);
		bottomPanel.add(buttonMult);
		bottomPanel.add(buttonDiv);
		bottomPanel.add(buttonPlus);
		bottomPanel.add(buttonMin);
		bottomPanel.add(buttonEq);
		bottomPanel.add(buttonClear);
		bottomPanel.add(buttonBack);
	
	}
	
	
	public static void addNumToField(int number) {								// adds number to text field
		field.setEditable(true);
		String text = field.getText();
		text += number;
		field.setText(text);		
	}
	
	
	public static void addDecimalPoint(){
		String text = field.getText();
		text += ".";
		field.setText(text);
	}
	
		
	public static void addOperatorToField(String operator) {					// adds operator (+ - * /) to text field
		String text = field.getText();
		text = text + operator;
		field.setText(text);
	}
	
	
	public static void backSpace(JTextField field) {							// deletes last entered value in text field (a bit sloppy but it works) 
		String text = field.getText();
		String newText = "";
		char[] textChar = text.toCharArray();
		for(int i = 0; i < textChar.length - 1; i++) {
			newText += textChar[i];
		}
		field.setText(newText);
	}
	
	
	public static void calculate(JTextField field) {							// calculates the result given the text field
		String equation = field.getText();
		char[] equationChar = equation.toCharArray();
		String num1 = "";
		String num2 = "";
		//char[] operatorArray = {'-', '+', '*', '/'};
		boolean operatorPresent = false;
		
		for(int i = 0; i < equationChar.length; i++) {	
			if(equationChar[i] == '-' || equationChar[i] == '+' || equationChar[i] == '*' || equationChar[i] == '/'){
				if(equationChar[i] == '-' && i == 0){
					num1 += equationChar[i];
				}
				else{
					operator = equationChar[i];
					operatorPresent = true;
					continue;
				}
			}
			else if(operatorPresent == false){
				num1 += equationChar[i];
			}
			else if(operatorPresent == true){
				num2 += equationChar[i];
			}
		}
		if(operator == '+') {
			result = Float.parseFloat(num1) + Float.parseFloat(num2);
		}
		if(operator == '-') {
			result = Float.parseFloat(num1) - Float.parseFloat(num2);
		}
		if(operator == '*') {
			result = Float.parseFloat(num1) * Float.parseFloat(num2);
		}
		if(operator == '/') {
			result = Float.parseFloat(num1) / Float.parseFloat(num2);
		}
		field.setText(Float.toString(result));
	}
}