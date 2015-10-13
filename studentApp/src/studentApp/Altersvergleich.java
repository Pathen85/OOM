package studentApp;

import java.util.Comparator;

/**
 * Vergleicht das Alter zweier Objekte vom Typ Student. Student 1 jünger als
 * Student 2, wird eine negative Zahl zurückgegeben. Sind sie gleich alt, wird
 * die 0 zurückgegeben und ist Student 1 älter eine positive Zahl.
 * 
 * Eine alternative und kürzere Schreibweise für diese Methode wäre wie folgt:
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
