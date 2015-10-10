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
		super(name, vorname, geburtstag, matrikelnummer, adresse, null);
		this.semester = semester;
	}

}
