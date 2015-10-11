package studentApp;

import java.util.Comparator;

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
