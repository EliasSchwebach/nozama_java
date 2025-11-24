package nozama;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DateiHandler 
{
	Scanner s;
	
	DateiHandler(File f)
	{
		try
		{
			s = new Scanner(f);
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
	}
		
	public Warenkorb lesen()
	{
		if(s.hasNext())
		{
			String artikelnummer = s.next();
			String artikelbezeichnung = s.next();
			double preis = s.nextDouble();
			return new Warenkorb(artikelnummer, artikelbezeichnung, preis);
		}
		return null;
	}
	public void schliessen()
	{
		s.close();
	}
}