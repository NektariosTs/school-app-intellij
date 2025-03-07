package gr.aueb.cf.schoolapp.view_controller;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class InsertTeacherPage extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField nameText;
	private JTextField lastnameText;
	private JTextField afmText;
	private JTextField fathersNameText;
	private JTextField phoneText;
	private JTextField emailText;
	private JTextField adressText;
	private JTextField numberText;
	private JTextField zipCodeText;


	/**
	 * Create the frame.
	 */
	public InsertTeacherPage() {
		setTitle("Ποιότητα στην Εκπαίδευση");
		setIconImage(Toolkit.getDefaultToolkit().getImage(InsertTeacherPage.class.getResource("/images/eduv2.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 896, 773);
		contentPane = new JPanel();
		contentPane.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
			}
		});
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel header = new JPanel();
		header.setLayout(null);
		header.setBackground(new Color(0, 52, 117));
		header.setBounds(0, 0, 880, 67);
		contentPane.add(header);
		
		JLabel govImage = new JLabel("");
		govImage.setIcon(new ImageIcon(InsertTeacherPage.class.getResource("/images/gov_logo_small.png")));
		govImage.setBounds(9, 5, 220, 57);
		header.add(govImage);
		
		JLabel firstLastName = new JLabel("ΝΕΚΤΑΡΙΟΣ ΤΣΑΓΚΑΡΗΣ");
		firstLastName.setForeground(Color.WHITE);
		firstLastName.setFont(new Font("Tahoma", Font.BOLD, 11));
		firstLastName.setBounds(718, 20, 152, 23);
		header.add(firstLastName);
		
		JPanel footer = new JPanel();
		footer.setLayout(null);
		footer.setBounds(0, 648, 880, 88);
		contentPane.add(footer);
		
		JLabel lblManual = new JLabel("Εγχειρίδιο Χρήσης");
		lblManual.setForeground(Color.BLUE);
		lblManual.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblManual.setBounds(127, 23, 138, 36);
		footer.add(lblManual);
		
		JLabel lblQuestions = new JLabel("Συχνές Ερωτήσεις");
		lblQuestions.setForeground(Color.BLUE);
		lblQuestions.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblQuestions.setBounds(617, 29, 123, 25);
		footer.add(lblQuestions);
		
		JLabel lblSupport = new JLabel("Υποστήριξη πελατών");
		lblSupport.setForeground(Color.BLUE);
		lblSupport.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblSupport.setBounds(358, 29, 156, 25);
		footer.add(lblSupport);
		
		JLabel lblNewLabel = new JLabel("Στοιχεία Εκπαιδευτή");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblNewLabel.setBounds(284, 95, 270, 47);
		contentPane.add(lblNewLabel);
		
		JLabel lblName = new JLabel("Όνομα*");
		lblName.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblName.setBounds(32, 149, 78, 34);
		contentPane.add(lblName);
		
		nameText = new JTextField();
		nameText.setBounds(109, 149, 255, 35);
		contentPane.add(nameText);
		nameText.setColumns(10);
		
		JLabel errorFirstname = new JLabel("");
		errorFirstname.setFont(new Font("Tahoma", Font.BOLD, 11));
		errorFirstname.setForeground(new Color(255, 0, 0));
		errorFirstname.setBounds(109, 183, 255, 34);
		contentPane.add(errorFirstname);
		
		JLabel lblLastname = new JLabel("Επώνυμο*");
		lblLastname.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblLastname.setBounds(465, 149, 78, 34);
		contentPane.add(lblLastname);
		
		lastnameText = new JTextField();
		lastnameText.setColumns(10);
		lastnameText.setBounds(548, 149, 255, 35);
		contentPane.add(lastnameText);
		
		JLabel errorLastname = new JLabel("");
		errorLastname.setForeground(Color.RED);
		errorLastname.setFont(new Font("Tahoma", Font.BOLD, 11));
		errorLastname.setBounds(548, 183, 255, 34);
		contentPane.add(errorLastname);
		
		JLabel lblafm = new JLabel("ΑΦΜ*");
		lblafm.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblafm.setBounds(52, 223, 58, 34);
		contentPane.add(lblafm);
		
		afmText = new JTextField();
		afmText.setColumns(10);
		afmText.setBounds(109, 222, 255, 35);
		contentPane.add(afmText);
		
		fathersNameText = new JTextField();
		fathersNameText.setColumns(10);
		fathersNameText.setBounds(548, 223, 255, 35);
		contentPane.add(fathersNameText);
		
		JLabel lblFathersName = new JLabel("Πατρώνυμο*");
		lblFathersName.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblFathersName.setBounds(448, 223, 98, 34);
		contentPane.add(lblFathersName);
		
		JLabel errorafm = new JLabel("");
		errorafm.setForeground(Color.RED);
		errorafm.setFont(new Font("Tahoma", Font.BOLD, 11));
		errorafm.setBounds(109, 258, 255, 34);
		contentPane.add(errorafm);
		
		JLabel errorFathersname = new JLabel("");
		errorFathersname.setForeground(Color.RED);
		errorFathersname.setFont(new Font("Tahoma", Font.BOLD, 11));
		errorFathersname.setBounds(548, 258, 255, 34);
		contentPane.add(errorFathersname);
		
		JLabel lblPhone = new JLabel("Τηλέφωνο*");
		lblPhone.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblPhone.setBounds(10, 292, 100, 34);
		contentPane.add(lblPhone);
		
		phoneText = new JTextField();
		phoneText.setColumns(10);
		phoneText.setBounds(109, 292, 255, 35);
		contentPane.add(phoneText);
		
		JLabel lblEmail = new JLabel("e-mail*");
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblEmail.setBounds(486, 292, 58, 34);
		contentPane.add(lblEmail);
		
		emailText = new JTextField();
		emailText.setColumns(10);
		emailText.setBounds(548, 292, 255, 35);
		contentPane.add(emailText);
		
		JLabel errorPhone = new JLabel("");
		errorPhone.setForeground(Color.RED);
		errorPhone.setFont(new Font("Tahoma", Font.BOLD, 11));
		errorPhone.setBounds(109, 327, 255, 34);
		contentPane.add(errorPhone);
		
		JLabel errorEmail = new JLabel("");
		errorEmail.setForeground(Color.RED);
		errorEmail.setFont(new Font("Tahoma", Font.BOLD, 11));
		errorEmail.setBounds(548, 327, 255, 34);
		contentPane.add(errorEmail);
		
		JLabel lblAdress = new JLabel("Διεύθυνση*");
		lblAdress.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblAdress.setBounds(10, 358, 100, 34);
		contentPane.add(lblAdress);
		
		adressText = new JTextField();
		adressText.setColumns(10);
		adressText.setBounds(109, 360, 255, 35);
		contentPane.add(adressText);
		
		JLabel lblNumber = new JLabel("Αριθμός*");
		lblNumber.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNumber.setBounds(476, 361, 71, 34);
		contentPane.add(lblNumber);
		
		numberText = new JTextField();
		numberText.setColumns(10);
		numberText.setBounds(548, 360, 255, 35);
		contentPane.add(numberText);
		
		JLabel errorAdress = new JLabel("");
		errorAdress.setForeground(Color.RED);
		errorAdress.setFont(new Font("Tahoma", Font.BOLD, 11));
		errorAdress.setBounds(109, 395, 255, 34);
		contentPane.add(errorAdress);
		
		JLabel errorNumber = new JLabel("");
		errorNumber.setForeground(Color.RED);
		errorNumber.setFont(new Font("Tahoma", Font.BOLD, 11));
		errorNumber.setBounds(548, 395, 255, 34);
		contentPane.add(errorNumber);
		
		JLabel lblzipCode = new JLabel("ΤΚ*");
		lblzipCode.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblzipCode.setBounds(511, 429, 36, 34);
		contentPane.add(lblzipCode);
		
		zipCodeText = new JTextField();
		zipCodeText.setColumns(10);
		zipCodeText.setBounds(548, 428, 255, 35);
		contentPane.add(zipCodeText);
		
		JLabel errorZipCode = new JLabel("");
		errorZipCode.setForeground(Color.RED);
		errorZipCode.setFont(new Font("Tahoma", Font.BOLD, 11));
		errorZipCode.setBounds(548, 464, 255, 34);
		contentPane.add(errorZipCode);
		
		JComboBox cityComboBox = new JComboBox();
		cityComboBox.setBounds(109, 431, 255, 34);
		contentPane.add(cityComboBox);
		
		JLabel lblCity = new JLabel("Πόλη*");
		lblCity.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblCity.setBounds(52, 429, 58, 34);
		contentPane.add(lblCity);
		
		JLabel errorComboBoxCity = new JLabel("");
		errorComboBoxCity.setForeground(Color.RED);
		errorComboBoxCity.setFont(new Font("Tahoma", Font.BOLD, 11));
		errorComboBoxCity.setBounds(109, 464, 255, 34);
		contentPane.add(errorComboBoxCity);
		
		JButton btnClose = new JButton("Κλείσιμο");
		btnClose.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnClose.setBounds(109, 528, 255, 60);
		contentPane.add(btnClose);
		
		JButton btnSumbit = new JButton("Υποβολή");
		btnSumbit.setForeground(new Color(255, 255, 255));
		btnSumbit.setBackground(new Color(0, 128, 0));
		btnSumbit.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnSumbit.setBounds(548, 528, 255, 60);
		contentPane.add(btnSumbit);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBackground(new Color(0, 128, 255));
		separator_1.setBounds(0, 648, 880, 2);
		contentPane.add(separator_1);
	}
}
