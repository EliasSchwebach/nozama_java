package nozama;

import java.io.File;

public class Main {

	public static void main(String[] args) 
	{
		new Controller();
		File f = new File("H:\\git\\nozama_java\\nozama3\\Artikeldatei Nozama.txt");
		DateiHandler dh = new DateiHandler(f);
		Warenkorb w = dh.lesen();
		System.out.println(w.toString());
		dh.schliessen();
	}

}