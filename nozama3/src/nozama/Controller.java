package nozama;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class Controller 
{
	private DefaultListModel<Warenkorb> dlmWarenkorb = new DefaultListModel<Warenkorb>();
	private DefaultListModel<Warenkorb> dlmWarenkorbliste = new DefaultListModel<Warenkorb>();
	private Gui gui;
	private BufferedReader in;
	private BufferedWriter out;
	private ArrayList<Warenkorb> warenkorb = new ArrayList<Warenkorb>();
	private String dateipfad = "H:\\git\\nozama_java\\nozama3\\src\\Bestellung\\";
	
	
	
	
	public Controller()
	{
		this.gui = new Gui(this);
		setModels();
		dateiEinlesen();
		registriereListenner();
		
	}
	
	public void registriereListenner()
	{
		this.gui.setBtnNR(e -> hinzufuegenWarenkorb( gui.getListWare().getSelectedValue()));
		this.gui.setBtnNL(e -> entfernenWarenkorb(gui.getListWarenkorb().getSelectedValue()));
		this.gui.setBtnNB(e -> schreiben(gui.getTextFieldName().getText()));
	}
	

	public void dateiEinlesen()
	{
		try 
		{
			String zeile = null;
			in = new BufferedReader(new FileReader("H:\\git\\nozama_java\\nozama\\src\\nozama\\Artikeldatei Nozama.txt"));
			try 
			{
				zeile = in.readLine();
				while((zeile = in.readLine()) != null)
				{
					
					String[] array = zeile.split(";");
					array[2] = array[2].replace(",", ".");
					array[2] = array[2].replace("€", "");
					double temp = Double.parseDouble(array[2]); 
					warenkorb.add(new Warenkorb(array[0], array[1], temp));
				}
			}
			catch (IOException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			finally 
			{
				try {
					in.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		} catch (FileNotFoundException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		fuellenListe();
	}
	
	public void hinzufuegenWarenkorb(Object o)
	{
		this.dlmWarenkorbliste.addElement((Warenkorb) o);
		this.dlmWarenkorb.removeElement(o);
	}
	
	public void entfernenWarenkorb(Object o)
	{
		this.dlmWarenkorbliste.removeElement(o);
		this.dlmWarenkorb.addElement((Warenkorb) o);
	}
	
	public void setModels()
	{
		gui.getListWare().setModel(dlmWarenkorb);
		gui.getListWarenkorb().setModel(dlmWarenkorbliste);
	}
	
	public void schreiben(String text)
	{
		try {
			BufferedWriter out = Files.newBufferedWriter(Paths.get(dateipfad + text));
			
			try {
				out.write(dlmWarenkorbliste.toString());
				out.newLine();
			} catch (Exception e) {
				System.out.println("Fehler");
			} finally {
				out.close();
			}
		} catch (IOException e) {
			System.out.println("Fehler");
		}
		bestellBestaetigung();
	}
	
	public void bestellBestaetigung()
	{
		JOptionPane test = new JOptionPane("Bestätigung");
		test.showMessageDialog(null, "Vielen Dank für ihre Bestellung");
		test.setVisible(true);
		dlmWarenkorbliste.removeAllElements();
		gui.getTextFieldName().setText("");	
		
	}
	
	public void fuellenListe()
	{
		for (Warenkorb warenkorb2 : warenkorb) {
			dlmWarenkorb.addElement(warenkorb2);
		}
	}
	
	
}