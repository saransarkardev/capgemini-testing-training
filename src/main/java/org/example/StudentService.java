package org.example;

import java.util.ArrayList;
import java.util.List;

public class StudentService {

    private List<Student> students = new ArrayList<>();

    public List<Student> getStudents() {
        return students;
    }

    public void addStudent(Student obj) {
        students.add(obj);
    }

    public Student getStudentId(int studentId) {
//        for (Student s : students) {
//            if (s.getId() == studentId) {
//                return s;
//            }
//        }
//        return null;

        return students.stream()
                .filter(studentObj -> studentObj.getId() == studentId)
                .findFirst()
                .orElse(null);
    }
}
