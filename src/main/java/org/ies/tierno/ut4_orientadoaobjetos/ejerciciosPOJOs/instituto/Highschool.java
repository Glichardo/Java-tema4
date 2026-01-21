package org.ies.tierno.ut4_orientadoaobjetos.ejerciciosPOJOs.instituto;

import java.util.Arrays;
import java.util.Objects;

public class Highschool {
    private String schoolName;
    private Student[] students;

    public Highschool(String schoolName, Student[] students) {
        this.schoolName = schoolName;
        this.students = students;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Highschool that = (Highschool) o;
        return Objects.equals(schoolName, that.schoolName) && Objects.deepEquals(students, that.students);
    }

    @Override
    public int hashCode() {
        return Objects.hash(schoolName, Arrays.hashCode(students));
    }
}
