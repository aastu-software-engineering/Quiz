package entities;

import java.util.Objects;

public class Question {
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    private String id;
    private String title;
    private int points;

    public Question(String id, String title, int points){
        this.id = id;
        this.title = title;
        this.points = points;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
    @Override
    public String toString() {
        return "Question{" +
                "title='" + title + '\'' +
                ", points=" + points +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Question question)) return false;
        return getPoints() == question.getPoints() && getTitle().equals(question.getTitle());
    }
    @Override
    public int hashCode() {
        return Objects.hash(getTitle(), getPoints());
    }
}
