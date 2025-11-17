package nozama;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

import javax.swing.DefaultListModel;

public class Controller 
{
	private DefaultListModel<Warenkorb> dlmWarenkorb = new DefaultListModel<Warenkorb>();
	private Gui gui;
	private BufferedReader in;
	private ArrayList<Warenkorb> warenkorb = new ArrayList<Warenkorb>();
	
	public Controller()
	{
		this.gui = new Gui(this);
		setModels();
		dateiEinlesen();
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
	
	public void setModels()
	{
		gui.getListWare().setModel(dlmWarenkorb);
	}
	
	public void fuellenListe()
	{
		for (Warenkorb warenkorb2 : warenkorb) {
			dlmWarenkorb.addElement(warenkorb2);
		}
	}
}
