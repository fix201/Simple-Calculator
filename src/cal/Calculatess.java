package cal;

import java.awt.EventQueue;
import java.awt.Frame;

public class Calculatess {

	private MiniCalculator window = new MiniCalculator();
	private Frame frame = new Frame();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					new Calculate().getWindow().getFrame().setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public MiniCalculator getWindow() {
		return window;
	}

	public Frame getFrame() {
		return frame;
	}

}