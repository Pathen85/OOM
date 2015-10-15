package studentApp;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

/**
 * Klasse in der sich, die main() befindet.
 * 
 * @author Henrik Lawall (Matrikelnummer: 1511275)
 *
 */

public class StudentApp {

	/**
	 * Berechnet das Durchschnittsalter aller Studenten
	 * 
	 * @param studenten
	 * @return Summe des Alters aller Studenten geteilt durch die Anzahl der
	 *         Studenten
	 */
	public static double durchschnittsalter(List<Student> studenten) {
		double alter = 0;
		for (Student student : studenten) {
			alter += student.getAlter();
		}

		return alter / studenten.size();
	}

	/**
	 * Main-Methode des Programms, in dem die Objekte erzeugt werden und der
	 * Liste "studenten" hinzugefügt werden.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		List<Student> studenten = new ArrayList<Student>();

		Adresse adresse1 = new Adresse(54675, "Viernheim", "Kartoffelgasse", 13);
		Adresse adresse2 = new Adresse(52355, "Bruehl", "Blumenweg", 9);
		Adresse adresse3 = new Adresse(10014, "New York City", "Hudson Street", 541);

		EingeschriebenerStudent karl = new EingeschriebenerStudent("Karl", "Simon", LocalDate.of(1993, 8, 23), 1234567,
				adresse1, LocalDate.of(2015, 3, 1));
		EingeschriebenerStudent guerkchen = new EingeschriebenerStudent("Guerkchen", "Aylin", LocalDate.of(1994, 4, 27),
				1512068, adresse2, LocalDate.of(2015, 3, 1));
		Gaststudent li = new Gaststudent("Li", "Mohammed", LocalDate.of(1990, 1, 30), 1354355, adresse3, 4);
		
		//ohne Adresse
		Gaststudent white = new Gaststudent("White", "James", LocalDate.of(1992, 10, 12), 1241244, 2);

		studenten.add(karl);
		studenten.add(guerkchen);
		studenten.add(li);
		studenten.add(white);

		// Sortierung der Liste "studenten" nach dem Alter der Studenten
		Collections.sort(studenten, new Altersvergleich());

		// Ausgabe des Durchschnittsalters und aller bekannten Informationen
		// über die Studenten mit Hilfe der toString-Methode.
		System.out.println("Durchschnittsalter aller Studenten: " + durchschnittsalter(studenten) + " Jahre");
		for (Student student : studenten) {
			System.out.println(student.toString());
		}
	}
}
