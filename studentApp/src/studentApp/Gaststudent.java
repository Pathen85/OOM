package studentApp;

import java.time.LocalDate;

public class Gaststudent extends Student {

	private int semester;

	// Getter
	public int getSemester() {
		return semester;
	}

	// Konstruktor
	public Gaststudent(String name, String vorname, LocalDate geburtstag, int matrikelnummer, int semester) {
		super(name, vorname, geburtstag, matrikelnummer);
		this.semester = semester;
	}

	public Gaststudent(String name, String vorname, LocalDate geburtstag, int matrikelnummer, Adresse adresse,
			int semester) {
		super(name, vorname, geburtstag, matrikelnummer, adresse);
		this.semester = semester;
	}

	@Override
	public String toString() {
		if (getAdresse() == null) {
			return "\nStudent:" + "\nName: " + getName() + "\nVorname: " + getVorname() + "\nGeburtstag: "
					+ getGeburtstag() + "\nAlter: " + getAlter() + "\nMatrikelnummer: " + getMatrikelnummer()
					+ "\naktuelles Semester: " + semester;
		} else {
			return "\nStudent:" + "\nName: " + getName() + "\nVorname: " + getVorname() + "\nGeburtstag: "
					+ getGeburtstag() + "\nAlter: " + getAlter() + "\nMatrikelnummer: " + getMatrikelnummer()
					+ "\nAdresse: " + getAdresse() + "\nAktuelles Semester: " + semester;
		}

	}

}
