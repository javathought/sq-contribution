package com.taloti.sq.list;

import java.util.Collections;
import java.util.List;

public class StudentClass {

    private final String name;
    private List<String> students;

    public StudentClass(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    public void setStudents(List<String> students) {
        this.students = Collections.unmodifiableList(students);
    }

    public List<String> students() {
        return students;
    }
}
