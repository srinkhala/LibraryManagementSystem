package Faculty;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;

public class Options {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Options window = new Options();
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
	public Options() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnSuggestions = new JButton("Suggestions");
		btnSuggestions.setBounds(52, 94, 89, 23);
		frame.getContentPane().add(btnSuggestions);
		
		JButton btnPreviousRecord = new JButton("Previous record");
		btnPreviousRecord.setBounds(257, 94, 89, 23);
		frame.getContentPane().add(btnPreviousRecord);
		
		JButton btnBookIssue = new JButton("Book issue");
		btnBookIssue.setBounds(52, 167, 89, 23);
		frame.getContentPane().add(btnBookIssue);
		
		JButton btnBookReturn = new JButton("Book return");
		btnBookReturn.setBounds(257, 167, 89, 23);
		frame.getContentPane().add(btnBookReturn);
		
		JLabel lblOptions = new JLabel("Options");
		lblOptions.setBounds(170, 32, 46, 14);
		frame.getContentPane().add(lblOptions);
	}
}
