package day04;

public class SubjectClassification {
    private String name;
    private String subject;
    private String classAt;
    private int hoursPerWeek;

    public SubjectClassification(String name, String subject,
                                 String classAt, int hoursPerWeek) {
        this.name = name;
        this.subject = subject;
        this.classAt = classAt;
        this.hoursPerWeek = hoursPerWeek;
    }

    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }

    public String getClassAt() {
        return classAt;
    }

    public int getHoursPerWeek() {
        return hoursPerWeek;
    }
}
