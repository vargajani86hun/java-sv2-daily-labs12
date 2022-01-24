package day01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


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

    public void readRunsFromFile(String path) {
        try (BufferedReader br = Files.newBufferedReader(Path.of(path))) {
            String line;
            br.readLine();
            while ((line = br.readLine()) != null) {
                String[] values = line.split(" km;");
                runs.add(new RunNote(Double.parseDouble(values[0]),
                        LocalDate.parse(values[1])));
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("No such file!", ioe);
        }
    }

    public void readRunsFromFileWithStream(String path) {
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            br.readLine();
            runs = br.lines()
                    .map(line -> line.split(" km;"))
                    .map(values -> new RunNote(Double.parseDouble(values[0]),
                            LocalDate.parse(values[1])))
                    .toList();
        } catch (IOException ioe) {
            throw new IllegalStateException("No such file!", ioe);
        }
    }

    public List<RunNote> getRuns() {
        return new ArrayList<>(runs);
    }
}
