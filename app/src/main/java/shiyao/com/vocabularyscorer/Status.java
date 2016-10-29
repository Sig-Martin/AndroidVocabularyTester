package shiyao.com.vocabularyscorer;

/**
 * Created by liushiyao on 10/29/16.
 */
public class Status {
    private int correctNbr;

    private int wrongNbr;

    private int total;

    private double progress;

    private int count;

    private double rate;

    public Status(int total) {
        this.total = total;
        this.progress = 0d;
        this.correctNbr = 0;
        this.wrongNbr = 0;
        this.
    }

    public int getWrongNbr() {
        return wrongNbr;
    }

    public void setWrongNbr(int wrongNbr) {
        this.wrongNbr = wrongNbr;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public int getCorrectNbr() {

        return correctNbr;
    }

    public void setCorrectNbr(int correctNbr) {
        this.correctNbr = correctNbr;
    }
}
