package studentApp;

import java.time.LocalDate;

public class EingeschriebenerStudent extends Student {
	private LocalDate studienstart;

	// Getter
	public LocalDate getStudienstart() {
		return studienstart;
	}

	// Konstruktor
	public EingeschriebenerStudent(String name, String vorname, LocalDate geburtstag, int matrikelnummer,
			Adresse adresse, LocalDate studienstart) {
		super(name, vorname, geburtstag, matrikelnummer, adresse);
		this.studienstart = studienstart;
	}

	@Override
	public String toString() {
		return "\nEingeschriebener Student:"
				+ "\nName: " + getName()
				+ "\nVorname: " + getVorname() 
				+ "\nGeburtstag: " + getGeburtstag() 
				+ "\nAlter: " + getAlter() 
				+ "\nMatrikelnummer: " + getMatrikelnummer() 
				+ "\nAdresse: " + getAdresse() 
				+ "\nStudienstart: " + studienstart;
	}

}
