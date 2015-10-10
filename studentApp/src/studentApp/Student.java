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

	public Adresse getAdresse() {
		return adresse;
	}

	// Konstruktor
	public Student(String name, String vorname, LocalDate geburtstag, int matrikelnummer, Adresse adresse) {
		this.name = name;
		this.vorname = vorname;
		this.geburtstag = geburtstag;
		this.matrikelnummer = matrikelnummer;
		this.alter = BerechneAlter();
		this.adresse = adresse;
	}

	// Berechnet das Alter des Studenten
	public int BerechneAlter() {
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
}
