package com.taloti.sq.list;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class StudentClassTest {
    @Test
    void should_create_a_class_with_name() {
        // Given

        // When

        // Then
        assertEquals("6e1", new StudentClass("6e1").toString());
    }

    @Test
    void should_have_a_list_of_students() {
        // Given
        var studentClass = new StudentClass("6e1");
        ArrayList<String> students = new ArrayList<>();
        students.add("Eloise");
        students.add("Gwen");
        students.add("Randy");
        students.add("Linda");
        students.add("Virginia");

        // When
        studentClass.setStudents(students);
        students.add("Laura");

        // Then
        assertTrue(studentClass.students().contains("Virginia"));
        assertFalse(studentClass.students().contains("Laura"));
    }
}