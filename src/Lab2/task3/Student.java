package Lab2.task3;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

public class Student {
    private String name;
    private String surname;
    private int course;
    private int id;
    Specialty specialty;
    private List<Subject> subjects;
    private List<Mark> marksOfSubjects;

    public Student(final String name, final String surname, final int course, final int id, final Specialty specialty, final List<Subject> subjects, final List<Mark> marksOfSubjects) {
        this.name = name;
        this.surname = surname;
        this.course = course;
        this.id = id;
        this.specialty = specialty;
        this.subjects = subjects;
        this.marksOfSubjects = marksOfSubjects;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(final String surname) {
        this.surname = surname;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(final int course) {
        this.course = course;
    }

    public int getId() {
        return id;
    }

    public void setId(final int id) {
        this.id = id;
    }

    public Specialty getSpecialty() {
        return specialty;
    }

    public void setSpecialty(final Specialty specialty) {
        this.specialty = specialty;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(final List<Subject> subjects) {
        this.subjects = subjects;
    }

    public List<Mark> getMarksOfSubjects() {
        return marksOfSubjects;
    }

    public void setMarksOfSubjects(final List<Mark> marksOfSubjects) {
        this.marksOfSubjects = marksOfSubjects;
    }

    public void addSubject(final Subject subject) {
        this.getSubjects().add(subject);
    }

    public void addMark() {
        final int num = ((int) (Math.random() * (12 - 1) + 1));
        final Mark mark = new Mark(num);
        this.getMarksOfSubjects().add(mark);
    }

    public void printMarks() {
        System.out.println(this.getMarksOfSubjects());
    }

    public void printMap(final Subject subject) {
        final Map<Integer, Mark> studentMap = new TreeMap<>();
        final int indexOfMark = this.getSubjects().indexOf(subject);
        studentMap.put(this.getId(), this.getMarksOfSubjects().get(indexOfMark));
        System.out.println(studentMap);
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        final Student student = (Student) o;
        return getCourse() == student.getCourse() && getId() == student.getId() && Objects.equals(getName(), student.getName())
                && Objects.equals(getSurname(), student.getSurname()) && getSpecialty() == student.getSpecialty()
                && Objects.equals(getSubjects(), student.getSubjects()) && Objects.equals(getMarksOfSubjects(), student.getMarksOfSubjects());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSurname(), getCourse(), getId(), getSpecialty(), getSubjects(), getMarksOfSubjects());
    }

    @Override
    public String toString() {
        return "Student{" + '\n' +
                "Name: " + getName() + '\n' +
                "Surname: " + getSurname() + '\n' +
                "Course: " + getCourse() + '\n' +
                "Id card: " + getId() + '\n' +
                "Specialty: " + getSpecialty() + '\n' +
                getSubjects().toString() + '\n' +
                getMarksOfSubjects().toString() + '\n' +
                "}";
    }

    public enum Specialty {
        IT("Informational Technologies"),
        SE("Software Engineering"),
        CS("Computer Science"),
        AL("Applied Linguistics"),
        SA("System Analyze");

        private String description;

        Specialty(final String description) {
            this.description = description;
        }

        public String getDescription() {
            return description;
        }
    }
}
