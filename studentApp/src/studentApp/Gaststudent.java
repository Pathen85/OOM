package studentApp;

import java.time.LocalDate;

public class Gaststudent extends Student {

	private int semester;

	// Getter
	public int getSemester() {
		return semester;
	}

	// Konstruktor
	public Gaststudent(String name, String vorname, LocalDate geburtstag, int matrikelnummer, Adresse adresse,
			int semester) {
		super(name, vorname, geburtstag, matrikelnummer, adresse);
		this.semester = semester;
	}

	@Override
	public String toString() {
		return "\nGaststudent:"
				+ "\nName: " + getName()
				+ "\nVorname: " + getVorname() 
				+ "\nGeburtstag: " + getGeburtstag() 
				+ "\nAlter: " + getAlter() 
				+ "\nMatrikelnummer: " + getMatrikelnummer() 
				+ "\nAdresse: " + getAdresse() 
				+ "\naktuelles Semester: " + semester;
	}

}
