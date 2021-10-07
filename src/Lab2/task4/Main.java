package Lab2.task4;

import Lab2.task3.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(final String[] args) {
        final List<Subject> subjectList = new ArrayList<>();

        final Subject english = new Subject("English");
        final Subject mathematics = new Subject("Mathematics");
        final Subject physics = new Subject("Physics");
        final Subject geography = new Subject("Geography");

        subjectList.add(english);
        subjectList.add(mathematics);
        subjectList.add(physics);
        subjectList.add(geography);

        System.out.println(subjectList);

        final List<Student> studentList = new ArrayList<>();

        final Student student1 = new Student("Maksym", "Danyliuk", 2, Specialty.IT, subjectList, randomize(subjectList));
        final Student student2 = new Student("Maria", "Suhorivska", 4, Specialty.SA, subjectList, randomize(subjectList));
        final Student student3 = new Student("Igor", "Fenyak", 8, Specialty.SE, subjectList, randomize(subjectList));

        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);

        System.out.println(studentList);

        final Subject history = new Subject("History");

        studentList.get(0).addSubject(history);

        for(final Student student : studentList){
            student.addMark();
        }

        System.out.println(studentList);

        for(final Student student : studentList){
            student.printMarks();
        }

        final StudentList studentListClass = new StudentList(studentList);

        studentListClass.printBestStudent();

        student3.printMap(history);
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
}
