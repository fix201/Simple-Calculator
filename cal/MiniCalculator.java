package cal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class MiniCalculator {

	JFrame frame;
	private JTextField textField;

	/**
	 * Create the application.
	 */
	public MiniCalculator() {
		initialize();
	}

	public JTextField getTextField() {
		return textField;
	}

	public void setTextField(JTextField textField) {
		this.textField = textField;
		System.out.println(this.textField);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		setFrame(frame);
		getFrame().setBounds(100, 100, 513, 695);
		getFrame().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getFrame().getContentPane().setLayout(null);

		textField = new JTextField();
		textField.setEditable(true);
		textField.setBounds(15, 16, 456, 93);
		textField.addActionListener(new Controller());
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent ke) {
				char c = ke.getKeyChar();
				if (!Character.isDigit(c)) { // Only digits
					ke.consume();
				}
			}
		});
		getFrame().getContentPane().add(textField);
		textField.setColumns(10);

		JButton ac = new JButton("AC");
		ac.addActionListener(new Controller());
		ac.setBounds(15, 125, 98, 80);
		getFrame().getContentPane().add(ac);

		JButton seven = new JButton("7");
		seven.addActionListener(new Controller());
		seven.setBounds(15, 227, 98, 80);
		getFrame().getContentPane().add(seven);

		JButton four = new JButton("4");
		four.addActionListener(new Controller());
		four.setBounds(15, 334, 98, 80);
		getFrame().getContentPane().add(four);

		JButton plus_or_minus = new JButton("+/-");
		plus_or_minus.addActionListener(new Controller());
		plus_or_minus.setBounds(136, 125, 98, 80);
		getFrame().getContentPane().add(plus_or_minus);

		JButton percent = new JButton("%");
		percent.addActionListener(new Controller());
		percent.setBounds(249, 125, 98, 80);
		getFrame().getContentPane().add(percent);

		JButton divide = new JButton("/");
		divide.addActionListener(new Controller());
		divide.setBounds(373, 125, 98, 80);
		getFrame().getContentPane().add(divide);

		JButton eight = new JButton("8");
		eight.addActionListener(new Controller());
		eight.setBounds(136, 227, 98, 80);
		getFrame().getContentPane().add(eight);

		JButton nine = new JButton("9");
		nine.addActionListener(new Controller());
		nine.setBounds(249, 227, 98, 80);
		getFrame().getContentPane().add(nine);

		JButton multiply = new JButton("x");
		multiply.addActionListener(new Controller());
		multiply.setBounds(373, 227, 98, 80);
		getFrame().getContentPane().add(multiply);

		JButton five = new JButton("5");
		five.addActionListener(new Controller());
		five.setBounds(136, 334, 98, 80);
		getFrame().getContentPane().add(five);

		JButton six = new JButton("6");
		six.addActionListener(new Controller());
		six.setBounds(249, 334, 98, 80);
		getFrame().getContentPane().add(six);

		JButton subtract = new JButton("-");
		subtract.addActionListener(new Controller());
		subtract.setBounds(373, 334, 98, 80);
		getFrame().getContentPane().add(subtract);

		JButton zero = new JButton("0");
		zero.addActionListener(new Controller());
		zero.setBounds(15, 532, 219, 80);
		getFrame().getContentPane().add(zero);

		JButton decimal = new JButton(".");
		decimal.addActionListener(new Controller());
		decimal.setBounds(249, 532, 98, 80);
		getFrame().getContentPane().add(decimal);

		JButton result = new JButton("=");
		result.addActionListener(new Controller());
		result.setBounds(373, 532, 98, 80);
		getFrame().getContentPane().add(result);

		JButton one = new JButton("1");
		one.addActionListener(new Controller());
		one.setBounds(15, 436, 98, 80);
		getFrame().getContentPane().add(one);

		JButton two = new JButton("2");
		two.addActionListener(new Controller());
		two.setBounds(136, 436, 98, 80);
		getFrame().getContentPane().add(two);

		JButton three = new JButton("3");
		three.addActionListener(new Controller());
		three.setBounds(249, 436, 98, 80);
		getFrame().getContentPane().add(three);

		JButton add = new JButton("+");
		add.addActionListener(new Controller());
		add.setBounds(373, 436, 98, 80);
		getFrame().getContentPane().add(add);
	}

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	class Controller implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

			// System.out.println(e.getActionCommand());
			String action = e.getActionCommand();

			// Button
			// if (e.getSource().getClass().getSimpleName().toString().equals("JButton")) {

			if (action.equals("AC") || action.equals("+/-") || action.equals("%") || action.equals("/") || action.equals("x")
					|| action.equals("-") || action.equals("x") || action.equals("+") || action.equals("=")) {

				if (action.equals("AC")) {
					getTextField().setText("");
				} else {
					System.out.println("keeping it in mind");
					////////////////////////////////////////
					getTextField().setText("");
				}
			} else {
				getTextField().setText(getTextField().getText() + action);
				System.out.println("sdfgggggz" + (getTextField()));
				if (getTextField().toString().charAt(0) == 0) {
					System.out.println("it is zero");
					getTextField().setText("");
				}
			}

			/*
			  } else { System.out.println(" was not a button"); }
			 */

		}

	}
}
