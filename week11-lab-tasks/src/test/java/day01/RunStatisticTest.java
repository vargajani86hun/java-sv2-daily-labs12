package day01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RunStatisticTest {

    RunStatistic runStatistic = new RunStatistic();

    @Test
    void testReadRuns() {
        runStatistic.readRunsFromFile("src/test/resources/running.csv");
        assertEquals(7, runStatistic.getRuns().size());
    }

    @Test
    void testReadRunsWithStream() {
        runStatistic.readRunsFromFileWithStream("src/test/resources/running.csv");
        assertEquals(7, runStatistic.getRuns().size());
    }

    @Test
    void testGetSumOfRunsInMonth() {
        runStatistic.readRunsFromFileWithStream("src/test/resources/running.csv");
        assertEquals(41.2, runStatistic.getSumOfRunsInMonth(2021, 12));
        assertEquals(41.2, runStatistic.getSumOfRunsInMonthWithStream(2021, 12));
    }
}