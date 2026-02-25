package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StudentServiceTest {

    @Test
    public void getStudentsTest() {
        StudentService studentService = new StudentService();

        Student s1 = new Student(1, "Saran");

        List<Student> listOfStudents =  studentService.getStudents();
        studentService.addStudent(s1);

        boolean actualResult = listOfStudents.isEmpty();

//        assertTrue(actualResult);

//        assertTrue(() -> actualResult);

//        assertTrue(actualResult, "List of student Should be empty.");

//        assertTrue(() -> actualResult, "List of student Should be empty.");

//        assertTrue(actualResult, () -> "List of student Should be empty.");

//        assertTrue(() -> actualResult, () -> "List of student Should be empty.");
    }

    @Test
    public void getStudentsTestUsingAssertFalse() {

        StudentService studentService = new StudentService();

        Student s1 = new Student(12, "Rahul");

        List<Student> listOfStudents =  studentService.getStudents();
        studentService.addStudent(s1);

        boolean actualResult = listOfStudents.isEmpty();

//        assertFalse(actualResult);
//        assertFalse(actualResult, "Student list should not be empty.");
//        assertFalse(() -> actualResult);
//        assertFalse(() -> actualResult, "Student list should not be empty.");
        assertFalse(() -> actualResult, () -> "Student list should not be empty.");
    }


    @Test
    public void getStudentByIdTestUsingAssertNull() {
        StudentService studentService = new StudentService();

        Student s1 = new Student(1, "King");
        studentService.addStudent(s1);

        Student actualObject = studentService.getStudentId(1);

//        assertNull(actualObject);

//        assertNull(actualObject, "Student object is not null.");

        // assertNull(Object obj, Supplier<String> messageSupplier) --> Syntax

        assertNull(actualObject, () -> "Student object is not null.");
    }

    @Test
    public void getStudentsByIdTestUsingAssertNotNull() {
        StudentService studentService = new StudentService();

        Student s1 = new Student(1, "King");
        studentService.addStudent(s1);

        Student actualObject = studentService.getStudentId(1);

//        assertNotNull(actualObject);
//        assertNotNull(actualObject, "Student object is null.");
        assertNotNull(actualObject, () -> "Student object is null.");
    }

    @Test
    public void getStudentByIdTestUsingAssertEquals() {
        StudentService studentService = new StudentService();

        Student s1 = new Student(1, "Saran");
        studentService.addStudent(s1);

        Student actualObject = studentService.getStudentId(1);

//        assertEquals(1, actualObject.getId());
//        assertEquals("Saran", actualObject.getName());

//        assertEquals(s1, actualObject);

//        assertEquals(1, actualObject.getId(), "Student Id is not equal");

        assertEquals("Saran", actualObject.getName(), () -> "Student name is not equal");



    }

}