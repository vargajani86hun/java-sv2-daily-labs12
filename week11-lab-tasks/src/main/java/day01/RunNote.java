package day01;

import java.time.LocalDate;
import java.util.Objects;
import java.util.Scanner;

public class RunNote {
    private double distance;
    private LocalDate runAt;

    public RunNote(double distance, LocalDate runAt) {
        this.distance = distance;
        this.runAt = runAt;
    }

    public double getDistance() {
        return distance;
    }

    public LocalDate getRunAt() {
        return runAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RunNote)) return false;
        RunNote runNote = (RunNote) o;
        return Double.compare(runNote.distance, distance) == 0 && Objects.equals(runAt, runNote.runAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(distance, runAt);
    }

    public static RunNote parseRunNote(String csvLine) {
        Scanner sc = new Scanner(csvLine);
        return new RunNote(sc.nextDouble(), LocalDate.of(sc.nextInt(), sc.nextInt(), sc.nextInt()));
    }
}
