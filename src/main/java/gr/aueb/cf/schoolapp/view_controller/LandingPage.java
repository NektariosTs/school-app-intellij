package gr.aueb.cf.schoolapp.view_controller;

import gr.aueb.cf.schoolapp.Main;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class LandingPage extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	
	/**
	 * Create the frame.
	 */
	public LandingPage() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(LandingPage.class.getResource("/images/eduv2.png")));
		setTitle("Ποιότητα στην Εκπαίδευση");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 894, 529);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel header = new JPanel();
		header.setBackground(new Color(0, 52, 117));
		header.setBounds(0, 0, 880, 67);
		contentPane.add(header);
		header.setLayout(null);
		
		JLabel govImage = new JLabel("");
		govImage.setBounds(9, 5, 220, 57);
		govImage.setIcon(new ImageIcon(LandingPage.class.getResource("/images/gov_logo_small.png")));
		header.add(govImage);
		
		JLabel lblAuthRequired = new JLabel("Απετείται Ταυτοποίηση");
		lblAuthRequired.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblAuthRequired.setBounds(62, 105, 292, 59);
		contentPane.add(lblAuthRequired);
		
		JLabel lblMustConnect = new JLabel("Για να προχωρήσετε πρέπει να συνδεθείτε");
		lblMustConnect.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblMustConnect.setBounds(62, 169, 268, 53);
		contentPane.add(lblMustConnect);
		
		
		JButton btnConnect = new JButton("Σύνδεση");
		btnConnect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.getLandingPage().setVisible(false);
				Main.getLoginPage().setVisible(true);
			}
		});
		btnConnect.setForeground(new Color(255, 255, 255));
		btnConnect.setBackground(new Color(0, 128, 0));
		btnConnect.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnConnect.setBounds(62, 289, 132, 44);
		contentPane.add(btnConnect);
		
		JCheckBox privacyCheckBox = new JCheckBox("Δηλώνω ότι αποδέχομαι τη");
		privacyCheckBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED) {
					btnConnect.setEnabled(true);
				} else {
					btnConnect.setEnabled(false);
				}
			}
		});
		privacyCheckBox.setFont(new Font("Tahoma", Font.BOLD, 12));
		privacyCheckBox.setBounds(62, 240, 196, 21);
		contentPane.add(privacyCheckBox);
		
		JLabel lblPrivacy = new JLabel("Δήλωση Ιδιωτικότητας\r\n");
		lblPrivacy.setEnabled(false);
		lblPrivacy.setForeground(new Color(0, 0, 255));
		lblPrivacy.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPrivacy.setBounds(264, 243, 150, 14);
		contentPane.add(lblPrivacy);
		
		
		JPanel footer = new JPanel();
		footer.setBounds(0, 404, 880, 88);
		contentPane.add(footer);
		footer.setLayout(null);
		
		JLabel lblManual = new JLabel("Εγχειρίδιο Χρήσης");
		lblManual.setForeground(new Color(0, 0, 255));
		lblManual.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblManual.setBounds(127, 23, 138, 36);
		footer.add(lblManual);
		
		JLabel lblQuestions = new JLabel("Συχνές Ερωτήσεις");
		lblQuestions.setForeground(new Color(0, 0, 255));
		lblQuestions.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblQuestions.setBounds(617, 29, 123, 25);
		footer.add(lblQuestions);
		
		JLabel lblSupport = new JLabel("Υποστήριξη πελατών");
		lblSupport.setForeground(new Color(0, 0, 255));
		lblSupport.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblSupport.setBounds(358, 29, 156, 25);
		footer.add(lblSupport);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(0, 402, 880, 2);
		contentPane.add(separator_1);
		separator_1.setBackground(new Color(0, 128, 255));
	}
}
