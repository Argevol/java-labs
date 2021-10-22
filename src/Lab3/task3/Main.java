package Lab3.task3;

import Lab2.task3.Mark;
import Lab2.task3.Specialty;
import Lab2.task3.Student;
import Lab2.task3.Subject;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
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

        final Student student1 = new Student("Максим", "Данилюк", 2, Specialty.IT, subjectList, randomize(subjectList));
        final Student student2 = new Student("Андрій", "Сухорівський", 4, Specialty.SA, subjectList, randomize(subjectList));
        final Student student3 = new Student("Ігор", "Феняк", 8, Specialty.SE, subjectList, randomize(subjectList));
        final Student student4 = new Student("Юрій", "Шевченко", 2, Specialty.IT, subjectList, randomize(subjectList));

        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);

        System.out.println(studentList);

        System.out.println(casting(studentList));

        System.out.println(deleteAver(studentList));

        System.out.println(sorting(studentList));

        System.out.println(addLineToSurname(studentList));
    }

    public static List<StudentSimple> casting(final List<Student> studentList) {
        return studentList.stream()
                .map(student -> new StudentSimple(student.getName(), student.getSurname(), student.getId()))
                .collect(Collectors.toList());
    }

    public static List<Student> deleteAver(final List<Student> studentList) {
        return studentList.stream()
                .filter(student -> (student.getMarksOfSubjects().stream()
                        .mapToInt(Mark::getMark)).average().orElse(0) > 3)
                .collect(Collectors.toList());
    }

    public static List<String> addLineToSurname(final List<Student> studentList){
        return studentList.stream()
                .map(Student::getSurname)
                .reduce((a, b) -> a + "-" + b)
                .stream().toList();
    }

    public static List<Student> sorting(final List<Student> studentList) {
        return studentList.stream()
                .sorted((o1, o2) -> o1.getName().equals(o2.getName()) ?
                        o1.getSurname().compareTo(o2.getSurname()) :
                        o1.getName().compareTo(o2.getName()))
                .collect(Collectors.toList());
    }

    public static List<Mark> randomize(final List<Subject> subjectList) {
        return subjectList.stream()
                .map(subject -> new Mark((int) (Math.random() * (12 - 1) + 1)))
                .collect(Collectors.toList());
    }
}
