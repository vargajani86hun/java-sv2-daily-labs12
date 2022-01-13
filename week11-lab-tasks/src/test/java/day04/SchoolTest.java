package day04;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

class SchoolTest {

    @Test
    void testGetTeacherHoursPerWeek() {
        School school = new School();
        school.readSubjectsFromFile(Path.of("src/main/resources/beosztas.txt"));
        assertEquals(3, school.getTeacherHoursPerWeek("Albatrosz Aladin"));
        assertEquals(2, school.getTeacherHoursPerWeek("Csincsilla Csilla"));
    }

}