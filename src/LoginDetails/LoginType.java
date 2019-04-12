package LoginDetails;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginType {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginType window = new LoginType();
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
	public LoginType() {
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
		
		JLabel lblLoginType = new JLabel("Login Type");
		lblLoginType.setBounds(193, 27, 71, 26);
		frame.getContentPane().add(lblLoginType);
		
		JButton btnLibrarian = new JButton("Librarian");
		btnLibrarian.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnLibrarian.setBounds(178, 79, 89, 23);
		frame.getContentPane().add(btnLibrarian);
		
		JButton btnFaculty = new JButton("Faculty");
		btnFaculty.setBounds(175, 139, 89, 23);
		frame.getContentPane().add(btnFaculty);
		
		JButton btnStudent = new JButton("Student");
		btnStudent.setBounds(175, 195, 89, 23);
		frame.getContentPane().add(btnStudent);
	}
}
