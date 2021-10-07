package Lab2.task3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(final String[] args) {
        final List<Subject> subjectList = new ArrayList<>();

        final Subject english = new Subject("English");
        final Subject mathematics = new Subject("Mathematics");
        final Subject physics = new Subject("Physics");

        subjectList.add(english);
        subjectList.add(mathematics);
        subjectList.add(physics);

        System.out.println(subjectList);

        final Student student = new Student("Maksym", "Danyliuk", 2, id(),Student.Specialty.AL, subjectList, randomize(subjectList));
        System.out.println(student);

    }

    public static List<Mark> randomize(final List<Subject> subjectList){
        final List<Mark> markList = new ArrayList<>();

        for (int i = 0; i < subjectList.size(); i++) {
            final int num = (int) (Math.random() * (12 - 1) + 1);
            final Mark mark = new Mark(num);
            markList.add(mark);
        }

        return markList;
    }

    public static int id(){
        return (int) (Math.random() * (1000 - 0) + 0);
    }
}
