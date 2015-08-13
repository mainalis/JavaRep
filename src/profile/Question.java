package profile;

/**
 * Created by SushillM on 13/08/2015.
 */
public abstract class Question {
    private String text;
    private String[] answerChoices;
    private int id;

    public Question(int id, String text, String[] answerChoices) {
        this.id = id;
        this.answerChoices = answerChoices;
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public String getAnswerChoice(int index) {
        return  answerChoices[index];
    }

    public boolean match(Answer answer) {
        return false;
    }

    abstract public boolean match(int expected, int actual);

    public int indexOf(String matchedAnswer) {
        for(int i = 0; i < answerChoices.length; i++) {
            if(answerChoices[i].equals(matchedAnswer)) {
                return i;
            }
        }
        return -1;
    }
}
