package entities;

import java.util.List;

public class Quiz {

    String code;
    List<Question> questions;
    public void addQuestion(Question q){
        this.questions.add(q);
    }
    public List<Question> getQuestions(){
        return this.questions;
    }
    public void editQuestion(String id, String title){
        Question p = null;
        for(Question q: questions){
            if(q.getId().equals(id)){
                p = q;
                break;
            }
        }
        if(p == null){
            return;
        }else {
            p.setTitle(title);
        }
    }
    public void removeQuestion(String id){
        for(Question q: questions){
            if(q.getId().equals(id)){
                questions.remove(q);
                break;
            }
        }
    }
    @Override
    public String toString() {
        return "Quiz{" +
                "code='" + code + '\'' +
                ", questions=" + questions.toString() +
                '}';
    }

}
