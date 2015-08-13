package profile;

/**
 * Created by SushillM on 13/08/2015.
 */
public class Answer {
    private int index;
    private Question question;

    public Answer( Question question, int i) {
        this.question = question;
        this.index = i;
    }

    public Answer(Question characterstics, String matchingValue) {
        this.question = question;
        this.index = characterstics.indexOf(matchingValue);
    }

    public String getQuestionText() {
        return question.getText();
    }

    @Override
    public String toString() {
        return String.format("%s %s", question.getText(), question.getAnswerChoice(index));
    }

    public boolean match(int expected) {
        return question.match(expected, index);
    }

    public boolean match(Answer otherAnswer) {
        return question.match(index, otherAnswer.index);
    }

    public Question getCharacterstic() {
        return question;
    }
}
