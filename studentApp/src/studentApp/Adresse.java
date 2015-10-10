package studentApp;

public class Adresse {
	private int plz;
	private String stadt;
	private String strasse;
	private int hausnummer;
	
	
	
	public int getPlz() {
		return plz;
	}



	public String getStadt() {
		return stadt;
	}



	public String getStrasse() {
		return strasse;
	}



	public int getHausnummer() {
		return hausnummer;
	}



	public Adresse (int plz, String stadt, String strasse, int hausnummer) {
		this.plz = plz;
		this.stadt = stadt;
		this.strasse = strasse;
		this.hausnummer = hausnummer;
	}
}