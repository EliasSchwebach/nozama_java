package nozama;

public class Warenkorb
{

	
	private String artikelnummmer;
	private String artikelbezeichnung;
	private double preis;
	
	public Warenkorb(String artikelnummmer, String artikelbezeichnung, double preis) {
		super();
		this.artikelnummmer = artikelnummmer;
		this.artikelbezeichnung = artikelbezeichnung;
		this.preis = preis;
	}

	public String getArtikelnummmer() {
		return artikelnummmer;
	}

	public void setArtikelnummmer(String artikelnummmer) {
		this.artikelnummmer = artikelnummmer;
	}

	public String getArtikelbezeichnung() {
		return artikelbezeichnung;
	}

	public void setArtikelbezeichnung(String artikelbezeichnung) {
		this.artikelbezeichnung = artikelbezeichnung;
	}

	public double getPreis() {
		return preis;
	}

	public void setPreis(double preis) {
		this.preis = preis;
	}

	@Override
	public String toString() {
		return artikelbezeichnung + preis + "€";
	}
	
	
	
	
}
