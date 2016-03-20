import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class MainFrame extends JFrame {
	private JTextArea textArea;
	private JButton btn;

	public MainFrame() {
		super("Hello world");

		setLayout(new BorderLayout());

		textArea = new JTextArea();
		btn = new JButton("Click Me!");

		add(textArea, BorderLayout.CENTER);
		add(btn, BorderLayout.SOUTH);

		setSize(640, 480);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}
