package alset;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Gui extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JComboBox comboBoxModell;
	private JComboBox comboBoxFarbe;
	private JComboBox comboBoxPS;
	private JComboBox comboBoxExtras;
	private JLabel lblNewLabel_4;
	private JList list;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JLabel lblPreis;
	private JLabel lblSteuer;
	private JLabel lblBP;
	private JButton btnBestellen;
	private JButton btnFertig;
	private Controller controller;

	/**
	 * Launch the application.

	/**
	 * Create the frame.
	 */
	public Gui() {

		initialize();
		this.controller = controller;
	}
	private void initialize() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 483, 337);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getLblNewLabel_2());
		contentPane.add(getLblNewLabel_3());
		contentPane.add(getComboBoxModell());
		contentPane.add(getComboBoxFarbe());
		contentPane.add(getComboBoxPS());
		contentPane.add(getComboBoxExtras());
		contentPane.add(getLblNewLabel_4());
		contentPane.add(getList());
		contentPane.add(getLblNewLabel_5());
		contentPane.add(getLblNewLabel_6());
		contentPane.add(getLblNewLabel_7());
		contentPane.add(getLblPreis());
		contentPane.add(getLblSteuer());
		contentPane.add(getLblBP());
		contentPane.add(getBtnBestellen());
		contentPane.add(getBtnFertig());
		setVisible(true);
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Modell:");
			lblNewLabel.setBounds(21, 26, 46, 14);
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("Farbe:");
			lblNewLabel_1.setBounds(21, 52, 46, 14);
		}
		return lblNewLabel_1;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("PS: ");
			lblNewLabel_2.setBounds(21, 77, 46, 14);
		}
		return lblNewLabel_2;
	}
	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("Extras:");
			lblNewLabel_3.setBounds(21, 102, 46, 14);
		}
		return lblNewLabel_3;
	}
	private JComboBox getComboBoxModell() {
		if (comboBoxModell == null) {
			comboBoxModell = new JComboBox();
			comboBoxModell.setBounds(77, 22, 112, 22);
		}
		return comboBoxModell;
	}
	private JComboBox getComboBoxFarbe() {
		if (comboBoxFarbe == null) {
			comboBoxFarbe = new JComboBox();
			comboBoxFarbe.setBounds(77, 48, 112, 22);
		}
		return comboBoxFarbe;
	}
	private JComboBox getComboBoxPS() {
		if (comboBoxPS == null) {
			comboBoxPS = new JComboBox();
			comboBoxPS.setBounds(77, 73, 112, 22);
		}
		return comboBoxPS;
	}
	private JComboBox getComboBoxExtras() {
		if (comboBoxExtras == null) {
			comboBoxExtras = new JComboBox();
			comboBoxExtras.setBounds(77, 98, 112, 22);
		}
		return comboBoxExtras;
	}
	private JLabel getLblNewLabel_4() {
		if (lblNewLabel_4 == null) {
			lblNewLabel_4 = new JLabel("Ihre Auswahl:");
			lblNewLabel_4.setBounds(224, 26, 80, 14);
		}
		return lblNewLabel_4;
	}
	private JList getList() {
		if (list == null) {
			list = new JList();
			list.setBounds(224, 52, 200, 110);
		}
		return list;
	}
	private JLabel getLblNewLabel_5() {
		if (lblNewLabel_5 == null) {
			lblNewLabel_5 = new JLabel("Gesamtpreis");
			lblNewLabel_5.setBounds(224, 173, 80, 14);
		}
		return lblNewLabel_5;
	}
	private JLabel getLblNewLabel_6() {
		if (lblNewLabel_6 == null) {
			lblNewLabel_6 = new JLabel("19% MwSt  ");
			lblNewLabel_6.setBounds(224, 198, 63, 14);
		}
		return lblNewLabel_6;
	}
	private JLabel getLblNewLabel_7() {
		if (lblNewLabel_7 == null) {
			lblNewLabel_7 = new JLabel("Brutto Preis");
			lblNewLabel_7.setBounds(224, 222, 63, 14);
		}
		return lblNewLabel_7;
	}
	private JLabel getLblPreis() {
		if (lblPreis == null) {
			lblPreis = new JLabel("");
			lblPreis.setBounds(328, 173, 96, 14);
		}
		return lblPreis;
	}
	private JLabel getLblSteuer() {
		if (lblSteuer == null) {
			lblSteuer = new JLabel("");
			lblSteuer.setBounds(328, 198, 96, 14);
		}
		return lblSteuer;
	}
	private JLabel getLblBP() {
		if (lblBP == null) {
			lblBP = new JLabel("");
			lblBP.setBounds(334, 222, 90, 14);
		}
		return lblBP;
	}
	private JButton getBtnBestellen() {
		if (btnBestellen == null) {
			btnBestellen = new JButton("Auto Bestellen");
			btnBestellen.setBounds(284, 264, 140, 23);
		}
		return btnBestellen;
	}
	private JButton getBtnFertig() {
		if (btnFertig == null) {
			btnFertig = new JButton("Auswahl Bestätigen");
			btnFertig.setBounds(21, 147, 140, 23);
		}
		return btnFertig;
	}
}
