package studentApp;

import java.time.LocalDate;

public class Student {
	private String name;
	private String vorname;
	private LocalDate geburtstag;
	private int matrikelnummer;
	private int alter;
	private Adresse adresse;

	// Getter
	public String getName() {
		return name;
	}

	public String getVorname() {
		return vorname;
	}

	public LocalDate getGeburtstag() {
		return geburtstag;
	}

	public int getMatrikelnummer() {
		return matrikelnummer;
	}

	public int getAlter() {
		return alter;
	}

	public String getAdresse() {
		if (adresse == null) {
			return null;
		} else {
			return adresse.toString();
		}
	}

	// Konstruktor
	public Student(String name, String vorname, LocalDate geburtstag, int matrikelnummer) {
		this.name = name;
		this.vorname = vorname;
		this.geburtstag = geburtstag;
		this.matrikelnummer = matrikelnummer;
		this.alter = berechneAlter();
		this.adresse = null;
	}

	public Student(String name, String vorname, LocalDate geburtstag, int matrikelnummer, Adresse adresse) {
		this.name = name;
		this.vorname = vorname;
		this.geburtstag = geburtstag;
		this.matrikelnummer = matrikelnummer;
		this.alter = berechneAlter();
		this.adresse = adresse;
	}

	// Berechnet das Alter des Studenten
	public int berechneAlter() {
		LocalDate heute = LocalDate.now();
		alter = heute.getYear() - geburtstag.getYear();

		int heuteDayofYear = heute.getDayOfYear();
		int geburtstagDayofYear = geburtstag.getDayOfYear();

		// War der Geburtstag schon?
		if (heuteDayofYear >= geburtstagDayofYear) {
			return alter;
		}

		// Wenn nein, verringere Alter um 1
		else {
			return alter--;
		}

	}

	@Override
	public String toString() {
		if (getAdresse() == null) {
			return "\nStudent:" + "\nName: " + getName() + "\nVorname: " + getVorname() + "\nGeburtstag: "
					+ getGeburtstag() + "\nAlter: " + getAlter() + "\nMatrikelnummer: " + getMatrikelnummer();
		} else {
			return "\nStudent:" + "\nName: " + getName() + "\nVorname: " + getVorname() + "\nGeburtstag: "
					+ getGeburtstag() + "\nAlter: " + getAlter() + "\nMatrikelnummer: " + getMatrikelnummer()
					+ "\nAdresse: " + getAdresse();
		}

	}
}
