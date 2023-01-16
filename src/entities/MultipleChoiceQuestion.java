package entities;

import java.util.ArrayList;
import java.util.List;

public class MultipleChoiceQuestion extends Question{


    List<String> choices;
    public List<String> getChoices() {
        return choices;
    }

    public void setChoices(List<String> choices) {
        this.choices = choices;
    }
    public MultipleChoiceQuestion(String id, String title, int points, ArrayList<String> choices) {
        super(id, title, points);
        this.choices = choices;
    }

}
