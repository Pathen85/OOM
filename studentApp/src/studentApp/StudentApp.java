package studentApp;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class StudentApp {

	public static double durchschnittsalter(List<Student> studenten) {
		double alter = 0;
		for (Student student : studenten) {
			alter += student.getAlter();
		}

		return alter / studenten.size();
	}

	public static void main(String[] args) {
		List<Student> studenten = new ArrayList<Student>();

		Adresse adresse1 = new Adresse(54675, "Viernheim", "Kartoffelgasse", 13);
		Adresse adresse2 = new Adresse(52355, "Bruehl", "Blumenweg", 9);
		Adresse adresse3 = new Adresse(10014, "New York City", "Hudson Street", 541);

		EingeschriebenerStudent karl = new EingeschriebenerStudent("Karl", "Simon", LocalDate.of(1993, 8, 23), 1234567,
				adresse1, LocalDate.of(2015, 3, 1));
		EingeschriebenerStudent guerkchen = new EingeschriebenerStudent("Guerkchen", "Aylin", LocalDate.of(1994, 4, 27),
				1512068, adresse2, LocalDate.of(2015, 3, 1));
		Gaststudent white = new Gaststudent("White", "James", LocalDate.of(1992, 10, 12), 1241244, adresse3, 2);

		studenten.add(karl);
		studenten.add(guerkchen);
		studenten.add(white);

		Collections.sort(studenten, new Altersvergleich());

		System.out.println("Durchschnittsalter aller Studenten: " + durchschnittsalter(studenten) + " Jahre");
		for (Student student : studenten) {
			System.out.println(student.toString());
		}
	}
}
