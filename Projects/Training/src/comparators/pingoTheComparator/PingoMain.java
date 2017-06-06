package comparators.pingoTheComparator;

import interfaces.StartProgramInterface;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * Created by thesinding on 6/6/17.
 */
public class PingoMain implements StartProgramInterface {
    @Override
    public void startProgram() {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(1, "Simon Sinding", 25));
        students.add(new Student(2, "Jonas Alslev", 22));
        students.add(new Student(3, "Jakob Wilff", 26));

        System.out.println("Sorting by name");
        Collections.sort(students, new NameComparator());
        for(Student s : students) {
            System.out.println(" Name: " + s.name + " Age: " + s.age + " Student Number: " + s.rollNo);
        }
        System.out.println();

        System.out.println("Sorting by age");
        Collections.sort(students, new AgeComparator());
        for(Student s : students) {
            System.out.println(" Name: " + s.name + " Age: " + s.age + " Student Number: " + s.rollNo);
        }

    }
}
