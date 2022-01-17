package ch07.Domain;

public class Subject {

    private String subject_name;
    private int score;

    public String getSubject_name() {
        return subject_name;
    }

    public void setSubject_name(String subject_name) {
        this.subject_name = subject_name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "subject_name='" + subject_name + '\'' +
                ", score=" + score +
                '}';
    }
}
