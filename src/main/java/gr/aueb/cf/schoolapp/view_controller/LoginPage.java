package gr.aueb.cf.schoolapp.view_controller;

import gr.aueb.cf.Main;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class LoginPage extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField username;
	private JPasswordField password;



	/**
	 * Create the frame.
	 */
	public LoginPage() {
		setTitle("Αυθεντικοποίηση Χρήστη");
		setIconImage(Toolkit.getDefaultToolkit().getImage(LoginPage.class.getResource("/images/eduv2.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 461, 346);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Σύνδεση");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(176, 10, 76, 38);
		contentPane.add(lblNewLabel);
		
		JLabel lblMessage = new JLabel("Παρακαλώ εισάγετε τους κωδικούς σας για να συνδεθείτε");
		lblMessage.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblMessage.setBounds(81, 43, 282, 20);
		contentPane.add(lblMessage);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(45, 69, 347, 2);
		contentPane.add(separator);
		
		JLabel lblUser = new JLabel("Χρήστης:");
		lblUser.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblUser.setBounds(89, 73, 83, 28);
		contentPane.add(lblUser);
		
		username = new JTextField();
		username.setBounds(89, 100, 203, 28);
		contentPane.add(username);
		username.setColumns(10);
		
		JLabel lblPassword = new JLabel("Kωδικός:");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPassword.setBounds(89, 138, 83, 28);
		contentPane.add(lblPassword);
		
		JButton btnNewButton = new JButton("Σύνδεση");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if ((username.getText().matches("[aA]dmin")) && (Arrays.equals(password.getPassword(), "12345".toCharArray()))) {
					Main.getLoginPage().setVisible(false);
					Main.getDashboard().setVisible(true);
				}else {
					JOptionPane.showMessageDialog(null,"Λάθος username ή password", "Αδυναμία Σύνδεσης", JOptionPane.ERROR_MESSAGE);
					username.setText("");
					password.setText("");
				}
			}
		});
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(0, 128, 0));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBounds(89, 212, 203, 28);
		contentPane.add(btnNewButton);
		
		password = new JPasswordField();
		password.setBounds(89, 161, 203, 28);
		contentPane.add(password);
	}
}
