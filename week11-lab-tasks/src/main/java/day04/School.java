package day04;


import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class School {
    private List<SubjectClassification> subjects = new ArrayList<>();

    public void readSubjectsFromFile(Path path) {
        try (Scanner sc = new Scanner(path)) {
            while (sc.hasNextLine()) {
                String name = sc.nextLine();
                String subject = sc.nextLine();
                String classAt = sc.nextLine();
                int hours = Integer.parseInt(sc.nextLine());
                subjects.add(new SubjectClassification(name, subject,
                        classAt, hours));
            }
        }
        catch (IOException ioe) {
            throw new IllegalStateException("No such file!");
        }
        catch (NumberFormatException nfe) {
            throw new IllegalArgumentException("Wrong value to hours");
        }
    }

    public int getTeacherHoursPerWeek(String name) {
        int  sum = 0;
        for(SubjectClassification actual : subjects) {
            if (actual.getName().equals(name)) {
                sum += actual.getHoursPerWeek();
            }
        }
        return sum;
    }
}
