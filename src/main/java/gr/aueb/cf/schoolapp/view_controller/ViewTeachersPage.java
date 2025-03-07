package gr.aueb.cf.schoolapp.view_controller;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class ViewTeachersPage extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField lastnameText;
	private JTable table;
	private DefaultTableModel model = new DefaultTableModel();
	private int selectedId;

	public ViewTeachersPage() {
		
		setTitle("Ποιότητα στην Εκπαίδευση");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 891, 643);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel header = new JPanel();
		header.setLayout(null);
		header.setBackground(new Color(0, 52, 117));
		header.setBounds(0, 0, 867, 52);
		contentPane.add(header);
		
		JLabel govImage = new JLabel("");
		govImage.setIcon(new ImageIcon(ViewTeachersPage.class.getResource("/images/gov_logo_small.png")));
		govImage.setBounds(0, 0, 100, 52);
		header.add(govImage);
		
		JLabel firstLastName = new JLabel("ΑΘΑΝΑΣΙΟΣ ΑΝΔΡΟΥΤΣΟΣ");
		firstLastName.setForeground(Color.WHITE);
		firstLastName.setBounds(674, 11, 183, 30);
		header.add(firstLastName);
		
		JPanel footer = new JPanel();
		footer.setLayout(null);
		footer.setBounds(0, 516, 877, 90);
		contentPane.add(footer);
		
		JLabel lbl_manual = new JLabel("Εγχειρίδιο Χρήσης");
		lbl_manual.setForeground(new Color(0, 52, 117));
		lbl_manual.setBounds(197, 37, 151, 29);
		footer.add(lbl_manual);
		
		JLabel lbl_oftenQuestions = new JLabel("Συχνές Ερωτήσεις");
		lbl_oftenQuestions.setForeground(new Color(0, 52, 117));
		lbl_oftenQuestions.setBounds(358, 37, 151, 29);
		footer.add(lbl_oftenQuestions);
		
		JLabel lbl_support = new JLabel("Υποστήριξη Πολιτών");
		lbl_support.setForeground(new Color(0, 52, 117));
		lbl_support.setBounds(519, 37, 151, 29);
		footer.add(lbl_support);
		
		lastnameText = new JTextField();
		lastnameText.setBounds(110, 130, 181, 40);
		contentPane.add(lastnameText);
		lastnameText.setColumns(10);
		
		JButton btnSearh = new JButton("Αναζήτηση");
	
		btnSearh.setBackground(new Color(0, 128, 0));
		btnSearh.setForeground(new Color(255, 255, 255));
		btnSearh.setBounds(304, 130, 125, 40);
		contentPane.add(btnSearh);
		
		JButton btnCleanUp = new JButton("Εκκαθάριση");
		
		btnCleanUp.setForeground(new Color(192, 192, 192));
		btnCleanUp.setBounds(439, 130, 125, 40);
		contentPane.add(btnCleanUp);
		
		JLabel lblNewLabel = new JLabel("Αιτήσεις Εκπαιδευτών");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel.setBounds(282, 77, 267, 27);
		contentPane.add(lblNewLabel);
		
		
		table = new JTable();
		
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Κωδικός", "Όνομα", "Επώνυμο"
			}
		));
		table.setBounds(57, 192, 507, 307);
		model = (DefaultTableModel) table.getModel();
		
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(57, 192, 507, 307);
		contentPane.add(scrollPane);
		
		JButton viewBtn = new JButton("Προβολή");
		viewBtn.setForeground(new Color(255, 255, 255));
		
		viewBtn.setBackground(new Color(0, 128, 0));
		viewBtn.setFont(new Font("Tahoma", Font.PLAIN, 12));
		viewBtn.setBounds(619, 229, 202, 52);
		contentPane.add(viewBtn);
		
		JButton updateBtn = new JButton("Επεξεργασία");
		updateBtn.setForeground(new Color(255, 255, 255));
		
		updateBtn.setFont(new Font("Tahoma", Font.PLAIN, 12));
		updateBtn.setBackground(new Color(0, 128, 64));
		updateBtn.setBounds(619, 292, 202, 52);
		contentPane.add(updateBtn);
		
		JButton btnDelete = new JButton("Διαγραφή");
		btnDelete.setForeground(new Color(255, 255, 255));
	
		btnDelete.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnDelete.setBackground(new Color(0, 128, 64));
		btnDelete.setBounds(619, 355, 202, 52);
		contentPane.add(btnDelete);
		
		JSeparator lineBottom_2 = new JSeparator();
		lineBottom_2.setBackground(Color.BLUE);
		lineBottom_2.setBounds(0, 516, 875, 2);
		contentPane.add(lineBottom_2);
		
		JButton closeBtn = new JButton("Κλείσιμο");
		
		closeBtn.setFont(new Font("Tahoma", Font.PLAIN, 12));
		closeBtn.setBackground(Color.LIGHT_GRAY);
		closeBtn.setBounds(619, 445, 202, 52);
		contentPane.add(closeBtn);
		
		JLabel lblLastname = new JLabel("Επώνυμο");
		lblLastname.setBounds(57, 128, 57, 44);
		contentPane.add(lblLastname);
		//contentPane.add(table);
	}
	
	
	public int getSelectedId() {
		return selectedId;
	}
}
