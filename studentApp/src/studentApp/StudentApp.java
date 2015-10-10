package studentApp;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

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
		
		studenten.add(
				new Student("Karl", "Simon", LocalDate.of(1993, 8, 23), 1234567, adresse1, LocalDate.of(2015, 3, 1)));
		studenten.add(new Student("Guerkchen", "Aylin", LocalDate.of(1994, 4, 27), 1512068, adresse2,
				LocalDate.of(2015, 3, 1)));
		
		System.out.println(durchschnittsalter(studenten));
	}
}
