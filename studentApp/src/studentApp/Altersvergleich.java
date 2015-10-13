package studentApp;

import java.util.Comparator;

/**
 * Vergleicht das Alter zweier Objekte vom Typ Student. Student 1 j�nger als
 * Student 2, wird eine negative Zahl zur�ckgegeben. Sind sie gleich alt, wird
 * die 0 zur�ckgegeben und ist Student 1 �lter eine positive Zahl.
 * 
 * Eine alternative und k�rzere Schreibweise f�r diese Methode w�re wie folgt:
 * 
 * public int compare (Student student1, Student student2) {
 * 		return student1.getAlter() - student2.getAlter();
 * }
 * 
 * @author Henrik Lawall (Matrikelnummer: 1511275)
 *
 */
public class Altersvergleich implements Comparator<Student> {

	public int compare(Student student1, Student student2) {
		if (student1.getAlter() < student2.getAlter()) {
			return -1;
		}
		if (student1.getAlter() == student2.getAlter()) {
			return 0;
		}
		return 1;
	}

}
