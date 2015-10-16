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
			LocalDate studienstart) {
		super(name, vorname, geburtstag, matrikelnummer);
		this.studienstart = studienstart;
	}

	public EingeschriebenerStudent(String name, String vorname, LocalDate geburtstag, int matrikelnummer,
			Adresse adresse, LocalDate studienstart) {
		super(name, vorname, geburtstag, matrikelnummer, adresse);
		this.studienstart = studienstart;
	}

	@Override
	public String toString() {
		if (getAdresse() == null) {
			return "\nEingeschriebener Student:" + "\nName: " + getName() + "\nVorname: " + getVorname() + "\nGeburtstag: "
					+ getGeburtstag() + "\nAlter: " + getAlter() + "\nMatrikelnummer: " + getMatrikelnummer()
					+ "\nStudienstart: " + studienstart;
		} else {
			return "\nEingeschriebener Student:" + "\nName: " + getName() + "\nVorname: " + getVorname() + "\nGeburtstag: "
					+ getGeburtstag() + "\nAlter: " + getAlter() + "\nMatrikelnummer: " + getMatrikelnummer()
					+ "\nAdresse: " + getAdresse() + "\nStudienstart: " + studienstart;
		}

	}

}
