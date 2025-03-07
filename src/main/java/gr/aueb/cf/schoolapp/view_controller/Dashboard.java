package gr.aueb.cf.schoolapp.view_controller;

import gr.aueb.cf.Main;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Dashboard extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;

    /**
     * Create the frame.
     */
    public Dashboard() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 893, 549);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JPanel header = new JPanel();
        header.setLayout(null);
        header.setBackground(new Color(0, 52, 117));
        header.setBounds(0, 0, 880, 67);
        contentPane.add(header);

        JLabel govImage = new JLabel("");
        govImage.setIcon(new ImageIcon(Dashboard.class.getResource("/images/gov_logo_small.png")));
        govImage.setBounds(9, 5, 220, 57);
        header.add(govImage);

        JLabel firstLastName = new JLabel("ΝΕΚΤΑΡΙΟΣ ΤΣΑΓΚΑΡΗΣ");
        firstLastName.setForeground(new Color(255, 255, 255));
        firstLastName.setFont(new Font("Tahoma", Font.BOLD, 11));
        firstLastName.setBounds(718, 20, 152, 23);
        header.add(firstLastName);

        JPanel footer = new JPanel();
        footer.setLayout(null);
        footer.setBounds(0, 424, 880, 88);
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

        JPanel menu = new JPanel();
        menu.setBackground(new Color(0, 52, 117));
        menu.setBounds(0, 68, 220, 356);
        contentPane.add(menu);
        menu.setLayout(null);

        JLabel lbl_home = new JLabel("Αρχική");
        lbl_home.setForeground(new Color(255, 255, 0));
        lbl_home.setFont(new Font("Tahoma", Font.BOLD, 12));
        lbl_home.setBounds(10, 10, 114, 30);
        menu.add(lbl_home);

        JLabel lbl_teachers = new JLabel("Εκπαιδευτές");
        lbl_teachers.setForeground(new Color(255, 255, 255));
        lbl_teachers.setFont(new Font("Tahoma", Font.BOLD, 12));
        lbl_teachers.setBounds(10, 38, 114, 30);
        menu.add(lbl_teachers);

        JLabel lbl_teacherView = new JLabel("Προβολή Εκπαιδευτών");
        lbl_teacherView.setForeground(Color.WHITE);
        lbl_teacherView.setFont(new Font("Tahoma", Font.PLAIN, 12));
        lbl_teacherView.setBounds(10, 67, 126, 30);
        menu.add(lbl_teacherView);

        JLabel lbl_teacherInsert = new JLabel("Εισαγωγή Εκπαιδευτή");
        lbl_teacherInsert.setForeground(Color.WHITE);
        lbl_teacherInsert.setFont(new Font("Tahoma", Font.PLAIN, 12));
        lbl_teacherInsert.setBounds(10, 95, 126, 30);
        menu.add(lbl_teacherInsert);

        JLabel lblNewLabel = new JLabel("Ποιότητα στην Εκπαίδευση");
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 23));
        lblNewLabel.setBounds(294, 77, 441, 54);
        contentPane.add(lblNewLabel);

        JLabel lblNewLabel_1 = new JLabel("Προβολή Μητρώου Εκπαιδευτών");
        lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblNewLabel_1.setBounds(230, 129, 232, 22);
        contentPane.add(lblNewLabel_1);

        JLabel lblNewLabel_2 = new JLabel("Προβολή Μητρώου Εγγεγραμμένων Εκπαιδευτών στο Μητρώο του Coding Factory");
        lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
        lblNewLabel_2.setBounds(230, 146, 557, 22);
        contentPane.add(lblNewLabel_2);

        JButton btnConnect = new JButton("Συνέχεια");
        btnConnect.setForeground(Color.WHITE);
        btnConnect.setFont(new Font("Tahoma", Font.BOLD, 12));
        btnConnect.setBackground(new Color(0, 128, 0));
        btnConnect.setBounds(230, 169, 123, 35);
        contentPane.add(btnConnect);

        JLabel lblNewLabel_1_1 = new JLabel("Εισαγωγή Εκπαιδευτή στο Μητρώο Εκπαιδευτών");
        lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblNewLabel_1_1.setBounds(230, 222, 304, 22);
        contentPane.add(lblNewLabel_1_1);

        JLabel lblNewLabel_2_1 = new JLabel("Εισαγωγή Εκπαιδευτή στο Μητρώο του Coding Factory");
        lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
        lblNewLabel_2_1.setBounds(230, 244, 557, 22);
        contentPane.add(lblNewLabel_2_1);

        JButton btnConnect_1 = new JButton("Συνέχεια");
        btnConnect_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Main.getDashboard().setEnabled(false);
            }
        });
        btnConnect_1.setForeground(Color.WHITE);
        btnConnect_1.setFont(new Font("Tahoma", Font.BOLD, 12));
        btnConnect_1.setBackground(new Color(0, 128, 0));
        btnConnect_1.setBounds(230, 269, 123, 35);
        contentPane.add(btnConnect_1);

        JSeparator separator_1 = new JSeparator();
        separator_1.setBackground(new Color(0, 128, 255));
        separator_1.setBounds(10, 422, 880, 2);
        contentPane.add(separator_1);
    }
}
