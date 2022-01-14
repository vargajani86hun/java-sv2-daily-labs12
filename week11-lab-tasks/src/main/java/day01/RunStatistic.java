package day01;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RunStatistic {
    private List<RunNote> runs = new ArrayList<>();

    public double getSumOfRunsInMonth(int year, int month) {
        double sum = 0;
        for (RunNote actual : runs) {
            if (actual.getRunAt().getYear() == year && actual.getRunAt().getMonthValue() == month) {
                sum += actual.getDistance();
            }
        }
        return sum;
    }

    public void readRunsFromFile(Path path) {
//        try (Scanner sc = new Scanner()) {
//
//        }
//        catch (IOException ioe) {
//
//        }
    }

}
