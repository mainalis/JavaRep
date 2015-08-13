package profile;

/**
 * Created by SushillM on 13/08/2015.
 */
public enum Weight {
    MustMatch(Integer.MAX_VALUE),
    VeryImportant(5000),
    Inportant(1000),
    WouldPrefer(100),
    DontCare(0);

    private int value;

    Weight(int value) { this.value = value; }
    public int getValue() { return  value; }
}
