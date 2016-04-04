import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MainFrame extends JFrame {
	private JButton btn;
	private TextPanel textPanel;
	private Toolbar toolBar;

	public MainFrame() {
		super("Hello world");

		setLayout(new BorderLayout());

		textPanel = new TextPanel();
		toolBar = new Toolbar();
		btn = new JButton("Click Me!");

		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				textPanel.appendText("Hello\n");
			}

		});

		add(toolBar, BorderLayout.NORTH);
		add(textPanel, BorderLayout.CENTER);
		add(btn, BorderLayout.SOUTH);

		setSize(640, 480);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}
