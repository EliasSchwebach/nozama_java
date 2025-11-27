package alset;

public class Auto
{
	private String modell;
	private String farbe;
	private int PS;
	
	public Auto(String modell, String farbe, int pS) 
	{
		super();
		this.modell = modell;
		this.farbe = farbe;
		PS = pS;
	}
	
	
	public String getModell() {
		return modell;
	}
	public void setModell(String modell) {
		this.modell = modell;
	}
	public String getFarbe() {
		return farbe;
	}
	public void setFarbe(String farbe) {
		this.farbe = farbe;
	}
	public int getPS() {
		return PS;
	}
	public void setPS(int pS) {
		PS = pS;
	}
	
	
}
