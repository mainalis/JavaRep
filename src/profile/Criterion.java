package profile;

import arrays.Scoreable;

/**
 * Created by SushillM on 13/08/2015.
 */
public class Criterion implements Scoreable {
    private Weight weight;
    private Answer answer;
    private int score;

    public Criterion(Answer answer, Weight weight) {
        this.weight = weight;
        this.answer = answer;
    }

    public Answer getAnswer() { return answer; }
    public Weight getWeight() { return weight; }

    public void setScore(int score) { this.score = score; }

    @Override
    public int getScore() {
        return score;
    }
    // public int  getScore() { return score; }
}
