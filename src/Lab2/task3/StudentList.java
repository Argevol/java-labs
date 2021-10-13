package Lab2.task3;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class StudentList {
    private List<Student> studentList;

    public StudentList(final List<Student> studentList) {
        this.studentList = studentList;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(final List<Student> studentList) {
        this.studentList = studentList;
    }

    public void printBestStudent() {
        double markAver = 0.0;
        final ArrayList<Double> arrayAver = new ArrayList<Double>(getStudentList().size());

        for (final Student student : getStudentList()) {
            double markAverElem = 0.0;
            for (final Mark mark : student.getMarksOfSubjects()) {
                markAverElem += mark.getMark();
            }

            markAverElem /= student.getMarksOfSubjects().size();
            arrayAver.add(markAverElem);

            if (markAver < markAverElem) {
                markAver = markAverElem;
            }
        }

        System.out.println(getStudentList().get(arrayAver.indexOf(markAver)));
    }
}
