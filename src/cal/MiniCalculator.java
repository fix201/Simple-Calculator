package cal;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

public class MiniCalculator {

	JFrame frame;
	private JTextField display;

	/**
	 * Create the application.
	 */
	public MiniCalculator() {
		initialize();
	}

	public JTextField getDisplay() {
		return display;
	}

	public void setDisplay(JTextField display) {
		this.display = display;
		System.out.println(this.display);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 513, 695);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		display = new JTextField();
		display.setBackground(Color.LIGHT_GRAY);
		display.setForeground(Color.BLACK);
		display.setFont(new Font("Times New Roman", Font.BOLD, 54));
		display.setHorizontalAlignment(SwingConstants.RIGHT);
		display.setText("0");
		display.setEditable(true);
		display.setBounds(15, 16, 456, 93);
		display.setColumns(10);
		display.addActionListener(new ActionListeners());
		display.addKeyListener(new KeyListeners());
		frame.getContentPane().add(display);

		JButton ac = new JButton("AC");
		ac.setBackground(UIManager.getColor("Button.darkShadow"));
		ac.setFont(new Font("Times New Roman", Font.BOLD, 40));
		ac.setBounds(15, 125, 98, 80);
		ac.addActionListener(new ActionListeners());
		frame.getContentPane().add(ac);

		JButton seven = new JButton("7");
		seven.setBackground(UIManager.getColor("Button.darkShadow"));
		seven.setFont(new Font("Times New Roman", Font.BOLD, 40));
		seven.setBounds(15, 227, 98, 80);
		seven.addActionListener(new ActionListeners());
		frame.getContentPane().add(seven);

		JButton four = new JButton("4");
		four.setBackground(UIManager.getColor("Button.darkShadow"));
		four.setFont(new Font("Times New Roman", Font.BOLD, 40));
		four.setBounds(15, 334, 98, 80);
		four.addActionListener(new ActionListeners());
		frame.getContentPane().add(four);

		JButton plus_or_minus = new JButton("+/ -");
		plus_or_minus.setBackground(UIManager.getColor("Button.darkShadow"));
		plus_or_minus.setFont(new Font("Times New Roman", Font.BOLD, 40));
		plus_or_minus.setBounds(136, 125, 98, 80);
		plus_or_minus.addActionListener(new ActionListeners());
		frame.getContentPane().add(plus_or_minus);

		JButton percent = new JButton("%");
		percent.setBackground(UIManager.getColor("Button.darkShadow"));
		percent.setFont(new Font("Times New Roman", Font.BOLD, 40));
		percent.setBounds(249, 125, 98, 80);
		percent.addActionListener(new ActionListeners());
		frame.getContentPane().add(percent);

		JButton divide = new JButton("/");
		divide.setBackground(UIManager.getColor("Button.darkShadow"));
		divide.setFont(new Font("Times New Roman", Font.BOLD, 40));
		divide.setBounds(373, 125, 98, 80);
		divide.addActionListener(new ActionListeners());
		frame.getContentPane().add(divide);

		JButton eight = new JButton("8");
		eight.setBackground(UIManager.getColor("Button.darkShadow"));
		eight.setFont(new Font("Times New Roman", Font.BOLD, 40));
		eight.setBounds(136, 227, 98, 80);
		eight.addActionListener(new ActionListeners());
		frame.getContentPane().add(eight);

		JButton nine = new JButton("9");
		nine.setBackground(UIManager.getColor("Button.darkShadow"));
		nine.setFont(new Font("Times New Roman", Font.BOLD, 40));
		nine.setBounds(249, 227, 98, 80);
		nine.addActionListener(new ActionListeners());
		frame.getContentPane().add(nine);

		JButton multiply = new JButton("x");
		multiply.setBackground(UIManager.getColor("Button.darkShadow"));
		multiply.setFont(new Font("Times New Roman", Font.BOLD, 40));
		multiply.setBounds(373, 227, 98, 80);
		multiply.addActionListener(new ActionListeners());
		frame.getContentPane().add(multiply);

		JButton five = new JButton("5");
		five.setBackground(UIManager.getColor("Button.darkShadow"));
		five.setFont(new Font("Times New Roman", Font.BOLD, 40));
		five.setBounds(136, 334, 98, 80);
		five.addActionListener(new ActionListeners());
		frame.getContentPane().add(five);

		JButton six = new JButton("6");
		six.setBackground(UIManager.getColor("Button.darkShadow"));
		six.setFont(new Font("Times New Roman", Font.BOLD, 40));
		six.setBounds(249, 334, 98, 80);
		six.addActionListener(new ActionListeners());
		frame.getContentPane().add(six);

		JButton subtract = new JButton("-");
		subtract.setBackground(UIManager.getColor("Button.darkShadow"));
		subtract.setFont(new Font("Times New Roman", Font.BOLD, 40));
		subtract.setBounds(373, 334, 98, 80);
		subtract.addActionListener(new ActionListeners());
		frame.getContentPane().add(subtract);

		JButton zero = new JButton("0");
		zero.setBackground(UIManager.getColor("Button.darkShadow"));
		zero.setFont(new Font("Times New Roman", Font.BOLD, 40));
		zero.addActionListener(new ActionListeners());
		zero.setBounds(15, 532, 219, 80);
		frame.getContentPane().add(zero);

		JButton decimal = new JButton(".");
		decimal.setBackground(UIManager.getColor("Button.darkShadow"));
		decimal.setFont(new Font("Times New Roman", Font.BOLD, 40));
		decimal.setBounds(249, 532, 98, 80);
		decimal.addActionListener(new ActionListeners());
		frame.getContentPane().add(decimal);

		JButton result = new JButton("=");
		result.setBackground(UIManager.getColor("Button.darkShadow"));
		result.setFont(new Font("Times New Roman", Font.BOLD, 40));
		result.setBounds(373, 532, 98, 80);
		result.addActionListener(new ActionListeners());
		frame.getContentPane().add(result);

		JButton one = new JButton("1");
		one.setBackground(UIManager.getColor("Button.darkShadow"));
		one.setFont(new Font("Times New Roman", Font.BOLD, 40));
		one.addActionListener(new ActionListeners());
		one.setBounds(15, 436, 98, 80);
		frame.getContentPane().add(one);

		JButton two = new JButton("2");
		two.setBackground(UIManager.getColor("Button.darkShadow"));
		two.setFont(new Font("Times New Roman", Font.BOLD, 40));
		two.addActionListener(new ActionListeners());
		two.setBounds(136, 436, 98, 80);
		frame.getContentPane().add(two);

		JButton three = new JButton("3");
		three.setBackground(UIManager.getColor("Button.darkShadow"));
		three.setFont(new Font("Times New Roman", Font.BOLD, 40));
		three.addActionListener(new ActionListeners());
		three.setBounds(249, 436, 98, 80);
		frame.getContentPane().add(three);

		JButton add = new JButton("+");
		add.setBackground(UIManager.getColor("Button.darkShadow"));
		add.setFont(new Font("Times New Roman", Font.BOLD, 40));
		add.setBounds(373, 436, 98, 80);
		add.addActionListener(new ActionListeners());
		frame.getContentPane().add(add);
	}

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	class ActionListeners implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

			// System.out.println(e.getActionCommand());
			String action = e.getActionCommand();

			// Button
			// if (e.getSource().getClass().getSimpleName().toString().equals("JButton")) {

			if (action.equals("AC") || action.equals("+/-") || action.equals("%") || action.equals("/") || action.equals("x")
					|| action.equals("-") || action.equals("x") || action.equals("+") || action.equals("=")) {

				if (action.equals("AC")) {
					getDisplay().setText("");
				} else {
					System.out.println("keeping it in mind");
					////////////////////////////////////////
					getDisplay().setText("");
				}
			} else {
				getDisplay().setText(getDisplay().getText() + action);
				// System.out.println("sdfgggggz" + (getDisplay()));
				if (getDisplay().toString().charAt(0) == 0) {
					System.out.println("it is zero");
					getDisplay().setText("");
				}
			}

			/*
			  } else { System.out.println(" was not a button"); }
			 */

		}

	}

	class KeyListeners implements KeyListener {

		@Override
		public void keyPressed(KeyEvent arg0) {
			// TODO Auto-generated method stub

		}

		@Override
		public void keyReleased(KeyEvent arg0) {
			// TODO Auto-generated method stub

		}

		@Override
		public void keyTyped(KeyEvent ke) {
			// TODO Auto-generated method stub
			char c = ke.getKeyChar();
			if (!Character.isDigit(c)) { // Only digits
				ke.consume();
			}
		}

	}
}
