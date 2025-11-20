package nozama;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Gui extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton btnNR;
	private JList listWare;
	private JButton btnNL;
	private JList listWarenkorb;
	private JTextPane txtpnKundenname;
	private JTextField textFieldName;
	private JButton btnNewBestellen;
	private Controller controller;
	
	

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public Gui(Controller controller) {

		initialize();
		this.controller = controller;
	}
	
	
	private void initialize() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getBtnNR());
		contentPane.add(getListWare());
		contentPane.add(getBtnNL());
		contentPane.add(getListWarenkorb());
		contentPane.add(getTxtpnKundenname());
		contentPane.add(getTextFieldName());
		contentPane.add(getBtnNewBestellen());
		setVisible(true);
	}
	private JButton getBtnNR() 
	{
		if (btnNR == null)
		{
			btnNR = new JButton(">");
			btnNR.addActionListener(new ActionListener() 
			{
				public void actionPerformed(ActionEvent e) 
				{
					controller.hinzufuegenWarenkorb(getListWare().getSelectedValue());
				}
			});
			btnNR.setBounds(165, 43, 89, 23);
		}
		return btnNR;
	}
	protected JList getListWare() {
		if (listWare == null) {
			listWare = new JList();
			listWare.setBackground(new Color(192, 192, 192));
			listWare.setBounds(36, 43, 119, 99);
		}
		return listWare;
	}
	protected JButton getBtnNL() {
		if (btnNL == null) {
			btnNL = new JButton("<");
			btnNL.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e)
				{
					controller.entfernenWarenkorb(getListWarenkorb().getSelectedValue());
				}
			});
			btnNL.setBounds(165, 94, 89, 23);
		}
		return btnNL;
	}
	protected JList getListWarenkorb() {
		if (listWarenkorb == null) {
			listWarenkorb = new JList();
			listWarenkorb.setBackground(new Color(192, 192, 192));
			listWarenkorb.setBounds(289, 46, 101, 96);
		}
		return listWarenkorb;
	}
	private JTextPane getTxtpnKundenname() {
		if (txtpnKundenname == null) {
			txtpnKundenname = new JTextPane();
			txtpnKundenname.setText("Kundenname");
			txtpnKundenname.setBounds(10, 219, 84, 20);
		}
		return txtpnKundenname;
	}
	private JTextField getTextFieldName() {
		if (textFieldName == null) {
			textFieldName = new JTextField();
			textFieldName.setBounds(104, 219, 86, 20);
			textFieldName.setColumns(10);
		}
		return textFieldName;
	}
	private JButton getBtnNewBestellen() {
		if (btnNewBestellen == null) {
			btnNewBestellen = new JButton("Bestellung Abschließen");
			btnNewBestellen.setBounds(250, 219, 174, 23);
		}
		return btnNewBestellen;
	}
}
